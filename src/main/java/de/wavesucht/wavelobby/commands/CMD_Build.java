package de.wavesucht.wavelobby.commands;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class CMD_Build implements CommandExecutor {

    private WaveLobby plugin;
    public CMD_Build (WaveLobby plugin) {
        this.plugin = plugin;
        plugin.getCommand("build").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;
            ItemStack Freunde = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
            SkullMeta FreundeMeta = (SkullMeta)Freunde.getItemMeta();
            FreundeMeta.setOwner(p.getName());
            FreundeMeta.setDisplayName("§6✪ §3Spieler Menu §6✪");
            Freunde.setItemMeta(FreundeMeta);

            if (p.hasPermission("lobby.build") || p.hasPermission("lobby.*")) {
                if (args.length == 0) {
                    if (!plugin.build.contains(p)) {
                        plugin.build.add(p);
                        WaveLobby.invClearer(p);
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(plugin.Prefix + "§aDu kannst nun Bauen.");
                        return true;
                    } else {
                        plugin.build.remove(p);
                        WaveLobby.invClearer(p);
                        p.setGameMode(GameMode.ADVENTURE);
                        p.getInventory().setItem(0, ItemAPI.createjoinItem(Material.COMPASS, 1 ,0, "§6✪ §3Navigator §6✪", Enchantment.LURE, 1));
                        p.getInventory().setItem(3, ItemAPI.createjoinItem(Material.BREWING_STAND, 1 ,0, "§6✪ §3Lobby Switcher §6✪", Enchantment.LURE, 1));
                        p.getInventory().setItem(4, ItemAPI.createjoinItem(Material.BARRIER, 1 ,0, "§6✪ §3Keine Gadgets §6✪", Enchantment.LURE, 1));
                        p.getInventory().setItem(5, ItemAPI.createjoinItem(Material.STICK, 1 ,0, "§6✪ §3Spieler Verstecken §6✪", Enchantment.LURE, 1));
                        p.getInventory().setItem(8, Freunde);
                        p.sendMessage(plugin.Prefix + "§cDu kannst nun nicht mehr Bauen.");
                        return true;
                    }
                } else {
                    p.sendMessage(plugin.Prefix + "§bVerwendung: §8/build");
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