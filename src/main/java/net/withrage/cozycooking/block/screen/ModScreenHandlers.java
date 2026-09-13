
package net.withrage.cozycooking.block.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.withrage.cozycooking.CozyCooking;

public class ModScreenHandlers {
    public static final ScreenHandlerType<ToasterScreenHandler> TOASTER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(CozyCooking.MOD_ID, "toaster"),
                    new ExtendedScreenHandlerType<>(ToasterScreenHandler::new));

    public static void registerScreenHandlers() {
        CozyCooking.LOGGER.info("Registering Screen Handlers for " + CozyCooking.MOD_ID);
    }
}
