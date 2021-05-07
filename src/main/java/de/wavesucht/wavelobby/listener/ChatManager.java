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
        if (e.isCancelled()) {
            return;
        }
        LuckPerms api = LuckPermsProvider.get();
        User user = api.getUserManager().getUser(p.getUniqueId());
        Group group = api.getGroupManager().getGroup(user.getPrimaryGroup());

        if (group.getName().equals("owner") || group.getName().equals("admin") ||
                group.getName().equals("srdev") || group.getName().equals("dev")
                || group.getName().equals("t-dev") ||
                group.getName().equals("srmod") || group.getName().equals("mod") ||
                group.getName().equals("t-mod") ||
                group.getName().equals("srsupporter") || group.getName().equals("supporter") ||
                group.getName().equals("t-supporter") || group.getName().equals("srbuilder")
                || group.getName().equals("builder") || group.getName().equals("t-builder")
                || group.getName().equals("youtuber") || group.getName().equals("premium")) {
            return;
        } else {
            e.setCancelled(true);
            p.sendMessage(plugin.Prefix + "§4Error: §cDu musst mindestens den Premium Rang Haben. Um hier Schreiben zu Können!");
        }
    }
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        LuckPerms api = LuckPermsProvider.get();
        User user = api.getUserManager().getUser(p.getUniqueId());
        Group group = api.getGroupManager().getGroup(user.getPrimaryGroup());

        String msg = e.getMessage();

        if (group.getName().equals("owner")) {
            e.setFormat("§8[§4Inhaber§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("admin")) {
            e.setFormat("§8[§cAdmin§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("srdev")) {
            e.setFormat("§8[§bSrDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("dev")) {
            e.setFormat("§8[§bDev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("t-dev")) {
            e.setFormat("§8[§bT-Dev§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("srmod")) {
            e.setFormat("§8[§3SrMod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("mod")) {
            e.setFormat("§8[§3Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("t-mod")) {
            e.setFormat("§8[§3T-Mod§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("srsupporter")) {
            e.setFormat("§8[§1SrSupporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("supporter")) {
            e.setFormat("§8[§1Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("t-supporter")) {
            e.setFormat("§8[§1T-Supporter§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("srsuilder")) {
            e.setFormat("§8[§aSrBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("builder")) {
            e.setFormat("§8[§aBuilder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("t-builder")) {
            e.setFormat("§8[§aT-Builder§8] " + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("youtuber")) {
            e.setFormat("§5" + p.getDisplayName() + " §7» " + msg);
        } else if (group.getName().equals("premium")) {
            e.setFormat("§6" + p.getDisplayName() + " §7» " + msg);
        } else {
            e.setFormat("§8" + p.getDisplayName() + " §7» " + msg);
        }
    }
}