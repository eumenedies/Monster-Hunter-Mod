package mhm.core.proxy;

import mhm.MonsterHunterMod;
import mhm.client.renderer.item.BroadSwordRenderer;
import mhm.core.handlers.ShieldAttackHandler;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures()
    {

        MinecraftForgeClient.registerItemRenderer(
                MonsterHunterMod.ITEM_ID + 256, new BroadSwordRenderer());

    }

    @Override
    public void registerHandlers()
    {
        MinecraftForge.EVENT_BUS.register(new ShieldAttackHandler());
    }

}
