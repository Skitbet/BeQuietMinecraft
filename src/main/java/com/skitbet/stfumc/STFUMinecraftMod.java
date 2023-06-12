package com.skitbet.stfumc;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.SoundOptionsScreen;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;
import oshi.hardware.SoundCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod(STFUMinecraftMod.MODID)
public class STFUMinecraftMod
{

    /**
     * i hate coding with forge and fabric too much static shit
     */

    public static final String MODID = "stfumc";


    public static Map<SoundSource, Float> savedVolumes;
    public static List<SoundSource> mutedSounds;

    public STFUMinecraftMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        savedVolumes = new HashMap<>();
        mutedSounds = new ArrayList<>();
    }

    public static void updateAudio(SoundSource source) {
        Options options = Minecraft.getInstance().options;
        SoundManager soundManager = Minecraft.getInstance().getSoundManager();

        if (mutedSounds.contains(source)) {
            mutedSounds.remove(source);

            soundManager.updateSourceVolume(source, savedVolumes.get(source));
            Minecraft.getInstance().player.displayClientMessage(Component.literal("Un-muted the " + source + " audio!"), false);
        }else{
            savedVolumes.put(source, options.getSoundSourceVolume(source));
            mutedSounds.add(source);

            soundManager.updateSourceVolume(source, 0);
            Minecraft.getInstance().player.displayClientMessage(Component.literal("Muted the " + source + " audio!"), false);
        }
    }

}
