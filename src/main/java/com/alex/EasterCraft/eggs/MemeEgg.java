package com.alex.EasterCraft.eggs;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.item.ItemFood;

public class MemeEgg extends ItemFood{

	public MemeEgg() {
		super(8, 0.5f, false);
		setCreativeTab(EasterCraft.tabEasterCraftEggs);
		setTextureName(EasterCraft.MODID + ":" + "memeegg");
		setUnlocalizedName(EasterCraft.MODID + "_" + "MemeEgg");
		this.setAlwaysEdible();
	}
	
}
