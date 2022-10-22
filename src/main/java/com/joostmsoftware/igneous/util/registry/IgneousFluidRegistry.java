package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.fluid.IgneousFluids;

public class IgneousFluidRegistry {

    public static void registerFluids() {
        Igneous.LOGGER.info("Registering all fluids");
        IgneousFluids.loadLiquidsInRegistry();
    }
}
