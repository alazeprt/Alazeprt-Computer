package com.alazeprt;

import com.alazeprt.blocks.Poor_PC;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class APComputer implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("alazeprts-computer");
    public static final Poor_PC POOR_PC = Registry.register(
            Registry.BLOCK,
            new Identifier("alazeprts-computer", "poor_pc"),
            new Poor_PC(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Alazeprt's Computer Mod v2.0-alpha.1 Enabled.");
    }
}