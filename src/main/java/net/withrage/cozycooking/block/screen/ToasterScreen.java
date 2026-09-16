package net.withrage.cozycooking.block.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.withrage.cozycooking.CozyCooking;

public class ToasterScreen extends AbstractContainerScreen<ToasterScreenHandler> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CozyCooking.MOD_ID, "textures/gui/toaster_gui.png");

    public ToasterScreen(
            ToasterScreenHandler handler,
            Inventory inventory,
            Component title
    ) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();

        titleLabelY = 1000;
        inventoryLabelY = 1000;
    }

    @Override
    protected void renderBg(
            GuiGraphics graphics,
            float delta,
            int mouseX,
            int mouseY
    ) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        graphics.blit(
                TEXTURE,
                x,
                y,
                0,
                0,
                imageWidth,
                imageHeight
        );

        renderProgressArrow(graphics, x, y);
    }

    private void renderProgressArrow(
            GuiGraphics graphics,
            int x,
            int y
    ) {
        if (menu.isCrafting()) {
            int progress = menu.getScaledProgress();
            int arrowFullHeight = 16;

            int drawX = x + 84;
            int drawY = y + 40 + (arrowFullHeight - progress);

            int textureU = 176;
            int textureV = 25 - progress;

            graphics.blit(
                    TEXTURE,
                    drawX,
                    drawY,
                    textureU,
                    textureV,
                    6,
                    progress
            );
        }
    }

    @Override
    public void render(
            GuiGraphics graphics,
            int mouseX,
            int mouseY,
            float delta
    ) {
        renderBackground(graphics);
        super.render(graphics, mouseX, mouseY, delta);
        renderTooltip(graphics, mouseX, mouseY);
    }
}