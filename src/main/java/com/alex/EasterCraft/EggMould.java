package com.alex.EasterCraft;

import net.minecraft.item.Item;

public class EggMould extends Item{
	public EggMould(){
		setCreativeTab(EasterCraft.tabEasterCraft);
		setTextureName(EasterCraft.MODID + ":" + "eggmould");
		setUnlocalizedName(EasterCraft.MODID + "_" + "EggMould");
	}
}
