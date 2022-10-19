package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousBlocks;
import com.joostmsoftware.igneous.block.IgneousFluidBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.registry.Registry;

public class IgneousBlockRegistry {

    public static void registerBlocks() {
        IgneousBlocks.loadBlocksInRegistry();
        IgneousFluidBlocks.loadLiquidBlocksInRegistry();
    }

    public static void registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), block);
    }

    public static void registerFluidBlock(String name, FluidBlock liquidBlock) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), liquidBlock);
    }
}
