package mhm.core.proxy;

import mhm.MonsterHunterMod;
import mhm.item.ItemBroadSword;
import net.minecraft.creativetab.CreativeTabs;

public class CommonProxy {

    public void initMod()
    {
        MonsterHunterMod.broadSword = new ItemBroadSword(
                MonsterHunterMod.ITEM_ID).setFull3D()
                .setUnlocalizedName("broadsword")
                .setCreativeTab(CreativeTabs.tabCombat);
    }

    public void initRenderingAndTextures()
    {

    }

}
