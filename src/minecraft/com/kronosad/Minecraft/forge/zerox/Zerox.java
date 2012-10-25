package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = "Zerox", name = "Zerox", version = "1.0a")
@NetworkMod (clientSideRequired = true, serverSideRequired = false, versionBounds = "[1.0a]")

public class Zerox {
	
	@SidedProxy (clientSide = "com.kronosad.Minecraft.forge.zerox.ClientProxy", serverSide = "com.kronosad.Minecraft.forge.zerox.CommonProxy")
	public static CommonProxy proxy;
	public static Item cobaltsword;
	public static Item cobaltAxe;
	public static Item cobaltPick;
	public static Item cobaltIngot;
	public static Block cobaltOre;
	public static Item cobaltSpade;
	public static Item cobaltHoe;
	
	public static int cobaltSwordID, cobaltAxeID, cobaltPickID, cobaltIngotID, cobaltOreID;
	public static int cobaltSpadeID, cobaltHoeID;
	
	public static EnumToolMaterial EnumCobaltToolMaterial = EnumHelper.addToolMaterial("Cobalt", 2, 2000, 10.0F, 8, 15);
	
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent event){
		final Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		cobaltOreID = config.getOrCreateBlockIdProperty("CobaltOre", 500).getInt();
		cobaltAxeID = config.getOrCreateBlockIdProperty("CobaltAxe", 503).getInt();
		cobaltSwordID = config.getOrCreateBlockIdProperty("CobaltSword", 502).getInt();
		cobaltPickID = config.getOrCreateBlockIdProperty("CobaltPick", 504).getInt();
		cobaltIngotID = config.getOrCreateBlockIdProperty("CobaltIngot", 505).getInt();
		cobaltSpadeID = config.getOrCreateBlockIdProperty("CobaltShovel", 506).getInt();
		cobaltHoeID = config.getOrCreateBlockIdProperty("CobaltHoe", 507).getInt();
		config.save();
		System.out.println("[Zerox] Using the following IDs...");
		System.out.println("Cobalt Ore: " + cobaltOreID);
		System.out.println("Cobalt Axe: " + cobaltAxeID);
		System.out.println("Cobalt Sword: " + cobaltSwordID);
		System.out.println("Cobalt Pick: " + cobaltPickID);
		System.out.println("Cobalt Ingot: " + cobaltIngotID);
		System.out.println("Cobalt Shovel: " + cobaltSpadeID);
		System.out.println("Cobalt Hoe: " + cobaltHoeID);		
	}
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		//Define some items/blocks
		cobaltsword = new CobaltSword(cobaltSwordID, EnumCobaltToolMaterial).setItemName("Cobalt Sword").setIconIndex(1);
		cobaltAxe = new CobaltAxe(cobaltAxeID, EnumCobaltToolMaterial).setItemName("Cobalt Axe").setIconIndex(2);
		cobaltPick = new CobaltPickaxe(cobaltPickID, EnumCobaltToolMaterial).setItemName("Cobalt Pickaxe").setIconIndex(3);
		cobaltOre = new BlockCobaltOre(cobaltOreID, 1, Material.iron).setBlockName("Cobalt Ore").setHardness(10F).setResistance(100F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(10F);
		cobaltIngot = new CobaltIngot(cobaltIngotID).setIconIndex(1).setItemName("Cobalt Ingot");
		cobaltSpade = new CobaltSpade(cobaltSpadeID, EnumCobaltToolMaterial).setIconIndex(4).setItemName("Cobalt Shovel");
		cobaltHoe = new CobaltHoe(cobaltHoeID, EnumCobaltToolMaterial).setIconIndex(5).setItemName("Cobalt Hoe");
		
		// Take care of some proxy things
		System.out.println("[Zerox] Mod loaded!");
		proxy.registerRenderInformation();
		ClientProxy.registerRenderInformation();
		
		DungeonHooks dungeon = new DungeonHooks();
		
		dungeon.addDungeonLoot(new ItemStack(cobaltIngot), 5); // Self-Explanatory
		
		// Register event handler (Not used)MinecraftForge.EVENT_BUS.register(new EventHookContainerClass());
		GameRegistry.registerBlock(cobaltOre);
		GameRegistry.registerWorldGenerator(new CobaltWorldGeneration()); // World Gen
		GameRegistry.addSmelting(cobaltOre.blockID, new ItemStack(cobaltIngot, 1), 10.0F); // Self-Explanatory
		// Start recipes
		
		loadRecipes();
		
		
		
		// End Recipes
	}
	public static void loadRecipes(){
		System.out.println("Loading Recipes!");
		// Cobalt Sword Recipes
		GameRegistry.addRecipe(new ItemStack(cobaltsword, 1), new Object[]{
            " C ", " C ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltsword, 1), new Object[]{
            "C  ", "C  ", "S  ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltsword, 1), new Object[]{
            "  C", "  C", "  S", 'C', cobaltIngot, 'S', Item.stick
		});
		// Cobalt Axe Recipes
		
		GameRegistry.addRecipe(new ItemStack(cobaltAxe, 1), new Object[]{
            "CC ", "CS ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltAxe, 1), new Object[]{
            " CC", " SC", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		// Cobalt Pickaxe recipe
		
		GameRegistry.addRecipe(new ItemStack(cobaltPick, 1), new Object[]{
            "CCC", " S ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		// Cobalt Shovel Recipes
		
		GameRegistry.addRecipe(new ItemStack(cobaltSpade, 1), new Object[]{
            " C ", " S ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltSpade, 1), new Object[]{
            "C  ", "S  ", "S  ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltSpade, 1), new Object[]{
            "  C", "  S", "  S", 'C', cobaltIngot, 'S', Item.stick
		});
		
		// Cobalt Hoe Recipes
		
		GameRegistry.addRecipe(new ItemStack(cobaltHoe, 1), new Object[]{
            "CC ", " S ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(cobaltHoe, 1), new Object[]{
            " CC", " S ", " S ", 'C', cobaltIngot, 'S', Item.stick
		});
		
		
	}
	@PreInit
	public void PreLoad(FMLPreInitializationEvent event){
		System.out.println("Mod initialized!");
	}

	
}
