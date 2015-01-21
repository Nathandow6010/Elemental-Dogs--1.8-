package com.bitheral_gaming.mods.elemental_dogs.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.bitheral_gaming.mods.elemental_dogs.init.ElementialDogsItems;
import com.bitheral_gaming.mods.elemental_dogs.proxy.CommonProxy;

@Mod(modid = Referance.modid, version = Referance.version, name = Referance.name)
public class Main
{
	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ElementialDogsTab tabElementalDogs = new ElementialDogsTab("tabElementalDogs");
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent)
	{
		ElementialDogsItems.init();
		ElementialDogsItems.register();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public static void postEvent(FMLPostInitializationEvent postEvent)
	{
		
	}

}
