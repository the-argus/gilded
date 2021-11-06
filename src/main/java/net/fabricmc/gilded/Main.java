package net.fabricmc.gilded;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.gilded.item.GildedChestplate;
import net.fabricmc.gilded.materials.GildedDiamond;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("gilded");

	public static final GildedDiamond GILDED_DIAMOND_ARMOR_MATERIAL = new GildedDiamond();
	//public static final Item GILDED_DIAMOND_MATERIAL_ITEM = new GildedChestplate(new FabricItemSettings().group(ItemGroup.COMBAT));

	public static final Item GILDED_DIAMOND_CHESTPLATE = new ArmorItem(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		LOGGER.info("we");

		Registry.register(Registry.ITEM, new Identifier("gilded", "gilded_diamond_chestplate"), GILDED_DIAMOND_CHESTPLATE);
	}
}
