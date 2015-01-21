package com.bitheral_gaming.mods.elemental_dogs.proxy;

import com.bitheral_gaming.mods.elemental_dogs.init.ElementialDogsItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		ElementialDogsItems.registerRenders();
	}
}
