package com.khorbos.enderite;

import com.khorbos.enderite.init.BlockRegistries;
import com.khorbos.enderite.init.ItemRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Enderite implements ModInitializer {
	public static final String ID = "enderite";
	public static final String NAME = "Enderite Mod";
	public static final ItemGroup ENDERITE_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "enderite"), () -> new ItemStack(ItemRegistries.ENDERITE_INGOT));

	@Override
	public void onInitialize() {
		ItemRegistries.registerItems();
		BlockRegistries.registerBlocks();
	}
}
