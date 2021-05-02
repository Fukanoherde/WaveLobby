package de.wavesucht.wavelobby.guimanager;

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

public class GUI_HeadsManager implements Listener {

    private WaveLobby plugin;
    public GUI_HeadsManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onNoBuy(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.no.buy.lore").toString())) {
                            p.closeInventory();
                            p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
                            p.sendMessage(plugin.Prefix + MessageManager.getValue("NoPerms.Banner").toString().replace("&", "§"));
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onHead0(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.0").toString().replace("&", "§"))) {
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

        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.1").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.2").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.3").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.4").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.5").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.6").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.7").toString().replace("&", "§"))) {
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
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.8").toString().replace("&", "§"))) {
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
    public void onHead9(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.9").toString().replace("&", "§"))) {
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
    public void onHead10(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.10").toString().replace("&", "§"))) {
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
    public void onHead11(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.11").toString().replace("&", "§"))) {
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
    public void onHead12(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.12").toString().replace("&", "§"))) {
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
    public void onHead13(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.13").toString().replace("&", "§"))) {
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
    public void onHead14(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.14").toString().replace("&", "§"))) {
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
    public void onHead15(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.15").toString().replace("&", "§"))) {
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
    public void onHead16(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.16").toString().replace("&", "§"))) {
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
    public void onHead17(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.17").toString().replace("&", "§"))) {
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
    public void onHead18(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.18").toString().replace("&", "§"))) {
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
    public void onHead19(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.19").toString().replace("&", "§"))) {
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
    public void onHead20(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.20").toString().replace("&", "§"))) {
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
    public void onHead21(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.21").toString().replace("&", "§"))) {
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
    public void onHead22(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.22").toString().replace("&", "§"))) {
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
    public void onHead23(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.23").toString().replace("&", "§"))) {
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
    public void onHead24(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.24").toString().replace("&", "§"))) {
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
    public void onHead25(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.25").toString().replace("&", "§"))) {
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
    public void onHead26(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.26").toString().replace("&", "§"))) {
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
    public void onHead27(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.27").toString().replace("&", "§"))) {
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
    public void onHead28(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (!e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.28").toString().replace("&", "§"))) {
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
    public void onHead29(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.29").toString().replace("&", "§"))) {
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
    public void onHead30(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.30").toString().replace("&", "§"))) {
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
    public void onHead31(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.31").toString().replace("&", "§"))) {
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
    public void onHead32(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.32").toString().replace("&", "§"))) {
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
    public void onHead33(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.33").toString().replace("&", "§"))) {
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
    public void onHead34(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.34").toString().replace("&", "§"))) {
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
    public void onHead35(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Heads.0").toString().replace("&", "§"))) {
            if (p.getGameMode() != GameMode.CREATIVE) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getLore().contains(PlayerHeads.getValue("heads.buy.lore").toString().replace("&", "§"))) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(PlayerHeads.getValue("Head.Display.Name.35").toString().replace("&", "§"))) {
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