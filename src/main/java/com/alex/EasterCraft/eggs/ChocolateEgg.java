package com.alex.EasterCraft.eggs;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.ItemFood;

public class ChocolateEgg extends ItemFood{

	public ChocolateEgg() {
		//Heal Amount, Saturation Modifier, Wolves Favourite
		super(6, 0.5f, false);
		setCreativeTab(EasterCraft.tabEasterCraftEggs);
		setTextureName(EasterCraft.MODID + ":" + "chocolateegg");
		setUnlocalizedName(EasterCraft.MODID + "_" + "ChocolateEgg");
		this.setAlwaysEdible();
	}

	
}
