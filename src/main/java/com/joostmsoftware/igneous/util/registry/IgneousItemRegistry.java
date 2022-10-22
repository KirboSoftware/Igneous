package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.item.IgneousBlockItems;
import com.joostmsoftware.igneous.item.IgneousBucketItems;
import com.joostmsoftware.igneous.item.IgneousItems;

public class IgneousItemRegistry {

    public static void registerItems() {
        Igneous.LOGGER.info("Registering all items");
        IgneousItems.loadItemsInRegistry();
        IgneousBlockItems.loadBlockItemsInRegistry();
        IgneousBucketItems.loadBucketsInRegistry();
    }
}
