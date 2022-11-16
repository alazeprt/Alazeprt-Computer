package net.alazeprt.apcomputer;

import net.alazeprt.apcomputer.block.pc;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComputerMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("apcomputer");
	public static final Block LOW_PC = new pc(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1.5f));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Alazeprt's Computer Mod is Register Info...");
		Registry.register(Registry.BLOCK, new Identifier("apcomputer", "low_pc"), LOW_PC);
		Registry.register(Registry.ITEM, new Identifier("apcomputer", "low_pc"), new BlockItem(LOW_PC, new FabricItemSettings().group(ItemGroup.MISC)));
		LOGGER.info("Alazeprt's Computer Mod is Loading...");
	}
}
