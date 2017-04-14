package com.alex.EasterCraft.eggs.potioneggs;

import com.alex.EasterCraft.EasterCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class PoisonFoilEgg extends ItemFood{

	public PoisonFoilEgg() {
		super(6, 0.5f, false);
		setCreativeTab(EasterCraft.tabEasterCraftEggs);
		setTextureName(EasterCraft.MODID + ":" + "poisonedfoilegg");
		setUnlocalizedName(EasterCraft.MODID + "_" + "PoisonFoilEgg");
		setPotionEffect(Potion.poison.id, 5, 0, 1.0f);
		this.setAlwaysEdible();
	}
	
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onEaten(itemstack, world, player);
        return new ItemStack(EasterCraft.UsedFoil);
    }

}
