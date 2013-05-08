package mhm.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelShield extends ModelBase {
    private IModelCustom modelShield;

    public ModelShield()
    {
        modelShield = AdvancedModelLoader
                .loadModel("/mods/mhm/models/shield.obj");
    }

    public void render()
    {
        modelShield.renderAll();
    }
    

}
