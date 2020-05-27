package jp.kaiz.soundlimitextends;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import paulscode.sound.SoundSystemConfig;

@Mod(modid = SoundLimitExtends.MODID, version = SoundLimitExtends.VERSION, name = SoundLimitExtends.MODID)
public class SoundLimitExtends {
    public static final String MODID = "SoundLimitExtends";

    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SoundSystemConfig.setNumberNormalChannels(1024);
        SoundSystemConfig.setNumberStreamingChannels(32);
    }
}