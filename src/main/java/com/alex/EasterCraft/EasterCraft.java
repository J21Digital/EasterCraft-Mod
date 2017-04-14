package com.alex.EasterCraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.alex.EasterCraft.foil.*;
import com.alex.EasterCraft.eggs.*;
import com.alex.EasterCraft.eggs.potioneggs.*;

@Mod(modid = EasterCraft.MODID, version = EasterCraft.VERSION)
public class EasterCraft {
	public static final String MODID = "EasterCraft";
	public static final String VERSION = "0.1";
	
	public static Item Chocolate;
	public static Item EggMould;
	
	public static Item ChocolateEgg;
	public static Item MemeEgg;
	public static Item PlainFoilEgg;
	public static Item PlainBlueEgg;
	public static Item PlainGreenEgg;
	public static Item PlainOrangeEgg;
	public static Item PlainPinkEgg;
	public static Item PlainRedEgg;
	public static Item PlainWhiteEgg;
	public static Item PlainYellowEgg;
	
	public static Item PoisonFoilEgg;
	public static Item PoisonBlueEgg;
	public static Item PoisonGreenEgg;
	public static Item PoisonOrangeEgg;
	public static Item PoisonPinkEgg;
	public static Item PoisonRedEgg;
	public static Item PoisonWhiteEgg;
	public static Item PoisonYellowEgg;
	public static Item PoisonChocolateEgg;
	public static Item PoisonMemeEgg;
	
	public static Item Foil;
	public static Item UsedFoil;
	public static Item BlueFoil;
	public static Item GreenFoil;
	public static Item OrangeFoil;
	public static Item PinkFoil;
	public static Item RedFoil;
	public static Item WhiteFoil;
	public static Item YellowFoil;
	
	@EventHandler
    public void init(FMLPreInitializationEvent event) {
		
		//Other
		ChocolateEgg = new ChocolateEgg();
		GameRegistry.registerItem(ChocolateEgg, "ChocolateEgg");
		
		Chocolate = new Chocolate();
		GameRegistry.registerItem(Chocolate, "Chocolate");
		
		EggMould = new EggMould();
		GameRegistry.registerItem(EggMould, "EggMould");
		
		MemeEgg = new MemeEgg();
		GameRegistry.registerItem(MemeEgg, "MemeEgg");
		
		
		//Plain Eggs and Foil
		UsedFoil = new UsedFoil();
		GameRegistry.registerItem(UsedFoil, "UsedFoil");
		
		Foil = new Foil();
		GameRegistry.registerItem(Foil, "Foil");
		
		PlainFoilEgg = new PlainFoilEgg();
		GameRegistry.registerItem(PlainFoilEgg, "PlainFoilEgg");
		
		BlueFoil = new BlueFoil();
		GameRegistry.registerItem(BlueFoil, "BlueFoil");
		
		PlainBlueEgg = new PlainBlueEgg();
		GameRegistry.registerItem(PlainBlueEgg, "PlainBlueEgg");
		
		GreenFoil = new GreenFoil();
		GameRegistry.registerItem(GreenFoil, "GreenFoil");
		
		PlainGreenEgg = new PlainGreenEgg();
		GameRegistry.registerItem(PlainGreenEgg, "PlainGreenEgg");
		
		OrangeFoil = new OrangeFoil();
		GameRegistry.registerItem(OrangeFoil, "OrangeFoil");
		
		PlainOrangeEgg = new PlainOrangeEgg();
		GameRegistry.registerItem(PlainOrangeEgg, "PlainOrangeEgg");
		
		PinkFoil = new PinkFoil();
		GameRegistry.registerItem(PinkFoil, "PinkFoil");
		
		PlainPinkEgg = new PlainPinkEgg();
		GameRegistry.registerItem(PlainPinkEgg, "PlainPinkEgg");
		
		RedFoil = new RedFoil();
		GameRegistry.registerItem(RedFoil, "RedFoil");
		
		PlainRedEgg = new PlainRedEgg();
		GameRegistry.registerItem(PlainRedEgg, "PlainRedEgg");
		
		WhiteFoil = new WhiteFoil();
		GameRegistry.registerItem(WhiteFoil, "WhiteFoil");
		
		PlainWhiteEgg = new PlainWhiteEgg();
		GameRegistry.registerItem(PlainWhiteEgg, "PlainWhiteEgg");
		
		YellowFoil = new YellowFoil();
		GameRegistry.registerItem(YellowFoil, "YellowFoil");
		
		PlainYellowEgg = new PlainYellowEgg();
		GameRegistry.registerItem(PlainYellowEgg, "PlainYellowEgg");
		
		//Poison Eggs
		PoisonFoilEgg = new PoisonFoilEgg();
		GameRegistry.registerItem(PoisonFoilEgg, "PoisonFoilEgg");
		
		PoisonBlueEgg = new PoisonBlueEgg();
		GameRegistry.registerItem(PoisonBlueEgg, "PoisonBlueEgg");
		
		PoisonGreenEgg = new PoisonGreenEgg();
		GameRegistry.registerItem(PoisonGreenEgg, "PoisonGreenEgg");
		
		PoisonOrangeEgg = new PoisonOrangeEgg();
		GameRegistry.registerItem(PoisonOrangeEgg, "PoisonOrangeEgg");
		
		PoisonPinkEgg = new PoisonPinkEgg();
		GameRegistry.registerItem(PoisonPinkEgg, "PoisonPinkEgg");
		
		PoisonRedEgg = new PoisonRedEgg();
		GameRegistry.registerItem(PoisonRedEgg, "PoisonRedEgg");
		
		PoisonWhiteEgg = new PoisonWhiteEgg();
		GameRegistry.registerItem(PoisonWhiteEgg, "PoisonWhiteEgg");
		
		PoisonYellowEgg = new PoisonYellowEgg();
		GameRegistry.registerItem(PoisonYellowEgg, "PoisonYellowEgg");
		
		PoisonMemeEgg = new PoisonMemeEgg();
		GameRegistry.registerItem(PoisonMemeEgg, "PoisonMemeEgg");
		
		PoisonChocolateEgg = new PoisonChocolateEgg();
		GameRegistry.registerItem(PoisonChocolateEgg, "PoisonChocolateEgg");
		
		ModRecipes.addRecipes();
		
	}
	public static final CreativeTabs tabEasterCraft = new CreativeTabs("tabEasterCraft"){
		  @Override public Item getTabIconItem() {
		        return EasterCraft.Chocolate;
		    }
		  
	};
	public static final CreativeTabs tabEasterCraftFoil = new CreativeTabs("tabEasterCraftFoil"){
		  @Override public Item getTabIconItem() {
		        return EasterCraft.Foil;
		    }
		  
	};
	public static final CreativeTabs tabEasterCraftEggs = new CreativeTabs("tabEasterCraftEggs"){
		  @Override public Item getTabIconItem() {
		        return EasterCraft.ChocolateEgg;
		    }
		  
	};
}
