package com.dcm.core;

import com.dcm.EntityDiscoCreeper;
import com.dcm.ModelDiscoCreeper;
import com.dcm.RenderDiscoCreeper;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DiscoCreeperClient extends DiscoCreeperProxy
{
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
        {
    	//Mobs
    	RenderingRegistry.registerEntityRenderingHandler(EntityDiscoCreeper.class, new RenderDiscoCreeper(new ModelDiscoCreeper(), 0.5F));
        }
}
