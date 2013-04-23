package mhm.client.renderer.item;

import mhm.client.model.ModelBroadSword;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class BroadSwordRenderer implements IItemRenderer {

    protected ModelBroadSword modelBroadSword;

    public BroadSwordRenderer()
    {
        modelBroadSword = new ModelBroadSword();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch (type)
        {
            case EQUIPPED:
                return true;
            default:
                return false;
        }

    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper)
    {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch (type)
        {
            case EQUIPPED:
            {
                renderSword(-2.2F, 3.5F, 0.0F, 1.0F);

                return;
            }
            default:
                break;
        }

    }

    private void renderSword(float x, float y, float z, float scale)
    {

        GL11.glPushMatrix();

        // Scale, Translate, Rotate
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(-140F, 0F, 0F, 1F);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine
        .bindTexture("/mods/mhm/textures/models/AxeColor.jpg");

        // Render
        modelBroadSword.render();

        GL11.glPopMatrix();
    }

}