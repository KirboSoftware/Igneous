package com.joostmsoftware.igneous.block;

import com.joostmsoftware.igneous.core.registry.IgneousBlockRegistry;
import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import java.util.HashMap;
import java.util.Map;

public class IgneousFluidBlocks {

    public static final Map<String, LiquidBlock> LIQUID_BLOCKS = new HashMap<>();

    public static LiquidBlock NETHER_WATER_BLOCK = new LiquidBlock(IgneousFluids.STILL_NETHER_WATER, FabricBlockSettings.copyOf(Blocks.WATER));

    static {
        LIQUID_BLOCKS.put("nether_water_block", NETHER_WATER_BLOCK);
    }

    public static void loadLiquidBlocksInRegistry() {
        LIQUID_BLOCKS.forEach(IgneousBlockRegistry::registerFluidBlock);
    }
}
