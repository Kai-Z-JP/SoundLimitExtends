package jp.kaiz.soundlimitextends;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import paulscode.sound.SoundSystemConfig;

@Mod(modid = SoundLimitExtends.MODID, version = SoundLimitExtends.VERSION, name = SoundLimitExtends.MODID)
public class SoundLimitExtends {
    public static final String MODID = "soundlimitextends";

    public static final String VERSION = "1.12.2-1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SoundSystemConfig.setNumberNormalChannels(1024);
        SoundSystemConfig.setNumberStreamingChannels(32);
    }
}