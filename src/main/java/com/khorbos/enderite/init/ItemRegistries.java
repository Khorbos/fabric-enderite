package com.khorbos.enderite.init;

import com.khorbos.enderite.Enderite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistries {
    public static final Item ENDER_GEM = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDER_RUBY = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_INGOT = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item TOTEM_OF_UNFALLING = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));

    public static final Item ENDERITE_PICKAXE = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_AXE = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_SHOVEL = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_HOE = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_SWORD = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));

    public static final Item ENDERITE_HELMET = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_CHESTPLATE = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_LEGGINGS = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));
    public static final Item ENDERITE_BOOTS = new Item(new FabricItemSettings().group(Enderite.ENDERITE_GROUP));

    private static Item register(String id, Item item){
        return (Item) Registry.register(Registry.ITEM, new Identifier(Enderite.ID, (String)id), item);
    }

    public static void registerItems(){
        register("ender_gem", ENDER_GEM);
        register("ender_ruby", ENDER_RUBY);
        register("enderite_ingot", ENDERITE_INGOT);
        register("totem_of_unfalling", TOTEM_OF_UNFALLING);
        register("enderite_pickaxe", ENDERITE_PICKAXE);
        register("enderite_axe", ENDERITE_AXE);
        register("enderite_shovel", ENDERITE_SHOVEL);
        register("enderite_hoe", ENDERITE_HOE);
        register("enderite_sword", ENDERITE_SWORD);
        register("enderite_helmet", ENDERITE_HELMET);
        register("enderite_chestplate", ENDERITE_CHESTPLATE);
        register("enderite_leggings", ENDERITE_LEGGINGS);
        register("enderite_boots", ENDERITE_BOOTS);
    }
}
