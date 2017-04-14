package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class YellowFoil extends Item{
	
	public YellowFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "yellowfoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "YellowFoil");
	}
}
