package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;


// Common proxy is a handler for both the server and client
public class CommonProxy implements IGuiHandler{
	
	
	public static void registerRenderInformation(){
		// Keep clear on a server
	}
	
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		return null;
	}

}
