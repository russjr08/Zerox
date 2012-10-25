package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class CobaltAxe extends ItemAxe {

	protected CobaltAxe(int itemID, EnumToolMaterial toolMaterial) {
		super(itemID, toolMaterial);
	}
	
	


	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		Zerox.loadRecipes();
		
		return par1ItemStack;
	}




	public String getTextureFile(){
		return "/ZeroxTools.png";
	}

}
