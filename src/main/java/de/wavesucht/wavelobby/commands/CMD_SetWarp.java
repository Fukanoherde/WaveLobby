package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */
import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.manager.WarpManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

public class CMD_SetWarp implements CommandExecutor {

    private WaveLobby plugin;
    public CMD_SetWarp (WaveLobby plugin) {
        this.plugin = plugin;
        plugin.getCommand("setwarp").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("lobby.setwaprp") || p.hasPermission("lobby.*")) {
                if (args.length == 1) {
                    String path = "EasyLobbyManager" + "." + args[0] + ".";

                    String welt = p.getWorld().getName();
                    double x = p.getLocation().getX();
                    double y = p.getLocation().getY();
                    double z = p.getLocation().getZ();
                    float yaw = p.getLocation().getYaw();
                    float pitch = p.getLocation().getPitch();

                    WarpManager.config.set(path + "Welt", welt);
                    WarpManager.config.set(path + "X", Double.valueOf(x));
                    WarpManager.config.set(path + "Y", Double.valueOf(y));
                    WarpManager.config.set(path + "Z", Double.valueOf(z));
                    WarpManager.config.set(path + "Yaw", Float.valueOf(yaw));
                    WarpManager.config.set(path + "Pitch", Float.valueOf(pitch));
                    WarpManager.config.set(path + "SetFrom", p.getUniqueId() + " : " + p.getName());

                    try {
                        WarpManager.savecfg();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    p.sendMessage(plugin.Prefix + "§3Du hast den Warp für: §a" + args[0] + " §3erfolgreich gesetzt");
                    return true;

                } else {
                    p.sendMessage(plugin.Prefix + "§bVerwendung: §8/setwarp <WarpName>");
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