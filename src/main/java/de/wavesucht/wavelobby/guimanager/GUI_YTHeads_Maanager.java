package de.wavesucht.wavelobby.guimanager;

import com.ibm.dtfj.utils.file.FileManager;
import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PlayerHeads;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class GUI_YTHeads_Maanager implements Listener {

    private WaveLobby plugin;
    public GUI_YTHeads_Maanager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onNoBuy(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.no.buy.lore").toString())) {
                            p.closeInventory();
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
                            p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.Banner.NoPerms").toString().replace("&", "§"));
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead0(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.0").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead1(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.1").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead2(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.2").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.3").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead4(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.4").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead5(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.5").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead6(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.6").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead7(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.7").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead8(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.2").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.YT.8").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                                p.getInventory().setHelmet(e.getCurrentItem());
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        }
    }
}