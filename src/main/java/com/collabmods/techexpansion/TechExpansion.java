package com.collabmods.techexpansion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//imports

@Mod(modid = TechExpansion.MODID, name = TechExpansion.MODNAME, version = TechExpansion.VERSION)

public class TechExpansion {
	
	public static final String MODID = "techExpansion";
	public static final String MODNAME = "Tech Expansion";
	public static final String VERSION = "v0.1";
	//preinit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	//init
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	//postinit
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
