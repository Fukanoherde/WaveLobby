package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PermManager;
import org.bukkit.Bukkit;
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

public class GUI_Boots_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_Boots_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // Boots Love

    @EventHandler
    public void onLoveBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Love").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Love")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onLoveBoots §6" + e1);
        }
    }

    // Boots Water

    @EventHandler
    public void onWaterBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Water").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Water")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onWaterBoots §6" + e1);
        }
    }

    // Boots Flame

    @EventHandler
    public void onFlameBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Flame").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Flame")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onFlameBoots §6" + e1);
        }
    }

    // Boots Lava

    @EventHandler
    public void onLavaBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Lava").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Lava")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onLavaBoots §6" + e1);
        }
    }

    // Boots Magic

    @EventHandler
    public void onMagicBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Magic").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Magic")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onMagicBoots §6" + e1);
        }
    }

    // Boots Rainbow

    @EventHandler
    public void onRainbowBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Rainbow").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Rainbow")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onRainboeBoots §6" + e1);
        }
    }

    // Boots Happy

    @EventHandler
    public void onHappyBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Happy").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Happy")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onHappyBoots §6" + e1);
        }
    }

    // Boots Angry

    @EventHandler
    public void onAngryBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Angry").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Angry")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onAngryBoots §6" + e1);
        }
    }

    // Boots Ninja

    @EventHandler
    public void onNinjaBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Ninja").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Ninja")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onNinjaBoots §6" + e1);
        }
    }

    // Boots Explode

    @EventHandler
    public void onExplodeBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.Explode").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.Explode")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onExplodeBoots §6" + e1);
        }
    }

    // Boots Spezi

    @EventHandler
    public void onSpeziBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Boots.on").toString().replace("&", "§"))) {
                                if (p.hasPermission((String) LobbyItems.getValue("Gui.Boots.Perm.on")) || p.hasPermission((String) PermManager.getValue("Perms.premium"))) {
                                    p.getInventory().setBoots(e.getCurrentItem());
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
            p.sendMessage("§4Error onSpeziBoots §6" + e1);
        }
    }

    // Boots Remove

    @EventHandler
    public void onRemoveBoots(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Boots").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§"))) {
                                p.getInventory().setBoots(null);
                                Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                                FireworkMeta fwm = fw.getFireworkMeta();
                                p.closeInventory();

                            }
                        }
                    }
                }
            }

        } catch (Exception e1) {
            Bukkit.getConsoleSender().sendMessage("§4Error onLoveBoots §6" + e1);
        }
    }
}