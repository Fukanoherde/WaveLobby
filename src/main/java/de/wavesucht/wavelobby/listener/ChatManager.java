package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatManager implements Listener {

    private WaveLobby plugin;
    public ChatManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onChatPerm(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        LuckPerms api = LuckPermsProvider.get();
        User user = api.getUserManager().getUser(p.getUniqueId());
        Group group = api.getGroupManager().getGroup(user.getPrimaryGroup());

        if (e.isCancelled()) {
            return;
        }
        if (group.getName().equals("Spieler")) {
            e.setCancelled(true);
            p.sendMessage(plugin.Prefix + "§4Error: §cDu musst mindestens den Premium Rang Haben. Um hier Schreiben zu Können!");
        } else {
            return;
        }
    }
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        LuckPerms api = LuckPermsProvider.get();
        User user = api.getUserManager().getUser(p.getUniqueId());
        Group group = api.getGroupManager().getGroup(user.getPrimaryGroup());

        String msg = e.getMessage();

        if (group.getName().equals("Owner")) {
            e.setFormat("§8[§4Inhaber§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Admin")) {
            e.setFormat("§8[§cAdmin§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("SrDev")) {
            e.setFormat("§8[§bSrDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Dev")) {
            e.setFormat("§8[§bDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("T-Dev")) {
            e.setFormat("§8[§bT-Dev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("SrMod")) {
            e.setFormat("§8[§3SrMod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Mod")) {
            e.setFormat("§8[§3Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("T-Mod")) {
            e.setFormat("§8[§3T-Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("SrSupporter")) {
            e.setFormat("§8[§1SrSupporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Supporter")) {
            e.setFormat("§8[§1Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("T-Supporter")) {
            e.setFormat("§8[§1T-Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("SrBuilder")) {
            e.setFormat("§8[§aSrBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Builder")) {
            e.setFormat("§8[§aBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("T-Builder")) {
            e.setFormat("§8[§aT-Builder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("YouTuber")) {
            e.setFormat("§5" + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("Premium")) {
            e.setFormat("§6" + p.getDisplayName() + " §7» " + msg);
        } else {
            e.setFormat("§8" + p.getDisplayName() + " §7» " + msg);
        }
    }
}