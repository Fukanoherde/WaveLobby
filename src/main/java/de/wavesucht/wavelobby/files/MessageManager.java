package de.wavesucht.wavelobby.files;

import de.wavesucht.wavelobby.WaveLobby;

public class MessageManager {

    private static FileWriter fileWriter = new FileWriter(WaveLobby.getPlugin().getDataFolder().getPath(), "perm.yml");
    public static void  loadFile() {

        setValue("Plugin.Entwickler", "LionGaming_95");
        setValue("Message.Use", "&bVerwendung: ");
        setValue("Message.ForRealPlayer", "&4Dieser Befehl ist nur für Spieler");
        setValue("Message.NoPerm", "&cDeine Anfrage konnte nicht bearbeitet werden! Grund: &4Fehlende Rechte...");
        setValue("Message.ActivateBuild", "&aDu kannst nun Bauen.");
        setValue("Message.DeactivateBuild", "&cDu kannst nun nicht mehr Bauen.");
        setValue("Message.RemoveAllowOPToPlayer", "&aDu hast dem Spieler &6%target% &adie Erlaubnis Op zu besitzen &centzogen");
        setValue("Message.SetAllowOPToPlayer", "&aDu hast dem Spieler &6%target% &adie Erlaubnis gegeben, Op zu besitzen");
        setValue("Message.ChatCleared", "&aDer Chat wurde von &4:%player% &ageleert!");
        setValue("Message.PlayerNotFound", "&cDieser Spieler war noch nie auf diesen Server");
        setValue("Message.SetWarp", "&3Du hast den Warp für &a:%warp% &3erfolgreich gesetzt!");
        setValue("Message.NotFoundWarp.Spawn", "&4Es wurde kein Spawn gefunden. &cBitte gebe einen Teammitglied Bescheid!");
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