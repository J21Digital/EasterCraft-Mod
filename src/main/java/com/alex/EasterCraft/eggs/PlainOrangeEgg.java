package com.alex.EasterCraft.eggs;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PlainOrangeEgg extends ItemFood{

	public PlainOrangeEgg() {
		super(6, 0.5f, false);
		setCreativeTab(EasterCraft.tabEasterCraftEggs);
		setTextureName(EasterCraft.MODID + ":" + "orangewrappedegg");
		setUnlocalizedName(EasterCraft.MODID + "_" + "PlainOrangeEgg");
		this.setAlwaysEdible();
	}
	
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onEaten(itemstack, world, player);
        return new ItemStack(EasterCraft.UsedFoil);
    }

}
