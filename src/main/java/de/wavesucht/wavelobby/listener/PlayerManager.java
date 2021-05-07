package de.wavesucht.wavelobby.listener;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.AllowOP;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.api.NickAPI;
import de.wavesucht.wavelobby.api.StatsAPI;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.manager.ScoreboardManager;
import de.wavesucht.wavelobby.manager.WarpManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerManager implements Listener {

    private WaveLobby plugin;
    public PlayerManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin (PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!StatsAPI.playerExists(p.getUniqueId().toString())) {
            StatsAPI.createPlayer(p.getUniqueId().toString(), p.getName());
        }

        if (!NickAPI.playerExists(p.getUniqueId().toString())) {
            NickAPI.createPlayer(p.getUniqueId().toString(), p.getName());
        }

        if (!AllowOP.playerExists(p.getUniqueId().toString())) {
            AllowOP.createPlayerOp(p.getUniqueId().toString(), p.getName());
        }

        ItemStack Freunde = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta FreundeMeta = (SkullMeta) Freunde.getItemMeta();
        FreundeMeta.setOwner(p.getName());
        FreundeMeta.setDisplayName("§6✪ §3Spieler Menü §6✪");
        Freunde.setItemMeta(FreundeMeta);

        if (NickAPI.getNicked(p.getUniqueId().toString(), p.getName()).intValue() == 0) {

            p.setDisplayName(p.getName());

        } else if (NickAPI.getNicked(p.getUniqueId().toString(), p.getName()).intValue() == 1) {

            p.setDisplayName("§b" + p.getName());

        }

        p.getInventory().setItem(0, ItemAPI.creationItem(Material.COMPASS, 1, 0, "§6✪ §3Navigator §6✪", Enchantment.LURE, 1));
        p.getInventory().setItem(3, ItemAPI.creationItem(Material.BREWING_STAND, 1, 0, "§6✪ §3Lobby Switcher §6✪", Enchantment.LURE, 1));
        p.getInventory().setItem(4, ItemAPI.creationItem(Material.BARRIER, 1, 0, "§6✪ §3Keine Gadgets §6✪", Enchantment.LURE, 1));
        p.getInventory().setItem(5, ItemAPI.creationItem(Material.STICK, 1, 0, "§6✪ §3Spieler Verstecken §6✪", Enchantment.LURE, 1));
        p.getInventory().setItem(8, Freunde);

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player all : Bukkit.getOnlinePlayers()) {
                    ScoreboardManager.setScoreboard(all);
                    ScoreboardManager.UpdateScoreboard(all);
                }
            }
        }.runTaskLater(plugin, 1L);
        for (int i = 0; i <= 1000; i++) {
            for (Player all : Bukkit.getOnlinePlayers()) {
                all.sendMessage(" ");
            }
        }
        if (WarpManager.isWarpExist("Spawn")) {
            WarpManager.teleportToWarp(p, "Spawn");
        } else {
            p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NotFoundWarp.Spawn").toString().replaceFirst("&", "§"));
        }
        p.setGameMode(GameMode.SURVIVAL);
        if (plugin.AllowJoinMessage == true) {
            String join = plugin.JoinMessage;
            join = join.replace("%player%", p.getDisplayName());
            e.setJoinMessage(join);
        } else {
            e.setJoinMessage("");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player all : Bukkit.getOnlinePlayers()) {
                    ScoreboardManager.setScoreboard(all);
                    ScoreboardManager.UpdateScoreboard(all);
                }
            }
        }.runTaskLater(plugin, 1L);
        WaveLobby.invClearer(p);
        if (plugin.AllowQuitMessage == true) {
            String quit = plugin.QuitMessage;
            quit = quit.replace("%player%", p.getDisplayName());
            e.setQuitMessage(quit);
        } else {
            e.setQuitMessage("");
        }
    }

    @EventHandler
    public void onChangeFoodLevel (FoodLevelChangeEvent e) {
        if (e.isCancelled()) {
            return;
        }
        e.setCancelled(true);
        if (e.getFoodLevel() != 20) {
            e.setFoodLevel(20);
        }
    }

    @EventHandler
    public void onDamage (EntityDamageEvent e) {
        if (e.isCancelled()) {
            return;
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDamage (EntityDamageByBlockEvent e) {
        if (e.isCancelled()) {
            return;
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDamage (EntityDamageByEntityEvent e) {
        if (e.isCancelled()) {
            return;
        } else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onReload(PlayerCommandPreprocessEvent e) {
        Player p = (Player) e.getPlayer();

        if (e.getMessage().equalsIgnoreCase("/rl")) {
            e.setCancelled(true);
            for (int i = 0; i <= 1000; i++) {
                Bukkit.broadcastMessage(" ");
            }
            Bukkit.broadcastMessage("§l");
            Bukkit.broadcastMessage(plugin.Prefix + "§4Wave_SYSTEM");
            Bukkit.broadcastMessage("§l ");
            Bukkit.broadcastMessage(plugin.Prefix + "§cBitte alle Stehen Bleiben!");
            Bukkit.reload();
            Bukkit.broadcastMessage(plugin.Prefix + "§aDer Server wurde Neugeladen!");
            Bukkit.broadcastMessage("§l  ");
        }
    }
}