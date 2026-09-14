package net.withrage.cozycooking.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.custom.ClothBlock;
import net.withrage.cozycooking.block.custom.CuttingBoardBlock;
import net.withrage.cozycooking.block.custom.ToasterBlock;

public class ModBlocks {

    public static final Block TOASTER = registerBlock(
            "toaster",
            new ToasterBlock(
                    FabricBlockSettings.copyOf(Blocks.SPAWNER)
                            .nonOpaque()
                            .requiresTool()
            )
    );

    public static final Block CLOTH = registerBlock(
            "cloth",
            new ClothBlock(
                    FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)
                            .nonOpaque()
            )
    );

    public static final Block CUTTING_BOARD = registerBlock(
            "cutting_board",
            new CuttingBoardBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                            .nonOpaque()
            )
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(
                BuiltInRegistries.BLOCK,
                new ResourceLocation(CozyCooking.MOD_ID, name),
                block
        );
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                new ResourceLocation(CozyCooking.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings())
        );
    }

    public static void registerModBlocks() {
        CozyCooking.LOGGER.info(
                "Registering ModBlocks for " + CozyCooking.MOD_ID
        );
    }
}