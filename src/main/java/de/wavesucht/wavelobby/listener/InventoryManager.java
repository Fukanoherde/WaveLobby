package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.PermManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.SpawnerSpawnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.weather.WeatherChangeEvent;

public class InventoryManager implements Listener {

    private WaveLobby plugin;
    public InventoryManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onAchievment(PlayerAchievementAwardedEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onSet(InventoryMoveItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent e){
        if (e.getWhoClicked().getGameMode() != GameMode.CREATIVE){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onPickup(PlayerPickupItemEvent e){
        if (e.getPlayer().getGameMode() != GameMode.CREATIVE){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPermission((String) PermManager.getValue("Perms.entity")) || !p.hasPermission((String) PermManager.getValue("Perms.all"))) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onWeather(WeatherChangeEvent  e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onBNavi(PlayerInteractEvent e){
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
                Block b = e.getClickedBlock();
                if (b.getType() == Material.CHEST || b.getType() == Material.BREWING_STAND || b.getType() == Material.ENCHANTMENT_TABLE
                        || b.getType() == Material.ENDER_CHEST || b.getType() == Material.ANVIL || b.getType() == Material.DARK_OAK_DOOR || b.getType() == Material.WOODEN_DOOR
                        || b.getType() == Material.BIRCH_DOOR || b.getType() == Material.ACACIA_DOOR || b.getType() == Material.IRON_DOOR || b.getType() == Material.JUNGLE_DOOR
                        || b.getType() == Material.SPRUCE_DOOR || b.getType() == Material.TRAP_DOOR || b.getType() == Material.WOOD_DOOR || b.getType() == Material.FENCE_GATE
                        || b.getType() == Material.WORKBENCH || b.getType() == Material.DROPPER || b.getType() == Material.DISPENSER || b.getType() == Material.HOPPER
                        || b.getType() == Material.WOOD_BUTTON || b.getType() == Material.STONE_BUTTON || b.getType() == Material.ITEM_FRAME || b.getType() == Material.DAYLIGHT_DETECTOR
                        || b.getType() == Material.BED_BLOCK || b.getType() == Material.FURNACE || b.getType() == Material.LEVER || b.getType() == Material.WOOD_PLATE){
                    e.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onInvetoryClickEvent(InventoryClickEvent e){
        if (e.getWhoClicked().getGameMode() != GameMode.CREATIVE){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onMob(SpawnerSpawnEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onFood(FoodLevelChangeEvent e){
        e.setCancelled(true);
        e.setFoodLevel(20);
    }
}