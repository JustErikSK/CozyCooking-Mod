package net.withrage.cozycooking.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.ModBlocks;
import net.withrage.cozycooking.recipe.ModRecipes;
import net.withrage.cozycooking.recipe.ToasterRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@JeiPlugin
public class CozyCookingJEIPlugin implements IModPlugin {

    private static final ResourceLocation ID =
            new ResourceLocation(CozyCooking.MOD_ID, "jei_plugin");

    static {
        CozyCooking.LOGGER.info("JEI PLUGIN CLASS LOADED");
    }

    public CozyCookingJEIPlugin() {
        CozyCooking.LOGGER.info("JEI PLUGIN INSTANCE CREATED");
    }

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper =
                registration.getJeiHelpers().getGuiHelper();

        registration.addRecipeCategories(
                new ToasterRecipeCategory(guiHelper)
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        Minecraft client = Minecraft.getInstance();

        if (client.getConnection() == null) {
            return;
        }

        RecipeManager manager =
                client.getConnection().getRecipeManager();

        List<ToasterRecipe> recipes =
                manager.getAllRecipesFor(ModRecipes.TOASTER_TYPE);

        CozyCooking.LOGGER.info(
                "Registering {} toaster recipes into JEI",
                recipes.size()
        );

        registration.addRecipes(
                ModJEIRecipeTypes.TOASTING,
                recipes
        );
    }

    @Override
    public void registerRecipeCatalysts(
            IRecipeCatalystRegistration registration
    ) {
        registration.addRecipeCatalyst(
                new ItemStack(ModBlocks.TOASTER),
                ModJEIRecipeTypes.TOASTING
        );
    }
}