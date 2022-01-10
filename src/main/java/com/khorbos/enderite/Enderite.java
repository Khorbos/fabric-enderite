package com.khorbos.enderite;

import com.khorbos.enderite.init.BlockRegistries;
import com.khorbos.enderite.init.ItemRegistries;
import net.fabricmc.api.ModInitializer;

public class Enderite implements ModInitializer {
	public static final String ID = "enderite";
	public static final String NAME = "Enderite Mod";

	@Override
	public void onInitialize() {
		ItemRegistries.registerItems();
		BlockRegistries.registerBlocks();
	}
}
