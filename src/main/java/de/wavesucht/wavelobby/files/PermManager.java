package de.wavesucht.wavelobby.files;

import de.wavesucht.wavelobby.WaveLobby;

public class PermManager {

    private static FileWriter fileWriter = new FileWriter(WaveLobby.getPlugin().getDataFolder().getPath(), "perm.yml");
    public static void  loadFile() {

        setValue("Plugin.Entwickler", "LionGaming_95");
        setValue("Perms.all", "lobby.*");
        setValue("Perms.setwarp", "lobby.setwarp");
        setValue("Perms.admin", "lobby.admin");
        setValue("Perms.premium", "lobby.premium");
        setValue("Perms.cc", "lobby.chat.clear");
        setValue("Perms.build", "lobby.build");
        setValue("Perms.entity", "lobby.entity");
        setValue("Perms.inventory", "lobby.gm");
        setValue("Perms.Nick", "lobby.nick");
    }

    private static void setValue(String valuePath, String value){
        if (!fileWriter.valueExist(valuePath)){
            fileWriter.setValue(valuePath, value);
            fileWriter.save();
        }
    }

    public static String getValue(String valuePath){
        return fileWriter.getString(valuePath);
    }
}