package net.withrage.cozycooking;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.withrage.cozycooking.block.screen.ModScreenHandlers;
import net.withrage.cozycooking.block.screen.ToasterScreen;

public class CozyCookingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MenuScreens.register(
                ModScreenHandlers.TOASTER_SCREEN_HANDLER,
                ToasterScreen::new
        );
    }
}