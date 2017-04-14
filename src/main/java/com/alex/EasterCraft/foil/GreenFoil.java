package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class GreenFoil extends Item{
	
	public GreenFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "greenfoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "GreenFoil");
	}
}
