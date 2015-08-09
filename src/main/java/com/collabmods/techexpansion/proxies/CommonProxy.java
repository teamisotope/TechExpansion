package com.collabmods.techexpansion.proxies;

import com.collabmods.techexpansion.TechExpansionBlocks;
import com.collabmods.techexpansion.TechExpansionWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		TechExpansionBlocks.init();
	}
	
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new TechExpansionWorldGen(), 0);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}