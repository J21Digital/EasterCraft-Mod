package com.alex.EasterCraft;

import net.minecraft.item.ItemFood;

public class Chocolate extends ItemFood{

	public Chocolate() {
		super(7, 0.3f, false);
		setCreativeTab(EasterCraft.tabEasterCraft);
		setTextureName(EasterCraft.MODID + ":" + "chocolate");
		setUnlocalizedName(EasterCraft.MODID + "_" + "Chocolate");
		this.setAlwaysEdible();
	}

}
