package com.mofoods;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoFoodsCore.MODID, name = MoFoodsCore.NAME, version = MoFoodsCore.VERSION)
public class MoFoodsCore {
	public static final String MODID = "mofoodscore";
	public static final String NAME = "Mo' Foods";
	public static final String VERSION = "0.0.1";
	@SidedProxy(clientSide = MODID + ".ProxyClient", serverSide = MODID + ".ProxyServer")
	public static ProxyCommon proxy;
	@Mod.Instance
	public static MoFoodsCore instance;
	public static Logger logger;

	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
       logger = event.getModLog();
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
