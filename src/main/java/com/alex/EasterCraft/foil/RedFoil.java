package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class RedFoil extends Item{
	
	public RedFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "redfoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "RedFoil");
	}
}
