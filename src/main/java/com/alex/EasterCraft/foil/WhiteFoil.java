package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class WhiteFoil extends Item{
	
	public WhiteFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "whitefoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "WhiteFoil");
	}
}
