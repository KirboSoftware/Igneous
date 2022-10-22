package com.joostmsoftware.igneous.util;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.block.IgneousBlocks;
import com.joostmsoftware.igneous.block.IgneousFlowerBlocks;
import com.joostmsoftware.igneous.block.IgneousFluidBlocks;
import com.joostmsoftware.igneous.item.IgneousBucketItems;
import com.joostmsoftware.igneous.item.IgneousItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class IgneousDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(IgneousModelGenerator::new);
        fabricDataGenerator.addProvider(IgneousEnglishLangProvider::new);
    }

    private static class IgneousModelGenerator extends FabricModelProvider {

        public IgneousModelGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(IgneousBlocks.TEST_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(IgneousBlocks.ANOTHER_TEST_BLOCK);
            blockStateModelGenerator.registerFlowerPotPlant(IgneousFlowerBlocks.NETHER_FLOWER, IgneousFlowerBlocks.POTTED_NETHER_FLOWER, BlockStateModelGenerator.TintType.TINTED);
            blockStateModelGenerator.registerSimpleState(IgneousFluidBlocks.NETHER_WATER_BLOCK);
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(IgneousItems.TEST, Models.GENERATED);
            itemModelGenerator.register(IgneousItems.ANOTHER_TEST, Models.GENERATED);
            itemModelGenerator.register(IgneousBucketItems.NETHER_WATER_BUCKET, Models.GENERATED);
        }
    }

    private static class IgneousEnglishLangProvider extends FabricLanguageProvider {

        protected IgneousEnglishLangProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add(Igneous.GROUP, "Igneous");
            translationBuilder.add(IgneousBlocks.TEST_BLOCK, "Test Block");
            translationBuilder.add(IgneousBlocks.ANOTHER_TEST_BLOCK, "Another Test Block");
            translationBuilder.add(IgneousFlowerBlocks.NETHER_FLOWER, "Nether Flower");
            translationBuilder.add(IgneousFlowerBlocks.POTTED_NETHER_FLOWER, "Potted Nether Flower");
            translationBuilder.add(IgneousItems.TEST, "Test");
            translationBuilder.add(IgneousItems.ANOTHER_TEST, "Another Test");
            translationBuilder.add(IgneousBucketItems.NETHER_WATER_BUCKET, "Nether Water Bucket");
        }
    }
}
