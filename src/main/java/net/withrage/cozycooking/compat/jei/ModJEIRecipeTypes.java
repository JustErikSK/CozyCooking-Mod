package net.withrage.cozycooking.compat.jei;

import mezz.jei.api.recipe.RecipeType;
import net.withrage.cozycooking.recipe.ToasterRecipe;

public class ModJEIRecipeTypes {
    public static final RecipeType<ToasterRecipe> TOASTING =
            RecipeType.create("cozyingredients", "toasting", ToasterRecipe.class);
}
