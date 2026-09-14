package net.withrage.cozycooking.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodComponents {

    public static final FoodProperties APPLE_JAM = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties BACON = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.5f)
            .fast()
            .meat()
            .build();

    public static final FoodProperties BAGEL = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.4f)
            .build();

    public static final FoodProperties BAGUETTE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties BOILED_EGG = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.45f)
            .fast()
            .build();

    public static final FoodProperties BURGER_BUN = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .fast()
            .build();

    public static final FoodProperties BURNED_TOAST = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .alwaysEat()
            .fast()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1), 1.0f)
            .build();

    public static final FoodProperties BUTTER = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.15f)
            .fast()
            .build();

    public static final FoodProperties CARAMEL = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.2f)
            .fast()
            .build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .fast()
            .build();

    public static final FoodProperties FISHCAKE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.15f)
            .alwaysEat()
            .fast()
            .meat()
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200, 1), 0.2f)
            .build();

    public static final FoodProperties GLASS_OF_WATER = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties GLOWBERRY_JAM = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties ICE_CREAM_CONE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.15f)
            .fast()
            .build();

    public static final FoodProperties MILK_BOX = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.4f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties MINCED_BEEF = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .meat()
            .effect(new MobEffectInstance(MobEffects.HUNGER, 60, 1), 0.2f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.2f)
            .build();

    public static final FoodProperties MINCED_CHICKEN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .meat()
            .effect(new MobEffectInstance(MobEffects.HUNGER, 60, 1), 0.2f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.2f)
            .build();

    public static final FoodProperties MINCED_LAMB = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .meat()
            .effect(new MobEffectInstance(MobEffects.HUNGER, 60, 1), 0.2f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.2f)
            .build();

    public static final FoodProperties MINCED_PORK = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .meat()
            .effect(new MobEffectInstance(MobEffects.HUNGER, 60, 1), 0.2f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.2f)
            .build();

    public static final FoodProperties NOODLES = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .fast()
            .build();

    public static final FoodProperties NUHTELLA = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.5f)
            .fast()
            .effect(new MobEffectInstance(MobEffects.LUCK, 800, 1), 0.6f)
            .build();

    public static final FoodProperties RAW_BACON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .fast()
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.15f)
            .build();

    public static final FoodProperties RAW_CHIPS = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .fast()
            .build();

    public static final FoodProperties RAW_DINO_NUGGETS = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .fast()
            .meat()
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1), 0.7f)
            .build();

    public static final FoodProperties RAW_FRIES = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .fast()
            .build();

    public static final FoodProperties SLICE_OF_BREAD = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.2f)
            .fast()
            .build();

    public static final FoodProperties SUNNY_SIDE_UP_EGG = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.35f)
            .fast()
            .build();

    public static final FoodProperties SWEETBERRY_JAM = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties TOAST = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.45f)
            .build();

    public static final FoodProperties CROISSANT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties BOLOGNA = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.2f)
            .fast()
            .build();

    public static final FoodProperties CREAM_CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.15f)
            .build();

    public static final FoodProperties CHOCOLATE_SYRUP = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.15f)
            .build();

    public static final FoodProperties FRUIT_SYRUP = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.15f)
            .build();

    public static final FoodProperties WAFFLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties GELATIN = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();
}