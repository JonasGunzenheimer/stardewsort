package edu.project.stardewsort;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StardewSort implements ModInitializer {
	public static final String MOD_ID = "stardewsort";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("StardewSort Mod wurde erfolgreich geladen!");

        // Neuer Event Listener für Kisten
//        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
//            LOGGER.info("Spieler hat einen Block benutzt!");
//            return ActionResult.PASS; // Weitermachen wie normal
//        });
	}
}