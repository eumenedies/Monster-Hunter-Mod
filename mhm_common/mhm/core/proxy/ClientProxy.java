package mhm.core.proxy;

import mhm.MonsterHunterMod;
import mhm.client.renderer.item.BroadSwordRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures()
    {

        MinecraftForgeClient.registerItemRenderer(MonsterHunterMod.ITEM_ID,
                new BroadSwordRenderer());

    }

}
