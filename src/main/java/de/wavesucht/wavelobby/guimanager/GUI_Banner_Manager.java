package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PermManager;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.meta.FireworkMeta;

public class GUI_Banner_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_Banner_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // onRedBanner \\

    @EventHandler
    public void onRedBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Red").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Red").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.RED));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onGreenBanner §6" + e1);
        }
    }

    // onGreenBanner \\

    @EventHandler
    public void onGreenBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Green").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Green").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.GREEN));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onGreenBanner §6" + e1);
        }
    }

    // onOrangeBanner \\

    @EventHandler
    public void onOrangeBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Orange").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Orange").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.ORANGE));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onOrangeBanner §6" + e1);
        }
    }

    // onMagentaBanner \\

    @EventHandler
    public void onMagentaBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Magenta").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Magenta").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.MAGENTA));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onMagentaBanner §6" + e1);
        }
    }

    // onBlackBanner \\

    @EventHandler
    public void onBlackBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Black").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Black").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.BLACK));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onBlackBanner §6" + e1);
        }
    }

    // onGrayBanner \\

    @EventHandler
    public void onGrayBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Light_Gray").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Light_Gray").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.GRAY));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onGrayBanner §6" + e1);
        }
    }

    // onBrownBanner \\

    @EventHandler
    public void onBrownBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Brown").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Brown").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.BROWN));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onBrownBanner §6" + e1);
        }
    }

    // onPinkBanner \\

    @EventHandler
    public void onPinkBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Pink").toString().replace("&", "§"))) {
                                if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Pink").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.PINK));
                                    Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                    FireworkMeta fwm = fw.getFireworkMeta();
                                    p.closeInventory();
                                } else {
                                    p.closeInventory();
                                    p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onPinkBanner §6" + e1);
        }
    }

    // onLimeBanner \\

    @EventHandler
    public void onLimeBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Lime").toString().replace("&", "§"))) {
                            if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Lime").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.LIME));
                                Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                FireworkMeta fwm = fw.getFireworkMeta();
                                p.closeInventory();
                                p.updateInventory();
                            } else {
                                p.closeInventory();
                                p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onLimeBanner §6" + e1);
        }
    }

    // onBlueBanner \\

    @EventHandler
    public void onBlueBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadgets.Name.Banner_Blue").toString().replace("&", "§"))) {
                            if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Banner_Blue").toString().replace("&", "§")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                p.getInventory().setHelmet(ItemAPI.createBanner(DyeColor.BLUE));
                                Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                FireworkMeta fwm = fw.getFireworkMeta();
                                p.closeInventory();
                                p.updateInventory();
                            } else {
                                p.closeInventory();
                                p.sendMessage(plugin.Prefix + MessageManager.getValue("Message.NoPerms").toString().replace("&", "§"));
                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            p.sendMessage("§4Error onLimeBanner §6" + e1);
        }
    }

// onDeleteBanner \\

    @EventHandler
    public void onDeleteBanner(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Banner").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§"))) {
                            p.getInventory().setHelmet(null);
                            Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                            FireworkMeta fwm = fw.getFireworkMeta();
                            p.closeInventory();
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onDeleteBanner §6" + e1);
        }
    }
}