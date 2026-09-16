package net.withrage.cozycooking.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.ModBlocks;

public class ModItemGroups {

    public static final CreativeModeTab COZY_COOKING = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(CozyCooking.MOD_ID, "cozycooking"),
            FabricItemGroup.builder()
                    .title(Component.translatable("itemgroup.cozycooking"))
                    .icon(() -> new ItemStack(ModItems.APPLE_JAM))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ModItems.APPLE_JAM);
                        entries.accept(ModItems.SWEETBERRY_JAM);
                        entries.accept(ModItems.GLOWBERRY_JAM);
                        entries.accept(ModItems.CARAMEL);
                        entries.accept(ModItems.NUHTELLA);
                        entries.accept(ModItems.CHOCOLATE_SYRUP);
                        entries.accept(ModItems.FRUIT_SYRUP);
                        entries.accept(ModItems.SLICE_OF_BREAD);
                        entries.accept(ModItems.TOAST);
                        entries.accept(ModItems.BURNED_TOAST);
                        entries.accept(ModItems.WAFFLE);
                        entries.accept(ModItems.CROISSANT);
                        entries.accept(ModItems.BURGER_BUN);
                        entries.accept(ModItems.BAGEL);
                        entries.accept(ModItems.BAGUETTE);
                        entries.accept(ModItems.ICE_CREAM_CONE);
                        entries.accept(ModItems.BUTTER);
                        entries.accept(ModItems.CHEESE);
                        entries.accept(ModItems.CREAM_CHEESE);
                        entries.accept(ModItems.MILK_BOX);
                        entries.accept(ModItems.GLASS_OF_WATER);
                        entries.accept(ModItems.BOILED_EGG);
                        entries.accept(ModItems.SUNNY_SIDE_UP_EGG);
                        entries.accept(ModItems.FISHCAKE);
                        entries.accept(ModItems.EGG_WHITES);
                        entries.accept(ModItems.EGG_YOLKS);
                        entries.accept(ModItems.NOODLES);
                        entries.accept(ModItems.RAW_CHIPS);
                        entries.accept(ModItems.RAW_FRIES);
                        entries.accept(ModItems.RAW_DINO_NUGGETS);
                        entries.accept(ModItems.BOLOGNA);
                        entries.accept(ModItems.RAW_BACON);
                        entries.accept(ModItems.BACON);
                        entries.accept(ModItems.MINCED_BEEF);
                        entries.accept(ModItems.MINCED_CHICKEN);
                        entries.accept(ModItems.MINCED_LAMB);
                        entries.accept(ModItems.MINCED_PORK);
                        entries.accept(ModItems.SALT);
                        entries.accept(ModItems.FLOUR);
                        entries.accept(ModItems.STARCH);
                        entries.accept(ModItems.POWDERED_SUGAR);
                        entries.accept(ModItems.COCOA_POWDER);
                        entries.accept(ModItems.WHIPPED_CREAM);
                        entries.accept(ModItems.DOUGH);
                        entries.accept(ModItems.GELATIN);
                        entries.accept(ModItems.JAR);
                        entries.accept(ModItems.WHISK);
                        entries.accept(ModItems.COOKING_KNIFE);
                        entries.accept(ModItems.CLEAVER);
                        entries.accept(ModItems.COOKING_POT);
                        entries.accept(ModItems.PAN);
                        entries.accept(ModItems.COOKIE_CUTTER);
                        entries.accept(ModItems.CAKE_FORM);
                        entries.accept(ModItems.RAMEKIN);

                        entries.accept(ModBlocks.TOASTER);
                        entries.accept(ModBlocks.CUTTING_BOARD);
                        entries.accept(ModBlocks.CLOTH);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        CozyCooking.LOGGER.info(
                "Registering Item Groups for " + CozyCooking.MOD_ID
        );
    }
}