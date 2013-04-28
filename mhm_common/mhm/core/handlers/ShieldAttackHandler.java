package mhm.core.handlers;

import mhm.MonsterHunterMod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class ShieldAttackHandler {
    

    @ForgeSubscribe
    public void onEntityInteractEvent(EntityInteractEvent event)
    {
        if (event.target instanceof EntityLiving)
        {
            if (!(event.target instanceof EntityVillager))
            {
                if (event.entityPlayer.inventory.getCurrentItem() != null)
                {
                    if (event.entityPlayer.inventory.getCurrentItem().itemID == MonsterHunterMod.broadSword.itemID)
                    {

                        event.target.setFire(15);
                    }
                }
            }
        }
    }
}
