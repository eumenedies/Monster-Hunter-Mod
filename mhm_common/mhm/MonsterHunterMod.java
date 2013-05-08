package mhm;

import mhm.item.ItemBroadSword;
import mhm.lib.Reference;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MonsterHunterMod {

    // needs to be moved//////////////////////////////////////////

    public final static int ITEM_ID = 5000;
    public static Item broadSword = new ItemBroadSword(ITEM_ID,
            EnumToolMaterial.EMERALD);
    public static EnumAction shield = EnumHelper.addAction("shield");

    // ///////////////////////////////////////////////////////////
    @Instance(Reference.MOD_ID)
    public static MonsterHunterMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static mhm.core.proxy.CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Init
    public void load(FMLInitializationEvent event)
    {

        LanguageRegistry.addName(broadSword, "Broad Sword");

        // Probably Could Also Be Moved//////////////////////////////
        GameRegistry.registerItem(broadSword, "BroadSword");

        // /////////////////////////////////////////////////////////

        proxy.initRenderingAndTextures();

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
