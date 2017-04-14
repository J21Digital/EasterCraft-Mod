package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class PinkFoil extends Item{
	
	public PinkFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "pinkfoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "PinkFoil");
	}
}
