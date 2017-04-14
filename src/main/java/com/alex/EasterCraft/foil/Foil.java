package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class Foil extends Item{
	
	public Foil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "foil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "Foil");
	}
}
