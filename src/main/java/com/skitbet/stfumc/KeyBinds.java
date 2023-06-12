package com.skitbet.stfumc;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinds {
    public static final String KEY_CATEGORY = "";
    public static final String KEY_MUTE_MASTER = "key.stfumc.master";
    public static final String KEY_MUTE_BLOCKS = "key.stfumc.blocks";
    public static final String KEY_MUTE_MUSIC = "key.stfumc.music";
    public static final String KEY_MUTE_AMBIENT = "key.stfumc.ambient";
    public static final String KEY_MUTE_HOSTILE = "key.stfumc.hostile";
    public static final String KEY_MUTE_NEUTRAL = "key.stfumc.neutral";
    public static final String KEY_MUTE_PLAYERS = "key.stfumc.players";
    public static final String KEY_MUTE_RECORDS = "key.stfumc.records";
    public static final String KEY_MUTE_VOICE = "key.stfumc.voice";
    public static final String KEY_MUTE_WEATHER = "key.stfumc.weather";

    public static final KeyMapping MASTER = new KeyMapping(KEY_MUTE_MASTER, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V, KEY_CATEGORY);
    public static final KeyMapping BLOCKS = new KeyMapping(KEY_MUTE_BLOCKS, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_9, KEY_CATEGORY);
    public static final KeyMapping MUSIC = new KeyMapping(KEY_MUTE_MUSIC, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_8, KEY_CATEGORY);
    public static final KeyMapping AMBIENT = new KeyMapping(KEY_MUTE_AMBIENT, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_7, KEY_CATEGORY);
    public static final KeyMapping HOSTILE = new KeyMapping(KEY_MUTE_HOSTILE, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_6, KEY_CATEGORY);
    public static final KeyMapping NEUTRAL = new KeyMapping(KEY_MUTE_NEUTRAL, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_5, KEY_CATEGORY);
    public static final KeyMapping PLAYERS = new KeyMapping(KEY_MUTE_PLAYERS, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_4, KEY_CATEGORY);
    public static final KeyMapping RECORDS = new KeyMapping(KEY_MUTE_RECORDS, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_3, KEY_CATEGORY);
    public static final KeyMapping VOICE = new KeyMapping(KEY_MUTE_VOICE, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_2, KEY_CATEGORY);
    public static final KeyMapping WEATHER = new KeyMapping(KEY_MUTE_WEATHER, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_KP_1, KEY_CATEGORY);

}
