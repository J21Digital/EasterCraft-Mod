package com.alex.EasterCraft.foil;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.Item;

public class OrangeFoil extends Item{
	
	public OrangeFoil(){
		setCreativeTab(EasterCraft.tabEasterCraftFoil);
		setTextureName(EasterCraft.MODID + ":" + "orangefoil");
		setUnlocalizedName(EasterCraft.MODID + "_" + "OrangeFoil");
	}
}
