package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class CobaltPickaxe extends ItemPickaxe {

	protected CobaltPickaxe(int itemID, EnumToolMaterial toolMaterial) {
		super(itemID, toolMaterial);
		
	}
	
	
	public String getTextureFile(){
		return "/ZeroxTools.png";
	}

}
