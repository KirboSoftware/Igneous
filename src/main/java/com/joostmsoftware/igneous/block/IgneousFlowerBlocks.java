package com.joostmsoftware.igneous.block;

import com.joostmsoftware.jxlib.registry.block.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;

import java.util.HashMap;
import java.util.Map;

public class IgneousFlowerBlocks {

    public static final Map<String, FlowerBlock> FLOWER_BLOCKS = new HashMap<>();
    public static final Map<String, FlowerPotBlock> FLOWER_POT_BLOCKS = new HashMap<>();

    public static final FlowerBlock NETHER_FLOWER = new FlowerBlock(StatusEffects.ABSORPTION, 8, FabricBlockSettings.copy(Blocks.DANDELION));
    public static final FlowerPotBlock POTTED_NETHER_FLOWER = new FlowerPotBlock(NETHER_FLOWER, FabricBlockSettings.copy(Blocks.POTTED_DANDELION));
    static {
        FLOWER_BLOCKS.put("nether_flower", NETHER_FLOWER);
        FLOWER_POT_BLOCKS.put("potted_nether_flower", POTTED_NETHER_FLOWER);
    }

    public static void loadFlowerBlocksInRegistry() {
        FLOWER_BLOCKS.forEach(BlockRegistry::registerFlowerBlock);
        FLOWER_POT_BLOCKS.forEach(BlockRegistry::registerFlowerPotBlock);

    }
}
