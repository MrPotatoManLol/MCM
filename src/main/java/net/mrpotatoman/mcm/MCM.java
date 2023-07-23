package net.mrpotatoman.mcm;

import net.fabricmc.api.ModInitializer;

import net.mrpotatoman.mcm.block.ModBlocks;
import net.mrpotatoman.mcm.item.ModItemGroups;
import net.mrpotatoman.mcm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCM implements ModInitializer {
	public static final String MOD_ID = "mcm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}