package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.manager.WarpManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GUI_Navigator implements Listener {

    private WaveLobby plugin;
    public GUI_Navigator (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onNavigator(PlayerInteractEvent e) {
        ItemStack Freunde = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        SkullMeta FreundeMeta = (SkullMeta)Freunde.getItemMeta();
        FreundeMeta.setOwner(e.getPlayer().getName());
        FreundeMeta.setDisplayName("§6✪ §3Community §6✪");
        Freunde.setItemMeta(FreundeMeta);

        if (e.getAction() == Action.RIGHT_CLICK_AIR && e.getPlayer().getItemInHand().getType() == Material.COMPASS) {
                if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                    final Inventory teleporter = Bukkit.createInventory(null, 27, "§6✪ §3Teleporter §6✪");

                    ItemStack GLASS = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
                    ItemMeta GLASSMETA = GLASS.getItemMeta();
                    GLASSMETA.setDisplayName(" ");
                    GLASS.setItemMeta(GLASSMETA);

                    teleporter.setItem(0, GLASS);
                    teleporter.setItem(1, GLASS);
                    teleporter.setItem(3, GLASS);
                    teleporter.setItem(4, GLASS);
                    teleporter.setItem(5, GLASS);
                    teleporter.setItem(7, GLASS);
                    teleporter.setItem(8, GLASS);
                    teleporter.setItem(9, GLASS);
                    teleporter.setItem(11, GLASS);
                    teleporter.setItem(15, GLASS);
                    teleporter.setItem(17, GLASS);
                    teleporter.setItem(18, GLASS);
                    teleporter.setItem(19, GLASS);
                    teleporter.setItem(21, GLASS);
                    teleporter.setItem(22, GLASS);
                    teleporter.setItem(23, GLASS);
                    teleporter.setItem(25, GLASS);
                    teleporter.setItem(26, GLASS);

                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(2, ItemAPI.creationItem(Material.STICK, 1, 0, "§6✪ §3KnockBackFFA §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 2L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(6, ItemAPI.creationItem(Material.DIAMOND, 1, 0, "§6✪ §3Creative §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 4L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(10, Freunde);
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 6L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(12, ItemAPI.creationItem(Material.DIAMOND_SWORD, 1, 0, "§6✪ §3PvP §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 8L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(13, ItemAPI.creationItem(Material.DIAMOND_PICKAXE, 1, 0, "§6✪ §3DullyMiner §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 10L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(14, ItemAPI.creationItem(Material.NETHER_BRICK, 1, 0, "§6✪ §3BedWars §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 12L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(16, ItemAPI.creationItem(Material.REDSTONE_TORCH_ON, 1, 0, "§6✪ §3Spawn §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 14L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(20, ItemAPI.creationItem(Material.SAPLING, 1, 0, "§6✪ §3Überleben §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 16L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

                        @Override
                        public void run() {
                            teleporter.setItem(24, ItemAPI.creationItem(Material.DIAMOND_SPADE, 1, 0, "§6✪ §3Spleef §6✪", Enchantment.LURE, 1));
                            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.CLICK, 1, 1);
                        }
                    }, 18L);
                    e.getPlayer().openInventory(teleporter);
                }
            }
    }
    @EventHandler
    public void onNavigatorTeleport(InventoryClickEvent e) {
        if (e.getClickedInventory() != null) {
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.STICK) {
                            if (WarpManager.isWarpExist("KnockBackFFA")) {
                                WarpManager.teleportToWarp(p, "KnockBackFFA");
                                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20, 20));
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aKnockBackFFA §2Teleportiert");
                            } else {
                                p.sendMessage(plugin.Prefix + "§4KnockBackFFA: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.DIAMOND) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("Creative")) {
                                WarpManager.teleportToWarp(p, "Creative");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aCreative §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4Creative: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.SKULL_ITEM) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("Community")) {
                                WarpManager.teleportToWarp(p, "Community");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aCommunity §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4Community: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.DIAMOND_SWORD) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("PvP")) {
                                WarpManager.teleportToWarp(p, "PvP");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aPvP §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4PvP: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.DIAMOND_PICKAXE) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("DullyMiner")) {
                                WarpManager.teleportToWarp(p, "DullyMiner");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aDullyMiner §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4DullyMiner: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.NETHER_BRICK) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("BedWars")) {
                                WarpManager.teleportToWarp(p, "BedWars");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aBedWars §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4BedWars: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.REDSTONE_TORCH_ON) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("Spawn")) {
                                WarpManager.teleportToWarp(p, "Spawn");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aSpawn §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4Spawn: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.SAPLING) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("Überleben")) {
                                WarpManager.teleportToWarp(p, "Überleben");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aÜberleben §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4Überleben: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
            if (e.getView().getTitle().equalsIgnoreCase("§6✪ §3Teleporter §6✪")) {
                Player p = (Player) e.getWhoClicked();
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() != Material.AIR) {
                        Material material = e.getCurrentItem().getType();

                        if (material == Material.DIAMOND_SPADE) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 20));
                            if (WarpManager.isWarpExist("Spleef")) {
                                WarpManager.teleportToWarp(p, "Spleef");
                                p.sendMessage(plugin.Prefix + "§2Du hast dich erfolgreich zum Warp: §aSpleef §2Teleportiert");
                                p.removePotionEffect(PotionEffectType.BLINDNESS);
                            } else {
                                p.sendMessage(plugin.Prefix + "§4Spleef: §cnicht gefunden. §4Bitte gebe einen Teammitglied Bescheid!");
                            }
                        }
                    }
                }
            }
        }
    }
}