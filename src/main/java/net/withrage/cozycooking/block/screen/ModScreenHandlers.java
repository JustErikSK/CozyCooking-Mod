package net.withrage.cozycooking.block.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;
import net.withrage.cozycooking.CozyCooking;

public class ModScreenHandlers {

    public static final MenuType<ToasterScreenHandler> TOASTER_SCREEN_HANDLER =
            Registry.register(
                    BuiltInRegistries.MENU,
                    new ResourceLocation(CozyCooking.MOD_ID, "toaster"),
                    new ExtendedScreenHandlerType<>(ToasterScreenHandler::new)
            );

    public static void registerScreenHandlers() {
        CozyCooking.LOGGER.info(
                "Registering Screen Handlers for " + CozyCooking.MOD_ID
        );
    }
}