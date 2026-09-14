package net.withrage.cozycooking.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.withrage.cozycooking.block.screen.ToasterScreenHandler;
import net.withrage.cozycooking.recipe.ModRecipes;
import net.withrage.cozycooking.recipe.ToasterRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ToasterBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    private final NonNullList<ItemStack> inventory =
            NonNullList.withSize(2, ItemStack.EMPTY);

    private static final int INPUT_SLOT = 1;
    private static final int OUTPUT_SLOT = 0;

    protected final ContainerData data;

    private int progress = 0;
    private int maxProgress = 72;

    public ToasterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TOASTER, pos, state);

        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ToasterBlockEntity.this.progress;
                    case 1 -> ToasterBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> ToasterBlockEntity.this.progress = value;
                    case 1 -> ToasterBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayer player, FriendlyByteBuf buf) {
        buf.writeBlockPos(this.worldPosition);
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Toaster");
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);

        ContainerHelper.saveAllItems(tag, inventory);
        tag.putInt("toaster.progress", progress);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);

        ContainerHelper.loadAllItems(tag, inventory);
        progress = tag.getInt("toaster.progress");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(
            int syncId,
            Inventory playerInventory,
            Player player
    ) {
        return new ToasterScreenHandler(
                syncId,
                playerInventory,
                this,
                this.data
        );
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        if (level.isClientSide) {
            return;
        }

        Optional<ToasterRecipe> recipe = getCurrentRecipe();

        if (isOutputSlotEmptyOrReceivable()) {
            if (recipe.isPresent()
                    && canInsertItemIntoOutputSlot(
                    recipe.get()
                            .getResultItem(level.registryAccess())
                            .getItem()
            )) {

                increaseCraftProgress();
                setChanged(level, pos, state);

                if (hasCraftingFinished()) {
                    craftItem(recipe.get());
                    resetProgress();
                }
            } else {
                resetProgress();
            }
        } else {
            resetProgress();
            setChanged(level, pos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem(ToasterRecipe recipe) {
        if (level == null) {
            return;
        }

        this.removeItem(INPUT_SLOT, 1);

        ItemStack result = recipe.getResultItem(level.registryAccess());

        this.setItem(
                OUTPUT_SLOT,
                new ItemStack(
                        result.getItem(),
                        getItem(OUTPUT_SLOT).getCount() + result.getCount()
                )
        );
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private Optional<ToasterRecipe> getCurrentRecipe() {
        if (level == null) {
            return Optional.empty();
        }

        return level.getRecipeManager()
                .getRecipeFor(ModRecipes.TOASTER_TYPE, this, level);
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getItem(OUTPUT_SLOT).getItem() == item
                || this.getItem(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getItem(OUTPUT_SLOT).getCount() + result.getCount()
                <= this.getItem(OUTPUT_SLOT).getMaxStackSize();
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getItem(OUTPUT_SLOT).isEmpty()
                || this.getItem(OUTPUT_SLOT).getCount()
                < this.getItem(OUTPUT_SLOT).getMaxStackSize();
    }
}