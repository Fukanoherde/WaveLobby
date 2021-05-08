package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.files.LobbyItems;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI_Boots implements Listener {

    private WaveLobby plugin;
    public GUI_Boots (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // onCreateBootsInv \\

    @EventHandler
    public void onCreateBootsInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                                Inventory Boots = Bukkit.createInventory(null, 54, LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"));
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(11, ItemAPI.createBootsWithName(Color.RED, LobbyItems.getValue("Gui.Boots.Love").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(15, ItemAPI.createBootsWithName(Color.AQUA, LobbyItems.getValue("Gui.Boots.Water").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(21, ItemAPI.createBootsWithName(Color.YELLOW, LobbyItems.getValue("Gui.Boots.Flame").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(22, ItemAPI.createBootsWithName(Color.TEAL, LobbyItems.getValue("Gui.Boots.Magic").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(23, ItemAPI.createBootsWithName(Color.WHITE, LobbyItems.getValue("Gui.Boots.Rainbow").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(30, ItemAPI.createBootsWithName(Color.GREEN, LobbyItems.getValue("Gui.Boots.Happy").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 12L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(31, ItemAPI.createBootsWithName(Color.GRAY, LobbyItems.getValue("Gui.Boots.Angry").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 14L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(32, ItemAPI.createBootsWithName(Color.BLACK, LobbyItems.getValue("Gui.Boots.Ninja").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 16L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(38, ItemAPI.createBootsWithName(Color.LIME, LobbyItems.getValue("Gui.Boots.Explode").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 18L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(40, ItemAPI.createItemNoEnch2(Material.BARRIER, 1, 0, LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 20L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Boots.setItem(42, ItemAPI.createBootsWithName(Color.FUCHSIA, LobbyItems.getValue("Gui.Boots.on").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 22L);


                                p.openInventory(Boots);
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onCreateBootsInv §6" + e1);
        }
    }
}