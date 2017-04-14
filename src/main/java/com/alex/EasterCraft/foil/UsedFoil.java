package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class UsedFoil extends Item{
	public UsedFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "usedfoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "UsedFoil");
	}
}
