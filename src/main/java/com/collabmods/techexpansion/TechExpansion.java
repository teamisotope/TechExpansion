package com.collabmods.techexpansion;

import com.collabmods.techexpansion.blocks.CopperOre;
import com.collabmods.techexpansion.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid = TechExpansion.MODID, name = TechExpansion.MODNAME, version = TechExpansion.VERSION)

public class TechExpansion {

	@SidedProxy(clientSide="com.collabmods.techexpansion.proxies.ClientProxy", serverSide="com.collabmods.techexpansion.proxies.ServerProxy" )
	public static CommonProxy proxy;

	
	public static final String MODID = "techExpansion";
	public static final String MODNAME = "Tech Expansion";
	public static final String VERSION = "v0.1";
	//preinit
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		TechExpansionCrafting.init();
	}
	
	//init
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		OreDictionary.registerOre("oreCopper", new ItemStack(Item.getItemFromBlock(TechExpansionBlocks.copperOre)));
		OreDictionary.registerOre("oreTin", new ItemStack(Item.getItemFromBlock(TechExpansionBlocks.tinOre)));
	}
	
	//postinit
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}