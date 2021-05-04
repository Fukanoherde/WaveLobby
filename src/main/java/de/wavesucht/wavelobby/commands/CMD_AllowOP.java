package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.AllowOP;
import de.wavesucht.wavelobby.files.MessageManager;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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

            LuckPerms api = LuckPermsProvider.get();
            User user = api.getUserManager().getUser(p.getUniqueId());
            Group group = api.getGroupManager().getGroup(user.getPrimaryGroup());

            if (group.getName().equals("Owner")) {
                if (args.length == 0) {
                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Use").toString().replaceFirst("", ""));
                    return true;
                }
                if (args[0].equalsIgnoreCase("op")) {
                    if (args.length == 3) {
                        OfflinePlayer target = Bukkit.getOfflinePlayer(args[1]);
                        if (args[2].equalsIgnoreCase("true")) {
                            if (AllowOP.playerExists(target.getUniqueId().toString())) {
                                AllowOP.setOpPerm(target.getUniqueId().toString(), target.getName(), Integer.valueOf(1));
                                String TargetNameAdd = MessageManager.getValue("");
                                TargetNameAdd = TargetNameAdd.replaceAll("%target%", target.getName());
                                p.sendMessage(plugin.Prefix + TargetNameAdd.toString().replaceFirst("&", "§"));
                            } else {
                                p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.PlayerNotFound").toString().replaceFirst("&", "§"));
                            }
                        } else if (args[2].equalsIgnoreCase("false")) {
                            if (AllowOP.playerExists(target.getUniqueId().toString())) {
                                AllowOP.setOpPerm(target.getUniqueId().toString(), target.getName(), Integer.valueOf(0));
                                String TargetNameRemove = MessageManager.getValue("");
                                TargetNameRemove = TargetNameRemove.replaceAll("%target%", target.getName());
                                p.sendMessage(plugin.Prefix + TargetNameRemove.toString().replaceFirst("&", "§"));
                            } else {
                                p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.PlayerNotFound").toString().replaceFirst("&", "§"));
                            }
                        } else if ((!args[2].equalsIgnoreCase("true")) && (!args[2].equalsIgnoreCase("false"))) {
                            p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Use").toString().replaceFirst("&", "§") + "§8/allow op <Spieler> [true | false]");
                        }
                    } else {
                        p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Use").toString().replaceFirst("&", "§") + "§8/allow op <Spieler> [true | false]");
                    }
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