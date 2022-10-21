package com.joostmsoftware.igneous.item;

import com.joostmsoftware.igneous.util.registry.IgneousItemRegistry;

import static com.joostmsoftware.igneous.block.IgneousBlocks.BLOCKS;
import static com.joostmsoftware.igneous.block.IgneousFlowerBlocks.FLOWER_BLOCKS;

public class IgneousBlockItems {

    public static void loadBlockItemsInRegistry() {
        BLOCKS.forEach(IgneousItemRegistry::registerBlockItem);
        FLOWER_BLOCKS.forEach(IgneousItemRegistry::registerBlockItem);
    }
}
