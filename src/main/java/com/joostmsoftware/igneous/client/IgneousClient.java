package com.joostmsoftware.igneous.client;

import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class IgneousClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(IgneousFluids.STILL_NETHER_WATER, IgneousFluids.FLOWING_NETHER_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1E038D0
                )
        );

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                IgneousFluids.STILL_NETHER_WATER, IgneousFluids.FLOWING_NETHER_WATER);
    }
}
