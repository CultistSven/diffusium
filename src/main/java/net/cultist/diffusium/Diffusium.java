package net.cultist.diffusium;

import net.cultist.diffusium.block.ModBlocks;
import net.cultist.diffusium.item.ModItemGroups;
import net.cultist.diffusium.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Diffusium implements ModInitializer {
	public static final String MOD_ID = "diffusium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
	}
}