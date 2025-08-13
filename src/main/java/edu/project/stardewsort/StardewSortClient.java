package edu.project.stardewsort;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class StardewSortClient implements ClientModInitializer {

    // Unser Keybind: R-Taste für Sortieren
    private static KeyBinding sortInventoryKey;
    private static boolean tabWasDown = false;

    @Override
    public void onInitializeClient() {
        StardewSort.LOGGER.info("StardewSort Client wird geladen...");

        // Registriere die R-Taste
        sortInventoryKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.stardewsort.sort_inventory",  // Translation Key
                InputUtil.Type.KEYSYM,             // Tastatur-Typ
                GLFW.GLFW_KEY_TAB,                  // R-Taste
                "category.stardewsort"             // Kategorie in Einstellungen
        ));

        StardewSort.LOGGER.info("Keybind registriert: TAB zum Sortieren");


        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            boolean tabIsDown = sortInventoryKey.isPressed();

            // Nur triggern wenn: Taste ist gedrückt UND war vorher nicht gedrückt
            if (tabIsDown && !tabWasDown) {
                StardewSort.LOGGER.info("TAB wurde NEU gedrückt!");
                // Hier kommt später die Sortier-Logik
            }

            tabWasDown = tabIsDown;  // State für nächsten Tick speichern
        });
    }
}