package com.khorbos.enderite.init;

import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class BlockRegistries {


    private static Block register(String id, Block block){
        return (Block) Registry.register(Registry.BLOCK, (String)id, block);
    }

    public static void registerBlocks(){

    }
}
