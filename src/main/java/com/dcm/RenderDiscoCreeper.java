package com.dcm;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.dcm.core.DiscoCreeper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderDiscoCreeper extends RenderLiving
{
	private static final ResourceLocation DiscoCreepertexture = new ResourceLocation(DiscoCreeper.modid, "Textures/DiscoCreeper.png");
	private static final ResourceLocation DiscoCreepertexture1 = new ResourceLocation(DiscoCreeper.modid, "Textures/DiscoCreeper_1.png");
	private static final ResourceLocation DiscoCreepertexture2 = new ResourceLocation(DiscoCreeper.modid, "Textures/DiscoCreeper_2.png");
	private static final ResourceLocation DiscoCreepertexture3 = new ResourceLocation(DiscoCreeper.modid, "Textures/DiscoCreeper_3.png");
	private static final ResourceLocation DiscoCreepertexture4 = new ResourceLocation(DiscoCreeper.modid, "Textures/DiscoCreeper_4.png");
	 protected ResourceLocation func_110872_a(EntityDiscoCreeper par1Entity)
	    {
	    	int i = par1Entity.TextureID();
	    	switch(i)
	    	{
	    	case 0:
	    		default:
	    		return DiscoCreepertexture1;
	    	case 1:
	    		return DiscoCreepertexture2;
	    	case 2:
	    		return DiscoCreepertexture3;
	    	case 3:
	    		return DiscoCreepertexture;
	    	case 4:
	    		return DiscoCreepertexture4;
	    	}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityDiscoCreeper)par1Entity);
	    }
	
    public RenderDiscoCreeper(ModelBase var1, float var2)
    {
        super(var1, var2);
    }

    public void renderDiscoCreeper(EntityDiscoCreeper var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRender(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDiscoCreeper((EntityDiscoCreeper)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDiscoCreeper((EntityDiscoCreeper)var1, var2, var4, var6, var8, var9);
    } 
}