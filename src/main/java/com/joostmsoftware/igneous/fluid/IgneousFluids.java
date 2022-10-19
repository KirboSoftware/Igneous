package com.joostmsoftware.igneous.fluid;

import com.joostmsoftware.igneous.util.registry.IgneousFluidRegistry;
import net.minecraft.fluid.FlowableFluid;

import java.util.HashMap;
import java.util.Map;

public class IgneousFluids {

    public static final Map<String, FlowableFluid> LIQUIDS = new HashMap<>();

    public static FlowableFluid STILL_NETHER_WATER = new NetherWaterFluid.Still();
    public static FlowableFluid FLOWING_NETHER_WATER = new NetherWaterFluid.Flowing();

    static {
       LIQUIDS.put("still_nether_water", STILL_NETHER_WATER);
       LIQUIDS.put("flowing_nether_water", FLOWING_NETHER_WATER);
    }

    public static void loadLiquidsInRegistry() {
        LIQUIDS.forEach(IgneousFluidRegistry::registerFluid);
    }
}
