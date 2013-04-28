package mhm.item;

import mhm.MonsterHunterMod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class MHMSwordAndShield extends ItemSword {

    public MHMSwordAndShield(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    
    public boolean itemInteractionForEntity(ItemStack itemStack, EntityLiving entity)
    {
        if (entity instanceof EntityLiving && !(entity instanceof EntityVillager))
        {
            entity.setVelocity(0, 5, 0);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return MonsterHunterMod.shield;
    }

}
