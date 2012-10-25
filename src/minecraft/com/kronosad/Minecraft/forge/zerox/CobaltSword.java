package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class CobaltSword extends ItemSword {

	protected CobaltSword(int itemID, EnumToolMaterial material) {
		super(itemID, material);
	}
	
	
	public String getTextureFile(){
		return "/ZeroxTools.png";
	}
}
