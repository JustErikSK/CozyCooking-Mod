package net.withrage.cozycooking.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.recipe.custom.ItemPreservingShapelessRecipeSerializer;

public class ModRecipes {

    public static final RecipeType<ToasterRecipe> TOASTER_TYPE = new RecipeType<>() {
        @Override
        public String toString() {
            return CozyCooking.MOD_ID + ":toasting";
        }
    };

    public static final RecipeSerializer<ToasterRecipe> TOASTER_SERIALIZER =
            new ToasterRecipeSerializer();

    public static final RecipeSerializer<?> ITEM_PRESERVING_SHAPELESS_SERIALIZER =
            Registry.register(
                    BuiltInRegistries.RECIPE_SERIALIZER,
                    new ResourceLocation(CozyCooking.MOD_ID, "item_preserving_shapeless"),
                    new ItemPreservingShapelessRecipeSerializer()
            );

    public static void registerRecipes() {
        CozyCooking.LOGGER.info(
                "Registering custom recipe types for " + CozyCooking.MOD_ID
        );

        Registry.register(
                BuiltInRegistries.RECIPE_TYPE,
                new ResourceLocation(CozyCooking.MOD_ID, "toasting"),
                TOASTER_TYPE
        );

        Registry.register(
                BuiltInRegistries.RECIPE_SERIALIZER,
                new ResourceLocation(CozyCooking.MOD_ID, "toasting"),
                TOASTER_SERIALIZER
        );
    }
}