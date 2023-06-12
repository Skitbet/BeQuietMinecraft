package com.skitbet.bequite.events;

import com.skitbet.bequite.BeQuietMCMod;
import com.skitbet.bequite.KeyBinds;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = BeQuietMCMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinds.MASTER.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.MASTER);
            }
            else if (KeyBinds.BLOCKS.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.BLOCKS);
            }
            else if (KeyBinds.MUSIC.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.MUSIC);
            }
            else if (KeyBinds.AMBIENT.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.AMBIENT);
            }
            else if (KeyBinds.HOSTILE.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.HOSTILE);
            }
            else if (KeyBinds.NEUTRAL.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.NEUTRAL);
            }
            else if (KeyBinds.PLAYERS.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.PLAYERS);
            }
            else if (KeyBinds.RECORDS.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.RECORDS);
            }
            else if (KeyBinds.VOICE.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.VOICE);
            }
            else if (KeyBinds.WEATHER.isDown()) {
                BeQuietMCMod.updateAudio(SoundSource.WEATHER);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = BeQuietMCMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
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
