package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.files.LobbyItems;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI_Banner implements Listener {

    private WaveLobby plugin;
    public GUI_Banner (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // onCreateBannerInv \\

    @EventHandler
    public void onCreateBannerInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {

                                Inventory Banner = Bukkit.createInventory(null, 54, LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"));
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(11, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 1, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Red").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(15, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 2, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Green").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(21, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 14, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Orange").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(22, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 5, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Magenta").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(23, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 7, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Light_Gray").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(30, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 0, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Black").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 12L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(31, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 3, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Brown").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 14L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(32, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 9, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Pink").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 16L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(38, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 10, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Lime").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 18L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(40, ItemAPI.createItemNoEnch2(Material.BARRIER, 1, 0, LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 20L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Banner.setItem(42, ItemAPI.createItemNoEnch2(Material.BANNER, 1, 4, LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Blue").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 22L);

                                p.openInventory(Banner);
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onCreateBannerInv §6" + e1);
        }
    }
}