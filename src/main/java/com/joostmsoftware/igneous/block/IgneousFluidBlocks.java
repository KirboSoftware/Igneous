package com.joostmsoftware.igneous.block;

import com.joostmsoftware.igneous.util.registry.IgneousBlockRegistry;
import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import java.util.HashMap;
import java.util.Map;

public class IgneousFluidBlocks {

    public static final Map<String, FluidBlock> LIQUID_BLOCKS = new HashMap<>();

    public static FluidBlock NETHER_WATER_BLOCK = new FluidBlock(IgneousFluids.STILL_NETHER_WATER, FabricBlockSettings.copyOf(Blocks.WATER));

    static {
        LIQUID_BLOCKS.put("nether_water_block", NETHER_WATER_BLOCK);
    }

    public static void loadLiquidBlocksInRegistry() {
        LIQUID_BLOCKS.forEach(IgneousBlockRegistry::registerFluidBlock);
    }
}
