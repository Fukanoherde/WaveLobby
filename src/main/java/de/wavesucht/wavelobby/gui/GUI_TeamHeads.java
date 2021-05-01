package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.PlayerHeads;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class GUI_TeamHeads implements Listener {

    private WaveLobby plugin;
    public GUI_TeamHeads (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onTeamHead0(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Team.0").toString().replace("&", "§"))) {
                            p.getInventory().setHelmet(e.getCurrentItem());
                            p.closeInventory();
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onTeamHead1(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Team.1").toString().replace("&", "§"))) {
                            p.getInventory().setHelmet(e.getCurrentItem());
                            p.closeInventory();
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onTeamHead2(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Team.2").toString().replace("&", "§"))) {
                            p.getInventory().setHelmet(e.getCurrentItem());
                            p.closeInventory();
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onTeamHead3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Team.3").toString().replace("&", "§"))) {
                            p.getInventory().setHelmet(e.getCurrentItem());
                            p.closeInventory();

                        }
                    }
                }
            }
        }
    }
}