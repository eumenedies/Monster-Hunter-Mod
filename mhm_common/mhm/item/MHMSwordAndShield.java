package mhm.item;

import mhm.MonsterHunterMod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class MHMSwordAndShield extends ItemSword {

    public MHMSwordAndShield(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack itemStack,
            EntityLiving entity)
    {
        if (entity instanceof EntityLiving
                && !(entity instanceof EntityVillager))
        {
            entity.setVelocity(0, 5, 0);
            return true;
        } else
            return false;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
            EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack,
            EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
            int par6, int par7, float par8, float par9, float par10)
    {
        return false;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return MonsterHunterMod.shield;
    }

}
