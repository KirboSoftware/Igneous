package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousBlocks;
import com.joostmsoftware.igneous.block.IgneousFlowerBlocks;
import com.joostmsoftware.igneous.block.IgneousFluidBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.registry.Registry;

public class IgneousBlockRegistry {

    public static void registerBlocks() {
        Igneous.LOGGER.info("Registering all blocks");
        IgneousBlocks.loadBlocksInRegistry();
        IgneousFluidBlocks.loadLiquidBlocksInRegistry();
        IgneousFlowerBlocks.loadFlowerBlocksInRegistry();
    }

    public static void registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), block);
    }

    public static void registerFluidBlock(String name, FluidBlock liquidBlock) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), liquidBlock);
    }

    public static void registerFlowerBlock(String name, FlowerBlock flowerBlock) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), flowerBlock);
    }

    public static void registerFlowerPotBlock(String name, FlowerPotBlock flowerPotBlock) {
        Registry.register(Registry.BLOCK, Igneous.ID(name), flowerPotBlock);
    }
}
