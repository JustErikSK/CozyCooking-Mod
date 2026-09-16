package net.withrage.cozycooking.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.item.custom.MilkBoxItem;

public class ModItems {
    // Ingredients
    public static final Item APPLE_JAM = registerItem("apple_jam", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_JAM)));
    public static final Item SWEETBERRY_JAM = registerItem("sweetberry_jam", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_JAM)));
    public static final Item GLOWBERRY_JAM = registerItem("glowberry_jam", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_JAM)));
    public static final Item CARAMEL = registerItem("caramel", new Item(new FabricItemSettings().food(ModFoodComponents.CARAMEL)));
    public static final Item NUHTELLA = registerItem("nuhtella", new Item(new FabricItemSettings().food(ModFoodComponents.NUHTELLA)));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER)));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static final Item ICE_CREAM_CONE = registerItem("ice_cream_cone", new Item(new FabricItemSettings().food(ModFoodComponents.ICE_CREAM_CONE)));
    public static final Item POWDERED_SUGAR = registerItem("powdered_sugar", new Item(new FabricItemSettings()));
    public static final Item WHIPPED_CREAM = registerItem("whipped_cream", new Item(new FabricItemSettings()));
    public static final Item JAR = registerItem("jar", new Item(new FabricItemSettings()));
    public static final Item MILK_BOX = registerItem("milk_box", new MilkBoxItem(new FabricItemSettings().food(ModFoodComponents.MILK_BOX)));
    public static final Item GLASS_OF_WATER = registerItem("glass_of_water", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.GLASS_OF_WATER)));
    public static final Item WHISK = registerItem("whisk", new Item(new FabricItemSettings()));
    public static final Item COOKING_KNIFE = registerItem("cooking_knife", new Item(new FabricItemSettings()));
    public static final Item COOKING_POT = registerItem("cooking_pot", new Item(new FabricItemSettings()));
    public static final Item SLICE_OF_BREAD = registerItem("slice_of_bread", new Item(new FabricItemSettings().food(ModFoodComponents.SLICE_OF_BREAD)));
    public static final Item BOILED_EGG = registerItem("boiled_egg", new Item(new FabricItemSettings().food(ModFoodComponents.BOILED_EGG)));
    public static final Item BURGER_BUN = registerItem("burger_bun", new Item(new FabricItemSettings().food(ModFoodComponents.BURGER_BUN)));
    public static final Item BURNT_TOAST = registerItem("burnt_toast", new Item(new FabricItemSettings().food(ModFoodComponents.BURNED_TOAST)));
    public static final Item NOODLES = registerItem("noodles", new Item(new FabricItemSettings().food(ModFoodComponents.NOODLES)));
    public static final Item PAN = registerItem("pan", new Item(new FabricItemSettings()));
    public static final Item RAW_CHIPS = registerItem("raw_chips", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_CHIPS)));
    public static final Item RAW_FRIES = registerItem("raw_fries", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_FRIES)));
    public static final Item STARCH = registerItem("starch", new Item(new FabricItemSettings()));
    public static final Item SUNNY_SIDE_UP_EGG = registerItem("sunny_side_up_egg", new Item(new FabricItemSettings().food(ModFoodComponents.SUNNY_SIDE_UP_EGG)));
    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST)));
    public static final Item FISHCAKE = registerItem("fishcake", new Item(new FabricItemSettings().food(ModFoodComponents.FISHCAKE)));
    public static final Item CLEAVER = registerItem("cleaver", new Item(new FabricItemSettings()));
    public static final Item MINCED_BEEF = registerItem("minced_beef", new Item(new FabricItemSettings().food(ModFoodComponents.MINCED_BEEF)));
    public static final Item MINCED_CHICKEN = registerItem("minced_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.MINCED_CHICKEN)));
    public static final Item MINCED_LAMB = registerItem("minced_lamb", new Item(new FabricItemSettings().food(ModFoodComponents.MINCED_LAMB)));
    public static final Item MINCED_PORK = registerItem("minced_pork", new Item(new FabricItemSettings().food(ModFoodComponents.MINCED_PORK)));
    public static final Item COOKIE_CUTTER = registerItem("cookie_cutter", new Item(new FabricItemSettings()));
    public static final Item BAGEL = registerItem("bagel", new Item(new FabricItemSettings().food(ModFoodComponents.BAGEL)));
    public static final Item BAGUETTE = registerItem("baguette", new Item(new FabricItemSettings().food(ModFoodComponents.BAGUETTE)));
    public static final Item RAW_DINO_NUGGETS = registerItem("raw_dino_nuggets", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_DINO_NUGGETS)));
    public static final Item DOUGH = registerItem("dough", new Item(new FabricItemSettings()));
    public static final Item RAW_BACON = registerItem("raw_bacon", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_BACON)));
    public static final Item BACON = registerItem("bacon", new Item(new FabricItemSettings().food(ModFoodComponents.BACON)));
    public static final Item CROISSANT = registerItem("croissant", new Item(new FabricItemSettings().food(ModFoodComponents.CROISSANT)));
    public static final Item BOLOGNA = registerItem("bologna", new Item(new FabricItemSettings().food(ModFoodComponents.BOLOGNA)));
    public static final Item CREAM_CHEESE = registerItem("cream_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CREAM_CHEESE)));
    public static final Item CHOCOLATE_SYRUP = registerItem("chocolate_syrup", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_SYRUP)));
    public static final Item FRUIT_SYRUP = registerItem("fruit_syrup", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.FRUIT_SYRUP)));
    public static final Item WAFFLE = registerItem("waffle", new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE)));
    public static final Item CAKE_FORM = registerItem("cake_form", new Item(new FabricItemSettings()));
    public static final Item GELATIN = registerItem("gelatin", new Item(new FabricItemSettings().food(ModFoodComponents.GELATIN)));
    public static final Item COCOA_POWDER = registerItem("cocoa_powder", new Item(new FabricItemSettings()));
    public static final Item RAMEKIN = registerItem("ramekin", new Item(new FabricItemSettings()));
    public static final Item EGG_YOLKS = registerItem("egg_yolks", new Item(new FabricItemSettings()));
    public static final Item EGG_WHITES = registerItem("egg_whites", new Item(new FabricItemSettings()));
    // Main food
    public static final Item APPLE_JUICE = registerItem("apple_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.APPLE_JUICE)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));
    public static final Item BERRY_CUPCAKE = registerItem("berry_cupcake", new Item(new FabricItemSettings().food(ModFoodComponents.BERRY_CUPCAKE)));
    public static final Item CHICKEN_MUSHROOM_PIE = registerItem("chicken_mushroom_pie", new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_MUSHROOM_PIE)));
    public static final Item CHIPS = registerItem("chips", new Item(new FabricItemSettings().food(ModFoodComponents.CHIPS)));
    public static final Item CHOCOLATE_CUPCAKE = registerItem("chocolate_cupcake", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CUPCAKE)));
    public static final Item CHOCOLATE_DONUT = registerItem("chocolate_donut", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_DONUT)));
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_MILK)));
    public static final Item JELLY_DONUT = registerItem("jelly_donut", new Item(new FabricItemSettings().food(ModFoodComponents.JELLY_DONUT)));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(ModFoodComponents.FRIES)));
    public static final Item GLISTERING_MELONADE = registerItem("glistering_melonade", new Item(new FabricItemSettings().food(ModFoodComponents.GLISTERING_MELONADE)));
    public static final Item GLOWBERRY_DONUT = registerItem("glowberry_donut", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_DONUT)));
    public static final Item GLOWBERRY_ICE_CREAM = registerItem("glowberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_ICE_CREAM)));
    public static final Item GLOWBERRY_JUICE = registerItem("glowberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_JUICE)));
    public static final Item GLOWBERRY_PIE = registerItem("glowberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_PIE)));
    public static final Item MELONADE = registerItem("melonade", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.MELONADE)));
    public static final Item MERINGUE = registerItem("meringue", new Item(new FabricItemSettings().food(ModFoodComponents.MERINGUE)));
    public static final Item MILK_BREAD = registerItem("milk_bread", new Item(new FabricItemSettings().food(ModFoodComponents.MILK_BREAD)));
    public static final Item NUHTELLA_ICE_CREAM = registerItem("nuhtella_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.NUHTELLA_ICE_CREAM)));
    public static final Item POT_PIE = registerItem("pot_pie", new Item(new FabricItemSettings().food(ModFoodComponents.POT_PIE)));
    public static final Item PRETZEL = registerItem("pretzel", new Item(new FabricItemSettings().food(ModFoodComponents.PRETZEL)));
    public static final Item GLAZED_DONUT = registerItem("glazed_donut", new Item(new FabricItemSettings().food(ModFoodComponents.GLAZED_DONUT)));
    public static final Item SWEETBERRY_DONUT = registerItem("sweetberry_donut", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_DONUT)));
    public static final Item SWEETBERRY_ICE_CREAM = registerItem("sweetberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_ICE_CREAM)));
    public static final Item SWEETBERRY_JUICE = registerItem("sweetberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_JUICE)));
    public static final Item SWEETBERRY_PIE = registerItem("sweetberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_PIE)));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.VANILLA_ICE_CREAM)));
    public static final Item BOLOGNA_AND_CREAM_CHEESE_TOAST = registerItem("bologna_and_cream_cheese_toast", new Item(new FabricItemSettings().food(ModFoodComponents.BOLOGNA_AND_CREAM_CHEESE_TOAST)));
    public static final Item BREAKFAST_BURGER = registerItem("breakfast_burger", new Item(new FabricItemSettings().food(ModFoodComponents.BREAKFAST_BURGER)));
    public static final Item BUTTER_COOKIE = registerItem("butter_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER_COOKIE)));
    public static final Item EGG_TOAST = registerItem("egg_toast", new Item(new FabricItemSettings().food(ModFoodComponents.EGG_TOAST)));
    public static final Item ENCHANTED_GOLDEN_APPLE_JUICE = registerItem("enchanted_golden_apple_juice", new EnchantedGoldenAppleJuiceItem(new FabricItemSettings().food(ModFoodComponents.ENCHANTED_GOLDEN_APPLE_JUICE)));
    public static final Item GOLDEN_APPLE_JUICE = registerItem("golden_apple_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.GOLDEN_APPLE_JUICE)));
    public static final Item HAM_AND_CHEESE_SANDWICH = registerItem("ham_and_cheese_sandwich", new Item(new FabricItemSettings().food(ModFoodComponents.HAM_AND_CHEESE_SANDWICH)));
    public static final Item NUHTELLA_TOAST = registerItem("nuhtella_toast", new Item(new FabricItemSettings().food(ModFoodComponents.NUHTELLA_TOAST)));
    public static final Item TOAST_WITH_BUTTER = registerItem("toast_with_butter", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST_WITH_BUTTER)));
    public static final Item TOAST_WITH_JAM = registerItem("toast_with_jam", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST_WITH_JAM)));
    public static final Item BROWNIE = registerItem("brownie", new Item(new FabricItemSettings().food(ModFoodComponents.BROWNIE)));
    public static final Item WAFFLE_WITH_CHOCOLATE_SYRUP = registerItem("waffle_with_chocolate_syrup", new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WITH_CHOCOLATE_SYRUP)));
    public static final Item WAFFLE_WITH_FRUIT_SYRUP = registerItem("waffle_with_fruit_syrup", new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WITH_FRUIT_SYRUP)));
    public static final Item BLUE_JELLY = registerItem("blue_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.BLUE_JELLY)));
    public static final Item GREEN_JELLY = registerItem("green_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.GREEN_JELLY)));
    public static final Item ORANGE_JELLY = registerItem("orange_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_JELLY)));
    public static final Item PINK_JELLY = registerItem("pink_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.PINK_JELLY)));
    public static final Item PURPLE_JELLY = registerItem("purple_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.PURPLE_JELLY)));
    public static final Item YELLOW_JELLY = registerItem("yellow_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.YELLOW_JELLY)));
    public static final Item BEEF_RAMEN = registerItem("beef_ramen", new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_RAMEN)));
    public static final Item CHICKEN_RAMEN = registerItem("chicken_ramen", new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_RAMEN)));
    public static final Item PORK_RAMEN = registerItem("pork_ramen", new Item(new FabricItemSettings().food(ModFoodComponents.PORK_RAMEN)));
    public static final Item SEAFOOD_RAMEN = registerItem("seafood_ramen", new Item(new FabricItemSettings().food(ModFoodComponents.SEAFOOD_RAMEN)));
    public static final Item BACON_BURGER = registerItem("bacon_burger", new Item(new FabricItemSettings().food(ModFoodComponents.BACON_BURGER)));
    public static final Item BACON_CHEESEBURGER = registerItem("bacon_cheeseburger", new Item(new FabricItemSettings().food(ModFoodComponents.BACON_CHEESEBURGER)));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESEBURGER)));
    public static final Item KIDS_MEAL = registerItem("kids_meal", new Item(new FabricItemSettings().food(ModFoodComponents.KIDS_MEAL)));
    public static final Item BACON_AND_EGG_PIE = registerItem("bacon_and_egg_pie", new Item(new FabricItemSettings().food(ModFoodComponents.BACON_AND_EGG_PIE)));
    public static final Item CREME_BRULEE = registerItem("creme_brulee", new Item(new FabricItemSettings().food(ModFoodComponents.CREME_BRULEE)));
    public static final Item MARBLE_CAKE = registerItem("marble_cake", new Item(new FabricItemSettings().food(ModFoodComponents.MARBLE_CAKE)));
    public static final Item SHEPHERDS_PIE = registerItem("shepherds_pie", new Item(new FabricItemSettings().food(ModFoodComponents.SHEPHERDS_PIE)));
    public static final Item DINO_NUGGETS = registerItem("dino_nuggets", new Item(new FabricItemSettings().food(ModFoodComponents.DINO_NUGGETS)));
    public static final Item PAVLOVA = registerItem("pavlova", new Item(new FabricItemSettings().food(ModFoodComponents.PAVLOVA)));
    public static final Item VEGGIE_RAMEN = registerItem("veggie_ramen", new Item(new FabricItemSettings().food(ModFoodComponents.VEGGIE_RAMEN)));
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_BAR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                new ResourceLocation(CozyCooking.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        CozyCooking.LOGGER.info(
                "Registering Mod Items for " + CozyCooking.MOD_ID
        );
    }
}