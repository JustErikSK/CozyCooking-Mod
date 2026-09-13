package net.withrage.cozycooking.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.withrage.cozycooking.CozyCooking;
import net.withrage.cozycooking.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<ToasterBlockEntity> TOASTER =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CozyCooking.MOD_ID, "gem_polishing_be"),
                    FabricBlockEntityTypeBuilder.create(ToasterBlockEntity::new,
                            ModBlocks.TOASTER).build());

    public static void registerBlockEntities() {
        CozyCooking.LOGGER.info("Registering Block Entities for " + CozyCooking.MOD_ID);
    }
}
