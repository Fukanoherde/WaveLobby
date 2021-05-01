package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.utils.ItemBuilder;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUI_UserMenu implements Listener {

    private WaveLobby plugin;
    public GUI_UserMenu (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onUserItem(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR && e.getPlayer().getItemInHand().getType() == Material.SKULL_ITEM) {
            if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
                Inventory User = Bukkit.createInventory(null, 54, LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"));

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(15, new ItemBuilder(Material.LEATHER_BOOTS).setName(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 2L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(11, new ItemBuilder(Material.BEACON).setName(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 4L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(21, new ItemBuilder(Material.WOOL).setName(LobbyItems.getValue("Item.Gui.Ballon").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 6L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(22, new ItemBuilder(Material.DRAGON_EGG).setName(LobbyItems.getValue("Item.Gui.Pets").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 8L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(23, new ItemBuilder(Material.BANNER).setName(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 10L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(30, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3)).setName(LobbyItems.getValue("Item.Gui.Friends").toString().replace("&", "§")).setSkullOwner(e.getPlayer().getDisplayName()).buildSkull());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 12L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(31, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Close").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 14L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(32, new ItemBuilder(Material.CLAY_BALL).setName(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 16L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(38, new ItemBuilder(Material.COMMAND).setName(LobbyItems.getValue("Item.Gui.Shop").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 18L);

                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        User.setItem(42, new ItemBuilder(Material.FEATHER).setName(LobbyItems.getValue("Item.Gui.FAQ").toString().replace("&", "§")).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                    }
                }, 20L);

                e.getPlayer().openInventory(User);
                e.setCancelled(true);
            }
        }
    }

    // onClose \\

    @EventHandler
    public void onClose(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Close").toString().replace("&", "§"))) {
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onClose §6" + e1);
        }
    }

// onOpenShopGui \\

    @EventHandler
    public void onOpenShopGui(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Shop").toString().replace("&", "§"))) {
                            p.closeInventory();
                            p.performCommand("shop");
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onOpenShopGui §6" + e1);
        }
    }

// onPetsInv \\

    @EventHandler
    public void onPetsInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Pets").toString().replace("&", "§"))) {
                            p.closeInventory();
                            p.sendMessage(plugin.Prefix + "§4... §cFOLGT §4...");
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onPetsInv §6" + e1);
        }
    }

// onBallonInv \\

    @EventHandler
    public void onBallonInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Ballon").toString().replace("&", "§"))) {
                            p.closeInventory();
                            p.sendMessage(plugin.Prefix + "§4... §cFOLGT §4...");
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onBallonInv §6" + e1);
        }
    }

// onFAQ \\

    @EventHandler
    public void onFAQ(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.FAQ").toString().replace("&", "§"))) {
                            p.closeInventory();
                            p.sendMessage("§3");
                            p.sendMessage(plugin.Prefix + "§3Hier ein Paar eckdaten.");
                            p.sendMessage("§3 ");
                            p.sendMessage(plugin.Prefix + "§3Das System wurde von: §a" + WaveLobby.getPlugin().getDescription().getAuthors() + " §3Programmiert!");
                            p.sendMessage(plugin.Prefix + "§3Forum: §ahttps://www.wavesucht.de");
                            p.sendMessage(plugin.Prefix + "§3Discord: §ahttps://discord.gg/ksJJxZ2");
                            p.sendMessage(plugin.Prefix + "§3TeamSpeak: §ats.wavesucht.de");
                            p.sendMessage("§3  ");
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onFAQ §6" + e1);
        }
    }

// onOpenFriendGUI \\

    @EventHandler
    public void onOpenFriendGUI(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Friends").toString().replace("&", "§"))) {
                            p.performCommand("friendsgui");
                            p.closeInventory();
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onOpenFriendGUI §6" + e1);
        }
    }
    @EventHandler
    public void onExplode(EntityExplodeEvent e) {
        e.setCancelled(true);
    }
}