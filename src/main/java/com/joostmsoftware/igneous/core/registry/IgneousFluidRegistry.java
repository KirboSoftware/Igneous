package com.joostmsoftware.igneous.core.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.minecraft.core.Registry;
import net.minecraft.world.level.material.FlowingFluid;

public class IgneousFluidRegistry {

    public static void registerFluids() {
        IgneousFluids.loadLiquidsInRegistry();
    }

    public static void registerFluid(String name, FlowingFluid fluid) {
        Registry.register(Registry.FLUID, Igneous.ID(name), fluid);
    }
}
