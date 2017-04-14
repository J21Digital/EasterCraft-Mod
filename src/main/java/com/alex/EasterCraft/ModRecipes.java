package com.alex.EasterCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void addRecipes() {
		//Egg Mould Recipe
		GameRegistry.addRecipe(new ItemStack(EasterCraft.EggMould, 1),
				
				" A ",
				"ABA",
				" A ",
				'A',new ItemStack(Items.clay_ball,1), 'B',new ItemStack(Items.egg,1));
		
		//Chocolate Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.Chocolate, 8), (new ItemStack(Items.sugar,1)), (new ItemStack(Items.dye, 1, 3)), (new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket))));
		
		//Chocolate Egg Recipe
		GameRegistry.addRecipe(new ItemStack(EasterCraft.ChocolateEgg, 1),
						
						" A ",
						"ABA",
						" A ",
						'A',new ItemStack(EasterCraft.Chocolate,1), 'B',new ItemStack(EasterCraft.EggMould.setContainerItem(EasterCraft.EggMould),1));
		//Meme Egg Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.MemeEgg, 4), (new ItemStack(Items.sugar,3)), (new ItemStack(Items.dye, 1, 11)), (new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket))), (new ItemStack(EasterCraft.ChocolateEgg)));
		
		//Foil Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.Foil, 1), (new ItemStack(Items.iron_ingot)), (new ItemStack(Items.stone_axe.setContainerItem(Items.stone_axe))));
		
		//Coloured Foil Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.BlueFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 4)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.GreenFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 2)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.OrangeFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 14)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PinkFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 9)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.RedFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 1)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.WhiteFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 15)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.YellowFoil, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(Items.dye, 1, 11)));
		
		//Foil Egg Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainFoilEgg, 1), (new ItemStack(EasterCraft.Foil)), (new ItemStack(EasterCraft.ChocolateEgg)));
				
		//Coloured Foil Egg Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainBlueEgg, 1), (new ItemStack(EasterCraft.BlueFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainGreenEgg, 1), (new ItemStack(EasterCraft.GreenFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainOrangeEgg, 1), (new ItemStack(EasterCraft.OrangeFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainPinkEgg, 1), (new ItemStack(EasterCraft.PinkFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainRedEgg, 1), (new ItemStack(EasterCraft.RedFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainWhiteEgg, 1), (new ItemStack(EasterCraft.WhiteFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PlainYellowEgg, 1), (new ItemStack(EasterCraft.YellowFoil)), (new ItemStack(EasterCraft.ChocolateEgg)));
		
		//Smelting Down Used Foil
		GameRegistry.addSmelting(new ItemStack(EasterCraft.UsedFoil), new ItemStack(Items.iron_ingot), 0.3f);
		
		//Poison Egg Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonFoilEgg, 1), (new ItemStack(EasterCraft.PlainFoilEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonBlueEgg, 1), (new ItemStack(EasterCraft.PlainBlueEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonGreenEgg, 1), (new ItemStack(EasterCraft.PlainGreenEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonOrangeEgg, 1), (new ItemStack(EasterCraft.PlainOrangeEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonPinkEgg, 1), (new ItemStack(EasterCraft.PlainPinkEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonRedEgg, 1), (new ItemStack(EasterCraft.PlainRedEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonWhiteEgg, 1), (new ItemStack(EasterCraft.PlainWhiteEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonYellowEgg, 1), (new ItemStack(EasterCraft.PlainYellowEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonMemeEgg, 1), (new ItemStack(EasterCraft.MemeEgg)), (new ItemStack(Items.fermented_spider_eye)));
		GameRegistry.addShapelessRecipe(new ItemStack(EasterCraft.PoisonChocolateEgg, 1), (new ItemStack(EasterCraft.ChocolateEgg)), (new ItemStack(Items.fermented_spider_eye)));
	}
}
