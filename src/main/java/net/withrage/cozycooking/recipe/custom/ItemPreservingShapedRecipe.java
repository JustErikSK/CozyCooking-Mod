package net.withrage.cozycooking.recipe.custom;

import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.withrage.cozycooking.CozyCooking;

public class ItemPreservingShapedRecipe extends ShapedRecipe {

    private static final TagKey<Item> NON_CONSUMED_ITEMS =
            TagKey.create(
                    Registries.ITEM,
                    new ResourceLocation(CozyCooking.MOD_ID, "non_consumable_items")
            );

    public ItemPreservingShapedRecipe(ShapedRecipe base) {
        super(
                base.getId(),
                base.getGroup(),
                base.category(),
                base.getWidth(),
                base.getHeight(),
                base.getIngredients(),
                base.getResultItem(RegistryAccess.EMPTY)
        );
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingContainer inventory) {
        NonNullList<ItemStack> remainders =
                NonNullList.withSize(inventory.getContainerSize(), ItemStack.EMPTY);

        for (int i = 0; i < inventory.getContainerSize(); i++) {
            ItemStack stack = inventory.getItem(i);

            if (stack.isEmpty()) {
                continue;
            }

            Item item = stack.getItem();

            if (item.hasCraftingRemainingItem()) {
                remainders.set(
                        i,
                        new ItemStack(item.getCraftingRemainingItem())
                );
                continue;
            }

            if (stack.is(NON_CONSUMED_ITEMS)) {
                ItemStack copy = stack.copy();
                copy.setCount(1);
                remainders.set(i, copy);
            }
        }

        return remainders;
    }
}