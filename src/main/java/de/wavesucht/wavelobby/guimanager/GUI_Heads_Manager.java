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

import java.util.Collections;

public class GUI_Heads_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_Heads_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCreateHeadInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"))) {
                                Inventory GuiHead = Bukkit.createInventory(null, 9, LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHead.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))
                                                .setSkullOwner("zsoccer23").buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHead.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))
                                                .setLore(Collections.singletonList("Free 4 All"))
                                                .setSkullOwner("Unknown_Is_Gay").buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHead.setItem(4, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))
                                                .setSkullOwner("MHF_YouTube").buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHead.setItem(6, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(LobbyItems.getValue("Item.Gui.Heads.3").toString().replace("&", "§"))
                                                .setLore(Collections.singletonList("Folgt. . ."))
                                                .setSkullOwner("BizepsPunch").buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiHead.setItem(8, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Close").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);

                                p.openInventory(GuiHead);
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
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"))) {
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
}