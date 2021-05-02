package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
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

public class GUI_TeamHeads_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_TeamHeads_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCreateTeamHeadInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.01").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
                                Inventory GuiTeamHeads = Bukkit.createInventory(null, 9, LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiTeamHeads.setItem(0, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(PlayerHeads.getValue("Head.Display.Team.0").toString().replace("&", "§"))
                                                .setSkullOwner(PlayerHeads.getValue("Head.Team.0").toString()).buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiTeamHeads.setItem(1, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(PlayerHeads.getValue("Head.Display.Team.1").toString().replace("&", "§"))
                                                .setSkullOwner(PlayerHeads.getValue("Head.Team.1").toString()).buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiTeamHeads.setItem(2, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(PlayerHeads.getValue("Head.Display.Team.2").toString().replace("&", "§"))
                                                .setSkullOwner(PlayerHeads.getValue("Head.Team.2").toString()).buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiTeamHeads.setItem(3, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3))
                                                .setName(PlayerHeads.getValue("Head.Display.Team.3").toString().replace("&", "§"))
                                                .setSkullOwner(PlayerHeads.getValue("Head.Team.3").toString()).buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GuiTeamHeads.setItem(8, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")).build());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10L);

                                p.openInventory(GuiTeamHeads);
                            }
                        }
                    }
                }
            }
        }catch (Exception e1){
            p.sendMessage("§4Error onCreateTeamHeadInv §6" + e1);
        }
    }

    @EventHandler
    public void onClose(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.1").toString().replace("&", "§"))) {
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