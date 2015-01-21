package com.bitheral_gaming.mods.elemental_dogs.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.bitheral_gaming.mods.elemental_dogs.init.ElementialDogsItems;

public class ElementialDogsTab extends CreativeTabs {

	public ElementialDogsTab(String label) {
		super(label);
		this.hasSearchBar();
		this.setBackgroundImageName("EDTbg.png");


	}
	@Override
	public Item getTabIconItem() {
		return ElementialDogsItems.dog_biscuit;
	}

}
