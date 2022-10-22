package com.joostmsoftware.igneous.block;

import com.joostmsoftware.jxlib.registry.block.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

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
        BLOCKS.forEach(BlockRegistry::registerBlock);
    }

}
