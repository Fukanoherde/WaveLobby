package de.wavesucht.wavelobby.files;

import de.wavesucht.wavelobby.WaveLobby;

public class LobbyItems {

    private static FileWriter fileWriter = new FileWriter(WaveLobby.getPlugin().getDataFolder().getPath(), "items.yml");
    public static void  loadFile() {

        setValue("Plugin.Entwickler", "LionGaming_95");
        setValue("Info.Slot", "0 1 2 3 4 5 6 7 8");

        // Navigator Name \\

        setValue("Navigator.Placeholder", " ");
        setValue("Navigator.Close", "&3Schließen");
        setValue("Navigator.Next", "&6▶ &6Weiter");
        setValue("Navigator.Preview", "&6Back");
        setValue("Navigator.Remove.all", "&6Alles Entfernen");
        setValue("Navigator.Remove.1", "&cEntfernen");
        setValue("Navigator.Name", "&6✪ &3Navigator &6✪");

        // Hotbar Items Name and Slots \\

        setValue("Item.Hotbar.Name.Navigator", "&6✪ &3Navigator &6✪");
        setValue("Item.Hotbar.Name.Lobby", "&6✪ &3Lobby Switcher &6✪");
        setValue("Item.Hotbar.Name.PlayerHider.off", "&6✪ &3Spieler Verstecken &6✪");
        setValue("Item.Hotbar.Name.PlayerHider.on", "&6✪ &3Spieler Anzeigen &6✪");
        setValue("Item.Hotbar.Name.UserMenu", "&6✪ &3Spieler Menu &6✪");
        setValue("Item.Hotbar.Name.Gadgets", "&6✪ &3Keine Gadgets &6✪");

        // LobbySwitcher \\

        setValue("LobbySwitcher.Lobby.Default.1", "&6▶ &3Lobby-1");
        setValue("LobbySwitcher.Lobby.Default.2", "&6▶ &3Lobby-2");
        setValue("LobbySwitcher.Lobby.Default.3", "&6▶ &3Lobby-3");
        setValue("LobbySwitcher.Lobby.Premium.1", "&6▶ &5Premium-Lobby-1");
        setValue("LobbySwitcher.Lobby.Premium.2", "&6▶ &5Premium-Lobby-2");

        // Navigator Name \\

        setValue("Navigator.Spawn", "&6✪ &3Spawn &6✪");
        setValue("Navigator.Game.1", "&6✪ &3Game 1 &6✪");
        setValue("Navigator.Game.2", "&6✪ &3Game 2 &6✪");
        setValue("Navigator.Game.3", "&6✪ &3Game 3 &6✪");
        setValue("Navigator.Game.4", "&6✪ &3Game 4 &6✪");
        setValue("Navigator.Game.Name.Spawn", "&3Spawn ");
        setValue("Navigator.Game.Name.1", "&3BedWars ");
        setValue("Navigator.Game.Name.2", "&3KnockIt");
        setValue("Navigator.Game.Name.3", "&3Projekt X ");
        setValue("Navigator.Game.Name.4", "&3User Wunsch ");

        // Gui Items Name \\

        setValue("Item.Hotbar.Name.HeadMenu", "&6✪ &3Heads Menu &6✪");
        setValue("Item.Gui.Heads.01", "&6✪ &3Heads &6✪");
        setValue("Item.Gui.Heads.0", "&6✪ &3Normale Köpfe &6✪");
        setValue("Item.Gui.Heads.1", "&6✪ &3Team Köpfe &6✪");
        setValue("Item.Gui.Heads.2", "&6✪ &3YouTuber Köpfe &6✪");
        setValue("Item.Gui.Heads.3", "&6✪ &3Blöcke &6✪");
        setValue("Item.Gui.Gadget", "&6✪ &3Gadgets &6✪");
        setValue("Item.Gui.Banner", "&6✪ &3Banner &6✪");
        setValue("Item.Gui.Ballon", "&6✪ &3Ballon &6✪");
        setValue("Item.Gui.Pets", "&6✪ &3Pets &6✪");
        setValue("Item.Gui.Friends", "&6✪ &3Freunde &6✪");
        setValue("Item.Gui.Shop", "&6✪ &3Shop &6✪");
        setValue("Item.Gui.FAQ", "&6✪ &3FAQ &6✪");
        setValue("Item.Gui.Boots", "&6✪ &3Boots &6✪");

        // Gui Gadgets Name \\

        setValue("Gui.Gadgets.Enderpearl", "&6✪ &3EnderPerl &6✪");
        setValue("Gui.Gadgets.Enterhacken", "&6✪ &3Enterhacken &6✪");
        setValue("Gui.Gadgets.Speed", "&6✪ &3Lauf um dein Leben &6✪");
        setValue("Gui.Gadgets.TrollTNT", "&6✪ &3Troller &6✪");
        setValue("Gui.Gadgets.Boots", "&6✪ &3Boots &6✪");

        // Gadget TrollTNT_Name \\

        setValue("Item.Gui.Gadgets.TrollTNT.Laden", "&6✪ &4... LÄDT ... &6✪");

        // Name Boots \\

        setValue("Gui.Boots.Love", "&6▶ &3Schue voller Liebe");
        setValue("Gui.Boots.Water", "&6▶ &3Schuhe von Poseidon");
        setValue("Gui.Boots.Flame", "&6▶ &3Schuhe aus den Feuer");
        setValue("Gui.Boots.Lava", "&6▶ &3Schuhe aus der Hölle");
        setValue("Gui.Boots.Magic", "&6▶ &3Schuhe vom Magier");
        setValue("Gui.Boots.Rainbow", "&6▶ &3Da ist wohl ein Einhorn drinne");
        setValue("Gui.Boots.Happy", "&6▶ &3Happy Day");
        setValue("Gui.Boots.Angry", "&6▶ &3GRRRRRRR");
        setValue("Gui.Boots.Ninja", "&6▶ &3Schwarzer Rauch");
        setValue("Gui.Boots.Explode", "&6▶ &3Boom");
        setValue("Gui.Boots.on", "&6▶ &3Spezi");

        // Gadgets Banner Name \\

        setValue("Item.Gui.Gadgets.Name.Banner_White", "&6▶ &3Banner White &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Orange", "&6▶ &3Banner Orange &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Magenta", "&6▶ &3Banner Magenta &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Light_Blue", "&6▶ &3Banner Light Blue &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Yellow", "&6▶ &3Banner Yellow &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Light_Green", "&6▶ &3Banner Light Green &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Pink", "&6▶ &3Banner Pink &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Gray", "&6▶ &3Banner Gray &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Light_Gray", "&6▶ &3Banner Light Gray &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Cyan", "&6▶ &3Banner Cyan &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Lime", "&6▶ &3Banner Lime &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Blue", "&6▶ &3Banner Blue &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Brown", "&6▶ &3Banner Brown &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Green", "&6▶ &3Banner Green &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Red", "&6▶ &3Banner Red &6◀");
        setValue("Item.Gui.Gadgets.Name.Banner_Black", "&6▶ &3Banner Black &6◀");

        // Gadgets Banner Perms \\

        setValue("Item.Gui.Gadgets.Perm.Banner.All", "lobby.banner.*");
        setValue("Item.Gui.Gadgets.Perm.Banner.LightAll", "lobby.banner.color.light");
        setValue("Item.Gui.Gadgets.Perm.Banner_Light_Blue", "lobby.banner.light.blue");
        setValue("Item.Gui.Gadgets.Perm.Banner_Light_Green", "lobby.banner.light.green");
        setValue("Item.Gui.Gadgets.Perm.Banner_Light_Gray", "lobby.banner.light.gray");
        setValue("Item.Gui.Gadgets.Perm.Banner_White", "lobby.banner.white");
        setValue("Item.Gui.Gadgets.Perm.Banner_Orange", "lobby.banner.orange");
        setValue("Item.Gui.Gadgets.Perm.Banner_Magenta", "lobby.banner.magenta");
        setValue("Item.Gui.Gadgets.Perm.Banner_Yellow", "lobby.banner.yellow");
        setValue("Item.Gui.Gadgets.Perm.Banner_Pink", "lobby.banner.pink");
        setValue("Item.Gui.Gadgets.Perm.Banner_Gray", "lobby.banner.gray");
        setValue("Item.Gui.Gadgets.Perm.Banner_Cyan", "lobby.banner.cyan");
        setValue("Item.Gui.Gadgets.Perm.Banner_Lime", "lobby.banner.lime");
        setValue("Item.Gui.Gadgets.Perm.Banner_Blue", "lobby.banner.blue");
        setValue("Item.Gui.Gadgets.Perm.Banner_Brown", "lobby.banner.brown");
        setValue("Item.Gui.Gadgets.Perm.Banner_Green", "lobby.banner.green");
        setValue("Item.Gui.Gadgets.Perm.Banner_Red", "lobby.banner.red");

        // Gadgets Perms \\

        setValue("Item.Gui.Gadgets.Perm.Enderpearl", "lobby.gadget.enderpearl");
        setValue("Item.Gui.Gadgets.Perm.Enterhacken", "lobby.gadget.enterhacken");
        setValue("Item.Gui.Gadgets.Perm.TrollTNT", "lobby.gadget.trolltnt");
        setValue("Item.Gui.Gadgets.Perm.Speed", "lobby.gadget.speed");

        // Gadgets Boots Perms \\

        setValue("Gui.Boots.Perm.*", "lobby.boots.*");
        setValue("Gui.Boots.Perm.Love", "lobby.boots.love");
        setValue("Gui.Boots.Perm.Water", "lobby.boots.water");
        setValue("Gui.Boots.Perm.Flame", "lobby.boots.flame");
        setValue("Gui.Boots.Perm.Lava", "lobby.boots.lava");
        setValue("Gui.Boots.Perm.Magic", "&lobby.boots.magic");
        setValue("Gui.Boots.Perm.Rainbow", "lobby.boots.rainbow");
        setValue("Gui.Boots.Perm.Happy", "lobby.boots.happy");
        setValue("Gui.Boots.Perm.Angry", "lobby.boots.angry");
        setValue("Gui.Boots.Perm.Ninja", "lobby.boots.ninja");
        setValue("Gui.Boots.Perm.Explode", "lobby.boots.explode");
        setValue("Gui.Boots.Perm.on", "lobby.boots.on");
    }

    private static void setValue(String valuePath, String value){
        if (!fileWriter.valueExist(valuePath)){
            fileWriter.setValue(valuePath, value);
            fileWriter.save();
        }
    }

    public static Object getValue(String valuePath){
        return fileWriter.getObject(valuePath);
    }
}