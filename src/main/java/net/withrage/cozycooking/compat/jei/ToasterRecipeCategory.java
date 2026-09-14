package net.withrage.cozycooking.compat.jei;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.ModBlocks;
import net.withrage.cozycooking.recipe.ToasterRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ToasterRecipeCategory implements IRecipeCategory<ToasterRecipe> {

    private static final ResourceLocation GUI_TEX =
            new ResourceLocation(CozyCooking.MOD_ID, "textures/gui/toaster_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic arrowStatic;
    private final IDrawableAnimated arrowAnimated;

    public ToasterRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(
                GUI_TEX,
                0,
                0,
                176,
                80
        );

        this.icon = guiHelper.createDrawableIngredient(
                VanillaTypes.ITEM_STACK,
                new ItemStack(ModBlocks.TOASTER)
        );

        int arrowU = 176;
        int arrowV = 0;
        int arrowW = 8;
        int arrowH = 26;

        this.arrowStatic = guiHelper.createDrawable(
                GUI_TEX,
                arrowU,
                arrowV,
                arrowW,
                arrowH
        );

        int durationTicks = 72;

        this.arrowAnimated = guiHelper.createAnimatedDrawable(
                arrowStatic,
                durationTicks,
                IDrawableAnimated.StartDirection.BOTTOM,
                false
        );
    }

    @Override
    public mezz.jei.api.recipe.@NotNull RecipeType<ToasterRecipe> getRecipeType() {
        return ModJEIRecipeTypes.TOASTING;
    }

    @Override
    public @NotNull Component getTitle() {
        return Component.literal("Toasting");
    }

    @Override
    @SuppressWarnings("removal")
    public @NotNull IDrawable getBackground() {
        return background;
    }

    @Override
    public @NotNull IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(
            IRecipeLayoutBuilder builder,
            ToasterRecipe recipe,
            IFocusGroup focuses
    ) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 59)
                .addItemStacks(Arrays.asList(recipe.getInput().getItems()));

        Minecraft minecraft = Minecraft.getInstance();

        if (minecraft.level == null) {
            return;
        }

        ItemStack output = recipe.getResultItem(
                minecraft.level.registryAccess()
        );

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 11)
                .addItemStack(output);
    }

    @Override
    public void draw(
            ToasterRecipe recipe,
            IRecipeSlotsView recipeSlotsView,
            GuiGraphics graphics,
            double mouseX,
            double mouseY
    ) {
        int arrowX = 84;
        int arrowY = 30;

        arrowAnimated.draw(graphics, arrowX, arrowY);
    }
}