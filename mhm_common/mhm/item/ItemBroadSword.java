package mhm.item;

import mhm.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBroadSword extends Item {

    public ItemBroadSword(int id)
    {
        super(id);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                + ":"
                + this.getUnlocalizedName().substring(
                        this.getUnlocalizedName().indexOf(".") + 1));
    }

}
