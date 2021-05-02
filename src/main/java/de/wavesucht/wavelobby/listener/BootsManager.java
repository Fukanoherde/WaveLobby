package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BootsManager implements Listener {

    private WaveLobby plugin;
    public BootsManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    private void onLoveMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Love").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.HEART, 5);
            }
        }
    }
    @EventHandler
    private void onWaterMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Water").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.WATERDRIP, 2);
            }
        }
    }
    @EventHandler
    private void onFlameMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Flame").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.FLAME, 2);
            }
        }
    }
    @EventHandler
    private void onLavaMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Lava").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.LAVA_POP, 2);
            }
        }
    }
    @EventHandler
    private void onMagicMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Magic").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.WITCH_MAGIC, 2);
            }
        }
    }
    @EventHandler
    private void onRainbowMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Rainbow").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.SLIME, 2);
            }
        }
    }
    @EventHandler
    private void onHappyMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Happy").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.HAPPY_VILLAGER, 2);
            }
        }
    }
    @EventHandler
    private void onAngryMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Angry").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.VILLAGER_THUNDERCLOUD, 2);
            }
        }
    }
    @EventHandler
    private void onNinjaMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Ninja").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 2);
            }
        }
    }
    @EventHandler
    private void onExplodeMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.Explode").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.EXPLOSION_LARGE, 2);
            }
        }
    }
    @EventHandler
    private void onSpeziMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            if(p.getInventory().getBoots().getItemMeta().getDisplayName().equals((LobbyItems.getValue("Gui.Boots.on").toString().replace("&", "§")))) {
                p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 2);
                p.getWorld().playEffect(p.getLocation(), Effect.WITCH_MAGIC, 2);
                p.getWorld().playEffect(p.getLocation(), Effect.MAGIC_CRIT, 2);
            }
        }
    }
}