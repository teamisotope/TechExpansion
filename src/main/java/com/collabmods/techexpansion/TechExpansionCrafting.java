package com.collabmods.techexpansion;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TechExpansionCrafting {
	public static void init() {
		GameRegistry.addSmelting(TechExpansionBlocks.copperOre, new ItemStack(Items.bed), 1.0F);
	}
}
