package com.bitheral_gaming.mods.elemental_dogs.init;

import com.bitheral_gaming.mods.elemental_dogs.blocks.Candy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.bitheral_gaming.mods.elemental_dogs.main.Main;
import com.bitheral_gaming.mods.elemental_dogs.main.Referance;

public class ElementalDogsBlocks {
	
	public static Block Candy;
	
	public static void init() {
		Candy = new Candy(Material.wood).setUnlocalizedName("candy_block").setCreativeTab(Main.tabElementalDogs);
	}
	
	public static void register() {
		GameRegistry.registerBlock(Candy, "candy_block");
	}

	public static void registerRenders() {
		registerRender(Candy);
	}
	
	public static void registerRender(Block item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(item), 0, new ModelResourceLocation(Referance.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
