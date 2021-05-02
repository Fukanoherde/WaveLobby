package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */
import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PermManager;
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
            if (p.hasPermission(PermManager.getValue("Perms.setwarp")) || p.hasPermission(PermManager.getValue("Perms.all"))) {
                if (args.length == 1) {
                    String path = "WaveLobby" + "." + args[0] + ".";

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

                    String warpName = MessageManager.getValue("Message.SetWarp");
                    warpName = warpName.replaceAll("%warp%", args[0]);
                    p.sendMessage(plugin.Prefix + warpName.toString().replaceFirst("&", "§"));
                    return true;

                } else {
                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Use").toString().replaceFirst("&", "§") + "§8/setwarp <WarpName>");
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