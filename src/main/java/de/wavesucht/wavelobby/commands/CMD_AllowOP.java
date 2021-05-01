package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.AllowOP;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class CMD_AllowOP implements CommandExecutor {

    private WaveLobby plugin;
    public CMD_AllowOP (WaveLobby plugin) {
        this.plugin = plugin;
        plugin.getCommand("allow").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (PermissionsEx.getUser(p).inGroup("Owner")) {
                if (args.length == 0) {
                    p.sendMessage(plugin.Prefix + "§3Verwendung: §7/allow op <Spieler> [true | false]");
                    return true;
                }
                if (args[0].equalsIgnoreCase("op")) {
                    if (args.length == 3) {
                        OfflinePlayer target = Bukkit.getOfflinePlayer(args[1]);
                        if (args[2].equalsIgnoreCase("true")) {
                            if (AllowOP.playerExists(target.getUniqueId().toString())) {
                                AllowOP.setOpPerm(target.getUniqueId().toString(), target.getName(), Integer.valueOf(1));
                                p.sendMessage(plugin.Prefix + "§aDu hast dem Spieler §6" + target.getName() + " §adie Erlaubnis gegeben, Op zu besitzen");
                            } else {
                                p.sendMessage(plugin.Prefix + "§cDieser Spieler war noch nie auf diesen Server");
                            }
                        } else if (args[2].equalsIgnoreCase("false")) {
                            if (AllowOP.playerExists(target.getUniqueId().toString())) {
                                AllowOP.setOpPerm(target.getUniqueId().toString(), target.getName(), Integer.valueOf(0));
                                p.sendMessage(plugin.Prefix + "§aDu hast dem Spieler §6" + target.getName() + " §adie Erlaubnis Op zu besitzen §centzogen");
                            } else {
                                p.sendMessage(plugin.Prefix + "§cDieser Spieler war noch nie auf diesen Server");
                            }
                        } else if ((!args[2].equalsIgnoreCase("true")) && (!args[2].equalsIgnoreCase("false"))) {
                            p.sendMessage(plugin.Prefix + "§3Verwendung: §7/allow op <Spieler> [true | false]");
                        }
                    } else {
                        p.sendMessage(plugin.Prefix + "§3Verwendung: §7/allow op <Spieler> [true | false]");
                    }
                }
            } else {
                p.sendMessage(plugin.Prefix + "§cDu hast keine Rechte auf diesen Befehl");
            }
        }
        return false;
    }
}