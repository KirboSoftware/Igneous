package com.joostmsoftware.igneous.core.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousBlocks;
import com.joostmsoftware.igneous.block.IgneousFluidBlocks;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;

public class IgneousBlockRegistry {

    public static void registerBlocks() {
        IgneousBlocks.loadBlocksInRegistry();
        IgneousFluidBlocks.loadLiquidBlocksInRegistry();
    }

    public static void registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), block);
    }

    public static void registerFluidBlock(String name, LiquidBlock liquidBlock) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), liquidBlock);
    }
}
