package de.wavesucht.wavelobby.files;

import de.wavesucht.wavelobby.WaveLobby;

public class PermManager {

    private static FileWriter fileWriter = new FileWriter(WaveLobby.getPlugin().getDataFolder().getPath(), "perm.yml");
    public static void  loadFile() {

        setValue("Plugin.Entwickler", "LionGaming_95");
        setValue("Sternchen_Permission", "wave.*");
        setValue("Shop_Edit", "wave.shop.edit");
        setValue("Achievement_Settings", "wave.achievement.edit");
        setValue("Edit_System_Key", "wave.key.edit");
        setValue("Send_Broadcast", "wave.broadcast");
        setValue("Reload_System", "wave.system.reload");
        setValue("Join_Full", "wave.join");
        setValue("Kick_Ignore", "wave.kick.ignore");
        setValue("Prefix", "wave.prefix");
        setValue("SetWarp", "wave.setwarp");
    }

    private static void setValue(String valuePath, String value){
        if (!fileWriter.valueExist(valuePath)){
            fileWriter.setValue(valuePath, value);
            fileWriter.save();
        }
    }

    public static String getString(String valuePath){
        return fileWriter.getString(valuePath);
    }
}