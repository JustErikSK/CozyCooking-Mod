package net.withrage.cozycooking;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.withrage.cozycooking.block.screen.ModScreenHandlers;
import net.withrage.cozycooking.block.screen.ToasterScreen;

public class CozyCookingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.TOASTER_SCREEN_HANDLER, ToasterScreen::new);
    }
}
