package com.joostmsoftware.igneous.world.feature;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousFlowerBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class IgneousConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> NETHER_FLOWERS = ConfiguredFeatures.register("flower_nether", Feature.FLOWER,
            ConfiguredFeatures.createRandomPatchFeatureConfig(
                    64,
                    PlacedFeatures.createEntry(
                            Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                                    BlockStateProvider.of(IgneousFlowerBlocks.NETHER_FLOWER)
                            )
                    )
            )
    );

    public static void registerConfiguredFeatures() {
        Igneous.LOGGER.info("Registering all configured features");
    }
}
