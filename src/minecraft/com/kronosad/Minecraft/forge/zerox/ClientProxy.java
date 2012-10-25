package com.kronosad.Minecraft.forge.zerox;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.*;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

// A client proxy is a handler for ONLY the client.
public class ClientProxy extends CommonProxy{
	
	public static void registerRenderInformation(){
        LanguageRegistry.addName(Zerox.cobaltsword, "Cobalt Sword");
        LanguageRegistry.addName(Zerox.cobaltAxe, "Cobalt Axe");
        LanguageRegistry.addName(Zerox.cobaltOre, "Cobalt Ore");
        LanguageRegistry.addName(Zerox.cobaltPick, "Cobalt Pickaxe");
        LanguageRegistry.addName(Zerox.cobaltIngot, "Cobalt Ingot");
        LanguageRegistry.addName(Zerox.cobaltSpade, "Cobalt Shovel");

	}
	
	
}
