package com.joostmsoftware.igneous.client;

import com.joostmsoftware.igneous.fluid.IgneousFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class IgneousClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(IgneousFluids.STILL_NETHER_WATER, IgneousFluids.FLOWING_NETHER_WATER,
                new SimpleFluidRenderHandler(
                        new ResourceLocation("minecraft:block/water_still"),
                        new ResourceLocation("minecraft:block/water_flow"),
                        0xA1E038D0
                )
        );

        BlockRenderLayerMap.INSTANCE.putFluids(RenderType.translucent(),
                IgneousFluids.STILL_NETHER_WATER, IgneousFluids.FLOWING_NETHER_WATER);
    }
}
