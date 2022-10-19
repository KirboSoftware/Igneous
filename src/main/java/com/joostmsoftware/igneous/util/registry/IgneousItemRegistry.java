package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.item.IgneousBlockItems;
import com.joostmsoftware.igneous.item.IgneousBucketItems;
import com.joostmsoftware.igneous.item.IgneousItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class IgneousItemRegistry {

    public static void registerItems() {
        IgneousItems.loadItemsInRegistry();
        IgneousBlockItems.loadBlockItemsInRegistry();
        IgneousBucketItems.loadBucketsInRegistry();
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, Igneous.ID(name), new BlockItem(block, new FabricItemSettings().group(Igneous.GROUP)));
    }

    public static void registerBucketItem(String name, BucketItem item) {
        Registry.register(Registry.ITEM, Igneous.ID(name), item);
    }

    public static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, Igneous.ID(name), item);
    }
}
