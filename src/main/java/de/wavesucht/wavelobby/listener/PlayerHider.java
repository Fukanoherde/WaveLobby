package de.wavesucht.wavelobby.listener;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerHider implements Listener {

    private WaveLobby plugin;
    public PlayerHider (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlaze (PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (e.getItem().getType() == Material.BLAZE_ROD || e.getItem().getType() == Material.STICK) {
                if (WaveLobby.PlayerHider.contains(p)) {
                    WaveLobby.PlayerHider.remove(p);
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.showPlayer(all);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        p.getInventory().setItem(5, ItemAPI.creationItem(Material.STICK, 1,  0,"§6✪ §3Spieler Verstecken §6✪", Enchantment.LURE, 3));
                        e.getPlayer().updateInventory();
                    }
                } else {
                    WaveLobby.PlayerHider.add(p);
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.hidePlayer(all);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        p.getInventory().setItem(5, ItemAPI.creationItem(Material.BLAZE_ROD, 1,  0,"§6✪ §3Spieler Anzeigen §6✪", Enchantment.LURE, 3));
                        e.getPlayer().updateInventory();
                    }
                }
            }
        }
    }
}