package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousBlocks;
import com.joostmsoftware.igneous.block.IgneousFlowerBlocks;
import com.joostmsoftware.igneous.block.IgneousFluidBlocks;

public class IgneousBlockRegistry {

    public static void registerBlocks() {
        Igneous.LOGGER.info("Registering all blocks");
        IgneousBlocks.loadBlocksInRegistry();
        IgneousFluidBlocks.loadLiquidBlocksInRegistry();
        IgneousFlowerBlocks.loadFlowerBlocksInRegistry();
    }
}
