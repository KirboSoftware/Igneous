package com.joostmsoftware.igneous.item;

import com.joostmsoftware.jxlib.registry.item.ItemRegistry;

import static com.joostmsoftware.igneous.block.IgneousBlocks.BLOCKS;
import static com.joostmsoftware.igneous.block.IgneousFlowerBlocks.FLOWER_BLOCKS;

public class IgneousBlockItems {

    public static void loadBlockItemsInRegistry() {
        BLOCKS.forEach(ItemRegistry::registerBlockItem);
        FLOWER_BLOCKS.forEach(ItemRegistry::registerBlockItem);
    }
}
