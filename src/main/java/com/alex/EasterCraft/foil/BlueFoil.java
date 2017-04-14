package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class BlueFoil extends Item{
	
	public BlueFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "bluefoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "BlueFoil");
	}
}
