package net.withrage.cozycooking.recipe;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

public class ToasterRecipeSerializer implements RecipeSerializer<ToasterRecipe> {

    @Override
    public ToasterRecipe fromJson(ResourceLocation id, JsonObject json) {
        Ingredient input = Ingredient.fromJson(
                GsonHelper.getAsJsonObject(json, "input")
        );

        ItemStack output = ShapedRecipe.itemStackFromJson(
                GsonHelper.getAsJsonObject(json, "output")
        );

        return new ToasterRecipe(id, input, output);
    }

    @Override
    public ToasterRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        Ingredient input = Ingredient.fromNetwork(buf);
        ItemStack output = buf.readItem();

        return new ToasterRecipe(id, input, output);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, ToasterRecipe recipe) {
        recipe.getInput().toNetwork(buf);
        buf.writeItem(recipe.getResultItem(null));
    }
}