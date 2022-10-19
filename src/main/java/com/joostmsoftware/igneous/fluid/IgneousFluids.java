package com.joostmsoftware.igneous.fluid;

import com.joostmsoftware.igneous.core.registry.IgneousFluidRegistry;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.HashMap;
import java.util.Map;

public class IgneousFluids {

    public static final Map<String, FlowingFluid> LIQUIDS = new HashMap<>();

    public static FlowingFluid STILL_NETHER_WATER = new NetherWaterFluid.Still();
    public static FlowingFluid FLOWING_NETHER_WATER = new NetherWaterFluid.Flowing();

    static {
       LIQUIDS.put("still_nether_water", STILL_NETHER_WATER);
       LIQUIDS.put("flowing_nether_water", FLOWING_NETHER_WATER);
    }

    public static void loadLiquidsInRegistry() {
        LIQUIDS.forEach(IgneousFluidRegistry::registerFluid);
    }
}
