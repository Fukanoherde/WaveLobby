package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.utils.ItemBuilder;
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

public class GUI_Manager_Back implements Listener {

    private WaveLobby plugin;
    public GUI_Manager_Back (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBackGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (p.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Preview").toString().replace("&", "§"))) {

                                Inventory User1 = Bukkit.createInventory(null, 54, LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(15, new ItemBuilder(Material.LEATHER_BOOTS).setName(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(11, new ItemBuilder(Material.BEACON).setName(LobbyItems.getValue("Item.Gui.Heads").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(21, new ItemBuilder(Material.WOOL).setName(LobbyItems.getValue("Item.Gui.Ballon").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(22, new ItemBuilder(Material.DRAGON_EGG).setName(LobbyItems.getValue("Item.Gui.Pets").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(23, new ItemBuilder(Material.BANNER).setName(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(30, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3)).setName(LobbyItems.getValue("Item.Gui.Friends").toString().replace("&", "§")).setSkullOwner(p.getDisplayName()).buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(31, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Close").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(32, new ItemBuilder(Material.CLAY_BALL).setName(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 16L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(38, new ItemBuilder(Material.COMMAND).setName(LobbyItems.getValue("Item.Gui.Shop").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        User1.setItem(42, new ItemBuilder(Material.FEATHER).setName(LobbyItems.getValue("Item.Gui.FAQ").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 20L);

                                p.openInventory(User1);
                                p.updateInventory();
                                e.setCancelled(true);
                            }
                        }
                    }
                }
            }

        } catch(Exception e1){
            p.sendMessage("§4Error onBackGadGet §6" + e1);
        }
    }
}