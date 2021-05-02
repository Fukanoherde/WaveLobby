package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ChatManager implements Listener {

    private WaveLobby plugin;
    public ChatManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onChatPerm(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (e.isCancelled()) {
            return;
        }
        if (PermissionsEx.getUser(p.getName()).inGroup("Owner") || PermissionsEx.getUser(p.getName()).inGroup("Admin") ||
                PermissionsEx.getUser(p.getName()).inGroup("SrDev") || PermissionsEx.getUser(p.getName()).inGroup("Dev")
                || PermissionsEx.getUser(p.getName()).inGroup("T-Dev") ||
                PermissionsEx.getUser(p.getName()).inGroup("SrMod") || PermissionsEx.getUser(p.getName()).inGroup("Moderator") ||
                PermissionsEx.getUser(p.getName()).inGroup("T-Mod") ||
                PermissionsEx.getUser(p.getName()).inGroup("SrSupporter") || PermissionsEx.getUser(p.getName()).inGroup("Supporter") ||
                PermissionsEx.getUser(p.getName()).inGroup("T-Supporter") || PermissionsEx.getUser(p.getName()).inGroup("SrBuilder")
                || PermissionsEx.getUser(p.getName()).inGroup("Builder") || PermissionsEx.getUser(p.getName()).inGroup("T-Builder")
                || PermissionsEx.getUser(p.getName()).inGroup("YouTuber") || PermissionsEx.getUser(p.getName()).inGroup("Premium")) {
            return;
        } else {
            e.setCancelled(true);
            p.sendMessage(plugin.Prefix + "§4Error: §cDu musst mindestens den Premium Rang Haben. Um hier Schreiben zu Können!");
        }
    }
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        String msg = e.getMessage();

        if (PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
            e.setFormat("§8[§4Inhaber§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
            e.setFormat("§8[§cAdmin§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrDev")) {
            e.setFormat("§8[§bSrDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
            e.setFormat("§8[§bDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Dev")) {
            e.setFormat("§8[§bT-Dev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrMod")) {
            e.setFormat("§8[§3SrMod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
            e.setFormat("§8[§3Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Mod")) {
            e.setFormat("§8[§3T-Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrSupporter")) {
            e.setFormat("§8[§1SrSupporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
            e.setFormat("§8[§1Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Supporter")) {
            e.setFormat("§8[§1T-Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrBuilder")) {
            e.setFormat("§8[§aSrBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
            e.setFormat("§8[§aBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Builder")) {
            e.setFormat("§8[§aT-Builder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("YouTuber")) {
            e.setFormat("§5" + p.getDisplayName() + " §7» " + msg);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Premium")) {
            e.setFormat("§6" + p.getDisplayName() + " §7» " + msg);
        } else {
            e.setFormat("§8" + p.getDisplayName() + " §7» " + msg);
        }
    }
}