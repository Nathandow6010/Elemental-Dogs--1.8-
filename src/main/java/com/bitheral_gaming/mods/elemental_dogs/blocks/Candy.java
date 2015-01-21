package com.bitheral_gaming.mods.elemental_dogs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Candy extends Block {

	public Candy(Material mat) {
		super(mat);
		this.setBlockUnbreakable();
		this.setHardness(4.0F);
		this.setResistance(6.0F);
		this.setLightLevel(0.0F);
	}

}
