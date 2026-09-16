package net.withrage.cozycooking;

import net.fabricmc.api.ModInitializer;
import net.withrage.cozycooking.block.entity.ModBlockEntities;
import net.withrage.cozycooking.block.ModBlocks;
import net.withrage.cozycooking.block.screen.ModScreenHandlers;
import net.withrage.cozycooking.item.*;
import net.withrage.cozycooking.recipe.ModRecipes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyCooking implements ModInitializer {
	public static final String MOD_ID = "cozycooking";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModScreenHandlers.registerScreenHandlers();
		ModBlockEntities.registerBlockEntities();
		ModRecipes.registerRecipes();
	}
}