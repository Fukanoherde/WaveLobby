package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.PermManager;
import de.wavesucht.wavelobby.files.PlayerHeads;
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

import java.util.Collections;

public class GUI_YTHeads implements Listener {

    private WaveLobby plugin;
    public GUI_YTHeads (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCreateHeadYT(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
                                Inventory GuiYT = Bukkit.createInventory(null, 18, LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.0")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.0").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.0").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.0").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.0").toString()).buildSkull());
                                        }
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.1")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(1, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.1").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.1").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(1, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.1").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.1").toString()).buildSkull());
                                        }
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.2")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.2").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.2").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.2").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.2").toString()).buildSkull());
                                        }
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.3")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(3, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.3").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.3").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(3, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.3").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.3").toString()).buildSkull());
                                        }
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.4")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(4, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.4").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.4").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(4, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.4").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.4").toString()).buildSkull());
                                        }
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.5")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(5, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.5").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.5").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(5, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.5").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.5").toString()).buildSkull());
                                        }
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.6")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(6, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.6").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.6").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(6, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.6").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.6").toString()).buildSkull());
                                        }
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.7")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(7, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.7").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.7").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(7, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.7").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.7").toString()).buildSkull());
                                        }
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.YT.Perm.8")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiYT.setItem(8, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.8").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.8").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiYT.setItem(8, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.YT.8").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.YT.8").toString()).buildSkull());
                                        }
                                    }
                                }, 20L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiYT.setItem(13, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);


                                p.openInventory(GuiYT);
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onCreateHeadInv §6" + e1);
        }
    }

    @EventHandler
    public void onClose(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(null);
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
}