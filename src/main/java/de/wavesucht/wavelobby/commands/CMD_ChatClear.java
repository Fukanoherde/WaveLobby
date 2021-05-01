package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
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
            if (p.hasPermission("lobby.cc") || p.hasPermission("lobby.*")) {
                if (args.length == 0) {
                    for (int i = 0; i <=1000; i++) {
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.sendMessage(" ");
                        }
                    }
                    Bukkit.broadcastMessage(plugin.Prefix + "§aDer Chat wurde von §4" + p.getDisplayName() + " §ageleert!");
                } else {
                    p.sendMessage(plugin.Prefix + "§6Bitte nutze §c/chatclear /cc §6um den Chat zu leeren");
                }
            } else {
                p.sendMessage(plugin.Prefix + "§cDeine Anfrage konnte nicht bearbeitet werden! Grund: §4Fehlende Rechte...");
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(plugin.Prefix + "§4Dieser Befehl ist nur für Spieler");
        }
        return false;
    }
}