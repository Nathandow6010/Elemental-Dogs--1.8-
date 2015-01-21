package com.bitheral_gaming.mods.elemental_dogs.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.bitheral_gaming.mods.elemental_dogs.main.Main;
import com.bitheral_gaming.mods.elemental_dogs.main.Referance;

public class ElementialDogsItems {
	
	public static Item dog_biscuit;
	public static Item spawn_fire_dog;
	public static Item spawn_water_dog;
	public static Item spawn_earth_dog;
	public static Item spawn_air_dog;
	public static Item spawn_choco_dog;
	public static Item spawn_ice_dog;
	public static Item spawn_sponge_dog;
	public static Item collar;
	
	public static void init() {
		dog_biscuit = new Item().setUnlocalizedName("dog_biscuit").setCreativeTab(Main.tabElementalDogs);
		spawn_fire_dog = new Item().setUnlocalizedName("FireDogEgg").setCreativeTab(Main.tabElementalDogs);
	}
	
	public static void register() {
		GameRegistry.registerItem(dog_biscuit, "dog_biscuit");
	}

	public static void registerRenders() {
		registerRender(dog_biscuit);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Referance.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
