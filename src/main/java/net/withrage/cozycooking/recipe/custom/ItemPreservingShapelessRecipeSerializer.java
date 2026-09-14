package net.withrage.cozycooking.recipe.custom;

import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;

public class ItemPreservingShapelessRecipeSerializer
        implements RecipeSerializer<ItemPreservingShapelessRecipe> {

    @Override
    public ItemPreservingShapelessRecipe fromJson(
            ResourceLocation id,
            JsonObject json
    ) {
        ShapelessRecipe base = RecipeSerializer.SHAPELESS_RECIPE.fromJson(id, json);

        return new ItemPreservingShapelessRecipe(
                base.getId(),
                base.getGroup(),
                base.category(),
                base.getResultItem(RegistryAccess.EMPTY),
                base.getIngredients()
        );
    }

    @Override
    public ItemPreservingShapelessRecipe fromNetwork(
            ResourceLocation id,
            FriendlyByteBuf buf
    ) {
        ShapelessRecipe base = RecipeSerializer.SHAPELESS_RECIPE.fromNetwork(id, buf);

        return new ItemPreservingShapelessRecipe(
                base.getId(),
                base.getGroup(),
                base.category(),
                base.getResultItem(RegistryAccess.EMPTY),
                base.getIngredients()
        );
    }

    @Override
    public void toNetwork(
            FriendlyByteBuf buf,
            ItemPreservingShapelessRecipe recipe
    ) {
        RecipeSerializer.SHAPELESS_RECIPE.toNetwork(buf, recipe);
    }
}