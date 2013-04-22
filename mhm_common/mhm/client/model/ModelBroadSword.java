package mhm.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBroadSword extends ModelBase {
    private IModelCustom modelBroadSword;

    public ModelBroadSword()
    {
        modelBroadSword = AdvancedModelLoader
                .loadModel("/mods/mhm/models/DemonSword.obj");
    }

    public void render()
    {
        modelBroadSword.renderAll();
    }

}
