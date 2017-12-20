package sihenzhang.gtaspects;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GTAspects.MODID, version = GTAspects.VERSION, dependencies = "required-after:Thaumcraft@[4.2.3.5,);required-after:IC2")
public class GTAspects
{
    public static final String MODID = "GTAspects";
    public static final String VERSION = "2.0.2";

    @EventHandler
    public void prelude(FMLPreInitializationEvent event) {
        Aspects.initAspects();
    }

    @EventHandler
    public void outro(FMLPostInitializationEvent event) {
        Aspects.addAspects();
    }
}
