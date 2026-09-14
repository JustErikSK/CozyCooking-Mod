package net.withrage.cozycooking.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<ToasterBlockEntity> TOASTER =
            net.minecraft.core.Registry.register(
                    BuiltInRegistries.BLOCK_ENTITY_TYPE,
                    new ResourceLocation(CozyCooking.MOD_ID, "gem_polishing_be"),
                    FabricBlockEntityTypeBuilder.create(
                            ToasterBlockEntity::new,
                            ModBlocks.TOASTER
                    ).build()
            );

    public static void registerBlockEntities() {
        CozyCooking.LOGGER.info(
                "Registering Block Entities for " + CozyCooking.MOD_ID
        );
    }
}