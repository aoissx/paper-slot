package net.isksss.mc.paperslot.utils;

import net.kyori.adventure.text.Component;

public class Config {

    public static final String CMD = "slot";
    public static enum SUB_CMD {
        ADD,
        REMOVE,
        HELP,
        LIST
    };

    public static enum Tags{
        SLOT_ADD_TAG,
        SLOT_REMOVE_TAG,
        SLOT_PLAYING_TAG
    }

    /*
     * テキストコンポーネント
     */
    public static Component text(String msg){
        return Component.text("§a§l[PaperSlot] §r§a"+msg);
    }

    public static Component error(String msg){
        return Component.text("§c§l[PaperSlot] §r§c"+msg);
    }


}
