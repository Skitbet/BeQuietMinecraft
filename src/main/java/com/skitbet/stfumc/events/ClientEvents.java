package com.skitbet.stfumc.events;

import com.skitbet.stfumc.KeyBinds;
import com.skitbet.stfumc.STFUMinecraftMod;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = STFUMinecraftMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinds.MASTER.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.MASTER);
            }
            else if (KeyBinds.BLOCKS.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.BLOCKS);
            }
            else if (KeyBinds.MUSIC.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.MUSIC);
            }
            else if (KeyBinds.AMBIENT.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.AMBIENT);
            }
            else if (KeyBinds.HOSTILE.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.HOSTILE);
            }
            else if (KeyBinds.NEUTRAL.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.NEUTRAL);
            }
            else if (KeyBinds.PLAYERS.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.PLAYERS);
            }
            else if (KeyBinds.RECORDS.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.RECORDS);
            }
            else if (KeyBinds.VOICE.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.VOICE);
            }
            else if (KeyBinds.WEATHER.isDown()) {
                STFUMinecraftMod.updateAudio(SoundSource.WEATHER);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = STFUMinecraftMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinds.MASTER);
            event.register(KeyBinds.MUSIC);
            event.register(KeyBinds.AMBIENT);
            event.register(KeyBinds.HOSTILE);
            event.register(KeyBinds.NEUTRAL);
            event.register(KeyBinds.BLOCKS);
            event.register(KeyBinds.PLAYERS);
            event.register(KeyBinds.RECORDS);
            event.register(KeyBinds.VOICE);
            event.register(KeyBinds.WEATHER);
        }
    }



}
