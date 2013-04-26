package mhm.item;

import mhm.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;

public class ItemBroadSword extends MHMSwordAndShield {

    public ItemBroadSword(int id, EnumToolMaterial material)
    {
        super(id, material);
        this.setFull3D();
        this.setUnlocalizedName("broadsword");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setMaxDamage(20000);
        this.setMaxStackSize(1);
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
