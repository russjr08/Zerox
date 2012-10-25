package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.*;

public class BlockForgeBlock extends Block{
	
	public BlockForgeBlock(int id, int textureNum, Material material){
		super(id, textureNum, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4){
        System.out.println("Oh you've added me! :D");
    }

    public static void openGUI(EntityPlayer player){
        ModLoader.openGUI(player, new ExampleGUI(player));
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
        openGUI(player);
        return false;
    }
}
