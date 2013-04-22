package mhm.client.renderer.tileentity;

import mhm.client.model.ModelTutBox;
import mhm.tileentity.TileEntityTutBox;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTutBoxRenderer extends TileEntitySpecialRenderer {
    private ModelTutBox modelTutBox = new ModelTutBox();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y,
            double z, float tick)
    {
        modelTutBox.render((TileEntityTutBox) tileEntity, x, y, z);
    }
}
