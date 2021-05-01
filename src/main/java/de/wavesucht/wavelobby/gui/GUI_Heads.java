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

public class GUI_Heads implements Listener {

    private WaveLobby plugin;
    public GUI_Heads (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCreateHeadInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
                                Inventory GuiHeads = Bukkit.createInventory(null, 54, LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.0")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.0").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.0").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.0").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.0").toString()).buildSkull());
                                        }
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.1")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(1, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.1").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.1").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(1, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.1").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.1").toString()).buildSkull());
                                        }
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.2")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.2").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.2").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.2").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.2").toString()).buildSkull());
                                        }
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.3")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(3, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.3").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.3").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(3, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.3").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.3").toString()).buildSkull());
                                        }
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.4")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(4, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.4").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.4").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(4, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.4").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.4").toString()).buildSkull());
                                        }
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.5")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(5, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.5").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.5").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(5, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.5").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.5").toString()).buildSkull());
                                        }
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.6")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(6, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.6").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.6").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(6, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.6").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.6").toString()).buildSkull());
                                        }
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.7")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(7, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.7").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.7").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(7, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.7").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.7").toString()).buildSkull());
                                        }
                                    }
                                }, 16L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.8")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(8, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.8").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.8").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(8, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.8").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.8").toString()).buildSkull());
                                        }
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.9")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(9, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.9").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.9").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(9, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.9").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.9").toString()).buildSkull());
                                        }
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.10")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(10, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.10").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.10").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(10, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.10").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.10").toString()).buildSkull());
                                        }
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.11")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(11, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.11").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.11").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(11, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.11").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.11").toString()).buildSkull());
                                        }
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.12")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(12, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.12").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.12").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(12, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.12").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.12").toString()).buildSkull());
                                        }
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.13")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(13, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.13").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.13").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(13, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.13").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.13").toString()).buildSkull());
                                        }
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.14")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(14, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.14").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.14").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(14, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.14").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.14").toString()).buildSkull());
                                        }
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.15")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(15, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.15").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.15").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(15, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.15").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.15").toString()).buildSkull());
                                        }
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.16")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(16, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.16").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.16").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(16, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.16").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.16").toString()).buildSkull());
                                        }
                                    }
                                }, 16L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.17")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(17, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.17").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.17").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(17, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.17").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.17").toString()).buildSkull());
                                        }
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.18")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(18, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.18").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.18").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(18, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.18").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.18").toString()).buildSkull());
                                        }
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.19")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(19, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.19").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.19").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(19, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.19").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.19").toString()).buildSkull());
                                        }
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.20")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(20, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.20").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.20").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(20, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.20").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.20").toString()).buildSkull());
                                        }
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.21")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(21, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.21").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.21").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(21, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.21").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.21").toString()).buildSkull());
                                        }
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.22")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(22, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.22").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.22").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(22, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.22").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.22").toString()).buildSkull());
                                        }
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.23")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(23, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.23").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.23").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(23, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.23").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.23").toString()).buildSkull());
                                        }
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.24")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(24, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.24").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.24").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(24, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.24").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.24").toString()).buildSkull());
                                        }
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.25")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(25, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.25").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.25").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(25, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.25").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.25").toString()).buildSkull());
                                        }
                                    }
                                }, 16L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.26")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(26, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.26").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.26").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(26, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.26").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.26").toString()).buildSkull());
                                        }
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.27")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(27, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.27").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.27").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(27, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.27").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.27").toString()).buildSkull());
                                        }
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.28")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(28, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.28").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.28").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(28, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.28").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.28").toString()).buildSkull());
                                        }
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.29")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(29, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.29").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.29").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(29, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.29").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.29").toString()).buildSkull());
                                        }
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.30")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(30, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.30").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.30").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(30, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.30").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.30").toString()).buildSkull());
                                        }
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.31")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(31, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.31").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.31").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(31, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.31").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.31").toString()).buildSkull());
                                        }
                                    }
                                }, 10L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.32")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(32, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.32").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.32").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(32, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.32").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.32").toString()).buildSkull());
                                        }
                                    }
                                }, 12L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.33")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(33, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.33").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.33").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(33, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.33").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.33").toString()).buildSkull());
                                        }
                                    }
                                }, 14L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.34")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(34, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.34").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.34").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(34, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.34").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.34").toString()).buildSkull());
                                        }
                                    }
                                }, 16L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        if (p.hasPermission((String) PlayerHeads.getValue("Head.Perm.35")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                            GuiHeads.setItem(35, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.35").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.35").toString()).buildSkull());
                                            p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                        }else{
                                            GuiHeads.setItem(35, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                    .setName(PlayerHeads.getValue("Head.Display.Name.35").toString().replace("&", "§"))
                                                    .setLore(Collections.singletonList(PlayerHeads.getValue("heads.no.buy.lore").toString()))
                                                    .setSkullOwner(PlayerHeads.getValue("Head.Name.35").toString()).buildSkull());
                                        }
                                    }
                                }, 18L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHeads.setItem(49, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);

                                p.openInventory(GuiHeads);

                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onCreateHeadsInv §6" + e1);
        }
    }
    @EventHandler
    public void onClose(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§"))) {
                                if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString())) {
                                    p.getInventory().setHelmet(null);
                                    p.closeInventory();
                                }
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