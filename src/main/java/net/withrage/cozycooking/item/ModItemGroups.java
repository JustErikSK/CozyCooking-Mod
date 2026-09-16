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
                        // Ingredients
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
                        // Blocks
                        entries.accept(ModBlocks.TOASTER);
                        entries.accept(ModBlocks.CUTTING_BOARD);
                        entries.accept(ModBlocks.CLOTH);
                        // Main food
                        entries.accept(ModItems.APPLE_JUICE);
                        entries.accept(ModItems.SWEETBERRY_JUICE);
                        entries.accept(ModItems.GLOWBERRY_JUICE);
                        entries.accept(ModItems.GOLDEN_APPLE_JUICE);
                        entries.accept(ModItems.ENCHANTED_GOLDEN_APPLE_JUICE);
                        entries.accept(ModItems.MELONADE);
                        entries.accept(ModItems.GLISTERING_MELONADE);
                        entries.accept(ModItems.JELLY_DONUT);
                        entries.accept(ModItems.GLAZED_DONUT);
                        entries.accept(ModItems.GLOWBERRY_DONUT);
                        entries.accept(ModItems.SWEETBERRY_DONUT);
                        entries.accept(ModItems.CHOCOLATE_DONUT);
                        entries.accept(ModItems.BUTTER_COOKIE);
                        entries.accept(ModItems.BROWNIE);
                        entries.accept(ModItems.APPLE_PIE);
                        entries.accept(ModItems.GLOWBERRY_PIE);
                        entries.accept(ModItems.SWEETBERRY_PIE);
                        entries.accept(ModItems.WAFFLE_WITH_FRUIT_SYRUP);
                        entries.accept(ModItems.WAFFLE_WITH_CHOCOLATE_SYRUP);
                        entries.accept(ModItems.GLOWBERRY_ICE_CREAM);
                        entries.accept(ModItems.SWEETBERRY_ICE_CREAM);
                        entries.accept(ModItems.VANILLA_ICE_CREAM);
                        entries.accept(ModItems.NUHTELLA_ICE_CREAM);
                        entries.accept(ModItems.BERRY_CUPCAKE);
                        entries.accept(ModItems.CHOCOLATE_CUPCAKE);
                        entries.accept(ModItems.CHOCOLATE_MILK);
                        entries.accept(ModItems.MILK_BREAD);
                        entries.accept(ModItems.POT_PIE);
                        entries.accept(ModItems.CHICKEN_MUSHROOM_PIE);
                        entries.accept(ModItems.BACON_AND_EGG_PIE);
                        entries.accept(ModItems.SHEPHERDS_PIE);
                        entries.accept(ModItems.BREAKFAST_BURGER);
                        entries.accept(ModItems.BACON_BURGER);
                        entries.accept(ModItems.BACON_CHEESEBURGER);
                        entries.accept(ModItems.CHEESEBURGER);
                        entries.accept(ModItems.KIDS_MEAL);
                        entries.accept(ModItems.DINO_NUGGETS);
                        entries.accept(ModItems.FRIES);
                        entries.accept(ModItems.CHIPS);
                        entries.accept(ModItems.TOAST_WITH_BUTTER);
                        entries.accept(ModItems.TOAST_WITH_JAM);
                        entries.accept(ModItems.BOLOGNA_AND_CREAM_CHEESE_TOAST);
                        entries.accept(ModItems.EGG_TOAST);
                        entries.accept(ModItems.NUHTELLA_TOAST);
                        entries.accept(ModItems.HAM_AND_CHEESE_SANDWICH);
                        entries.accept(ModItems.PRETZEL);
                        entries.accept(ModItems.MERINGUE);
                        entries.accept(ModItems.PAVLOVA);
                        entries.accept(ModItems.CHOCOLATE_BAR);
                        entries.accept(ModItems.BLUE_JELLY);
                        entries.accept(ModItems.GREEN_JELLY);
                        entries.accept(ModItems.ORANGE_JELLY);
                        entries.accept(ModItems.PINK_JELLY);
                        entries.accept(ModItems.PURPLE_JELLY);
                        entries.accept(ModItems.YELLOW_JELLY);
                        entries.accept(ModItems.MARBLE_CAKE);
                        entries.accept(ModItems.CREME_BRULEE);
                        entries.accept(ModItems.VEGGIE_RAMEN);
                        entries.accept(ModItems.BEEF_RAMEN);
                        entries.accept(ModItems.CHICKEN_RAMEN);
                        entries.accept(ModItems.PORK_RAMEN);
                        entries.accept(ModItems.SEAFOOD_RAMEN);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        CozyCooking.LOGGER.info(
                "Registering Item Groups for " + CozyCooking.MOD_ID
        );
    }
}