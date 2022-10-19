package com.joostmsoftware.igneous.item;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.util.registry.IgneousItemRegistry;

import static com.joostmsoftware.igneous.block.IgneousBlocks.BLOCKS;

public class IgneousBlockItems {

    public static void loadBlockItemsInRegistry() {
        Igneous.LOGGER.info("Registering Block Items");
        BLOCKS.forEach(IgneousItemRegistry::registerBlockItem);
    }
}
