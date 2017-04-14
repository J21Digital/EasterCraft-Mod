package com.alex.EasterCraft;

import net.minecraft.item.Item;

public class FiredEggMould extends Item{
	public FiredEggMould(){
		setCreativeTab(EasterCraft.tabEasterCraft);
		setTextureName(EasterCraft.MODID + ":" + "firedeggmould");
		setUnlocalizedName(EasterCraft.MODID + "_" + "FiredEggMould");
	}
}
