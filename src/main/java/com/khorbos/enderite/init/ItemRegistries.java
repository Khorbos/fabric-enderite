package com.khorbos.enderite.init;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemRegistries {


    private static Item register(String id, Item item){
        return (Item) Registry.register(Registry.ITEM, (String)id, item);
    }

    public static void registerItems(){

    }
}
