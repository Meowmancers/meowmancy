package meowmancers.meowmancy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = meowmancy.MODID, name = meowmancy.MODNAME, version = meowmancy.MODVERSION, dependencies = "required-after:Forge@[11.16.0.1865,)", useMetadata = true)


public class meowmancy {
	public static final String MODID = "meowmancy";
    public static final String MODNAME = "Mod tutorials";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "meowmancers.meowmancy.proxy.ClientProxy", serverSide = "meowmancers.meowmancy.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static meowmancy instance;

    //public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
   //     logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
