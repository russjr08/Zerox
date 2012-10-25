package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;

/**
 * Created with IntelliJ IDEA.
 * User: russjr08
 * Date: 10/7/12
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleGUI extends GuiScreen {
    public static String tutorialString = "Hello World";

    public ExampleGUI(EntityPlayer player){

    }

    @Override
    public void initGui() {
        controlList.clear();
        controlList.add(new GuiButton(1, width / 2 - 50, height / 2 - 40, 100, 20, "New Button"));
    }

    @Override
    public void actionPerformed(GuiButton button){
         if(button.id == 1){
             tutorialString = "Goodbye World";
         }
    }

    @Override
    public void drawScreen(int i, int j, float f){
        drawDefaultBackground();
        drawCenteredString(fontRenderer, tutorialString, width / 2, height / 2 - 20, 0xffffff);
        super.drawScreen(i, j, f);
    }
}
