package net.withrage.cozycooking.recipe.custom;

import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.Level;
import net.withrage.cozycooking.CozyCooking;

public class ItemPreservingShapelessRecipe extends ShapelessRecipe {

    public static final TagKey<Item> NON_CONSUMED_ITEMS = TagKey.create(
            Registries.ITEM,
            new ResourceLocation(CozyCooking.MOD_ID, "non_consumable_items")
    );

    public ItemPreservingShapelessRecipe(
            ResourceLocation id,
            String group,
            CraftingBookCategory category,
            ItemStack result,
            NonNullList<Ingredient> ingredients
    ) {
        super(id, group, category, result, ingredients);
    }

    @Override
    public boolean matches(CraftingContainer inventory, Level level) {
        return super.matches(inventory, level);
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

            if (stack.is(NON_CONSUMED_ITEMS)) {
                remainders.set(i, stack.copy());
                continue;
            }

            Item item = stack.getItem();

            if (item.hasCraftingRemainingItem()) {
                remainders.set(
                        i,
                        new ItemStack(item.getCraftingRemainingItem())
                );
            }
        }

        return remainders;
    }
}