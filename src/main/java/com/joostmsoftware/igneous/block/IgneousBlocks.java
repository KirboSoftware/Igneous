package com.joostmsoftware.igneous.block;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.core.registry.IgneousBlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;

public class IgneousBlocks {

    public static final Map<String, Block> BLOCKS = new HashMap<>();

    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));
    public static final Block ANOTHER_TEST_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));

    static {
        BLOCKS.put("test_block", TEST_BLOCK);
        BLOCKS.put("another_test_block", ANOTHER_TEST_BLOCK);
    }

    public static void loadBlocksInRegistry() {
        Igneous.LOGGER.info("Registering Blocks");
        BLOCKS.forEach(IgneousBlockRegistry::registerBlock);
    }

}
