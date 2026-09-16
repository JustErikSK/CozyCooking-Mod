package net.withrage.cozycooking.recipe.custom;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

public class ItemPreservingShapedRecipeSerializer
        implements RecipeSerializer<ItemPreservingShapedRecipe> {

    @Override
    public ItemPreservingShapedRecipe fromJson(
            ResourceLocation id,
            JsonObject json
    ) {
        ShapedRecipe base = RecipeSerializer.SHAPED_RECIPE.fromJson(id, json);
        return new ItemPreservingShapedRecipe(base);
    }

    @Override
    public ItemPreservingShapedRecipe fromNetwork(
            ResourceLocation id,
            FriendlyByteBuf buf
    ) {
        ShapedRecipe base = RecipeSerializer.SHAPED_RECIPE.fromNetwork(id, buf);
        return new ItemPreservingShapedRecipe(base);
    }

    @Override
    public void toNetwork(
            FriendlyByteBuf buf,
            ItemPreservingShapedRecipe recipe
    ) {
        RecipeSerializer.SHAPED_RECIPE.toNetwork(buf, recipe);
    }
}