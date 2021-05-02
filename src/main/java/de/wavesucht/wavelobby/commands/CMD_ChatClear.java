package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PermManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_ChatClear implements CommandExecutor {

    private WaveLobby plugin;
    public CMD_ChatClear (WaveLobby plugin) {
        this.plugin = plugin;
        plugin.getCommand("chatclear").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission(PermManager.getValue("Perms.cc")) || p.hasPermission(PermManager.getValue("Perms.all"))) {
                if (args.length == 0) {
                    for (int i = 0; i <=1000; i++) {
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.sendMessage(" ");
                        }
                    }
                    String PlayerName = MessageManager.getValue("Message.ChatCleared");
                    PlayerName = PlayerName.replaceAll("%player%", p.getDisplayName());
                    Bukkit.broadcastMessage(plugin.Prefix + PlayerName.toString().replaceFirst("&", "§"));
                } else {
                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Use").toString().replaceFirst("&", "§") + "§c/chatclear");
                }
            } else {
                p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerm").toString().replaceFirst("&", "§"));
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(plugin.Prefix + MessageManager.getValue("Message.ForRealPlayer").toString().replaceFirst("&", "§"));
        }
        return false;
    }
}