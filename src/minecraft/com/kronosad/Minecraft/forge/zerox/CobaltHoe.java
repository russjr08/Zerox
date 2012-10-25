package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class CobaltHoe extends ItemHoe {

	public CobaltHoe(int itemID, EnumToolMaterial toolMaterial) {
		super(itemID, toolMaterial);
	}

	
	public String getTextureFile(){
		return "/ZeroxTools.png";
	}
}
