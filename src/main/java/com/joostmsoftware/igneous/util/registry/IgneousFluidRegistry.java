package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.registry.Registry;

public class IgneousFluidRegistry {

    public static void registerFluids() {
        IgneousFluids.loadLiquidsInRegistry();
    }

    public static void registerFluid(String name, FlowableFluid fluid) {
        Registry.register(Registry.FLUID, Igneous.ID(name), fluid);
    }
}
