package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.utils.ItemBuilder;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class GadGetListener implements Listener {

    private WaveLobby plugin;
    public GadGetListener (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // onGiveEnterhackenGadGet \\

    @EventHandler
    public void onGiveEnterhackenGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Gadgets.Enterhacken").toString().replace("&", "§"))) {
                            if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Enterhacken").toString().replace("&", "§"))) {
                                p.getInventory().setItem(4, new ItemBuilder(Material.FISHING_ROD).setName(LobbyItems.getValue("Gui.Gadgets.Enterhacken").toString().replace("&", "§")).build());
                                p.closeInventory();
                                p.updateInventory();
                            } else {
                                p.closeInventory();
                                p.updateInventory();
                                p.sendMessage(plugin.Prefix +
                                        MessageManager.getValue("Chat.NoPerms.Banner").toString().replace("&", "§"));
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onGiveEnterhackenGadGet §6" + e1);
        }
    }

    // onGiveEnderPearlGadGet \\

    @EventHandler
    public void onGiveEnderPearlGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Gadgets.Enderpearl").toString().replace("&", "§"))) {
                            p.getInventory().setItem(4, new ItemBuilder(Material.ENDER_PEARL).setName(LobbyItems.getValue("Gui.Gadgets.Enderpearl").toString().replace("&", "§")).build());
                            p.closeInventory();
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onGiveEnderPearlGadGet §6" + e1);
        }
    }

    // onGiveTrollTNTGadGet \\

    @EventHandler
    public void onGiveTrollTNTGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Gadgets.TrollTNT").toString().replace("&", "§"))) {
                            if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.TrollTNT").toString().replace("&", "§"))) {
                                p.getInventory().setItem(4, new ItemBuilder(Material.TNT).setName(LobbyItems.getValue("Gui.Gadgets.TrollTNT").toString().replace("&", "§")).build());
                                p.closeInventory();
                                p.updateInventory();
                            } else {
                                p.closeInventory();
                                p.updateInventory();
                                p.sendMessage(plugin.Prefix +
                                        MessageManager.getValue("Chat.NoPerms.Banner").toString().replace("&", "§"));
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onGiveTrollTNTGadGet §6" + e1);
        }
    }

    // onGiveSpeedGadGet \\

    @EventHandler
    public void onGiveSpeedGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Gui.Gadgets.Speed").toString().replace("&", "§"))) {
                            if (p.hasPermission(LobbyItems.getValue("Item.Gui.Gadgets.Perm.Speed").toString().replace("&", "§"))) {
                                p.getInventory().setItem(4, new ItemBuilder(Material.NETHER_STAR).setName(LobbyItems.getValue("Gui.Gadgets.Speed").toString().replace("&", "§")).build());
                                p.closeInventory();
                                p.updateInventory();
                            } else {
                                p.closeInventory();
                                p.updateInventory();
                                p.sendMessage(plugin.Prefix +
                                        MessageManager.getValue("Message.NoPerms.Banner").toString().replace("&", "§"));
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onGiveSpeedGadGet §6" + e1);
        }
    }

    // onDeleteGadGet \\

    @EventHandler
    public void onDeleteGadGet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {
                if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                    if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§"))) {
                            p.getInventory().setItem(4, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Item.Hotbar.Name.Gadgets").toString().replace("&", "§")).build());
                            Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                            FireworkMeta fwm = fw.getFireworkMeta();
                            p.closeInventory();
                            p.updateInventory();
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onDeleteGadGet §6" + e1);
        }
    }

    // onEnterhacken \\

    @EventHandler
    public void onEnterhacken(PlayerFishEvent e) {
        Player p = e.getPlayer();
        Fish h = e.getHook();
        if ((e.getState().equals(PlayerFishEvent.State.IN_GROUND) || e.getState().equals(PlayerFishEvent.State.CAUGHT_ENTITY) || e.getState().equals(PlayerFishEvent.State.FAILED_ATTEMPT)) && Bukkit.getWorld(e.getPlayer().getWorld().getName()).getBlockAt(h.getLocation().getBlockX(), h.getLocation().getBlockY() - 1, h.getLocation().getBlockZ()).getType() != Material.AIR && Bukkit.getWorld(e.getPlayer().getWorld().getName()).getBlockAt(h.getLocation().getBlockX(), h.getLocation().getBlockY() - 1, h.getLocation().getBlockZ()).getType() != Material.STATIONARY_WATER) {

            if (e.getPlayer().hasPermission("Item.Gui.Gadgets.Perm.Enterhacken")) {
                Location lc = p.getLocation();
                Location to = e.getHook().getLocation();
                lc.setY(lc.getY() + 0.8D);
                p.teleport(lc);
                double g = -0.08D;
                double t = to.distance(lc), d = t;
                double v_x = (1.0D + 0.07D * t) * (to.getX() - lc.getX()) / t;
                double v_y = (1.0D + 0.03D * t) * (to.getY() - lc.getY()) / t - -0.04D * t;
                double v_z = (1.0D + 0.07D * t) * (to.getZ() - lc.getZ()) / t;
                Vector v = p.getVelocity();
                v.setX(v_x);
                v.setY(v_y);
                v.setZ(v_z);
                p.setVelocity(v);
                p.getInventory().setItem(4, ItemAPI.createItemNoEnch2(Material.FISHING_ROD, 1, 0, LobbyItems.getValue("Gui.Gadgets.Enterhacken").toString().replace("&", "§")));
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
            }
        }
    }

    @EventHandler
    public void onSpeedFromGadGet(PlayerInteractEvent e) {
        try {
            if (e.getAction() == Action.RIGHT_CLICK_AIR && e.getPlayer().getItemInHand().getType() == Material.NETHER_STAR) {
                if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                    if (e.getPlayer().hasPermission("Item.Gui.Gadgets.Perm.Speed")) {
                        Long time = Long.valueOf(System.currentTimeMillis());
                        if (WaveLobby.delay.containsKey(e.getPlayer().getName())) {
                            Long LastUse = WaveLobby.delay.get(e.getPlayer().getName());
                            if (LastUse.longValue() + 30000 > time.longValue()) {
                                e.getPlayer().sendMessage(plugin.Prefix + "§4Du musst §c30 §4Sekunden Warten!");
                                return;
                            }
                        }
                        e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 150, 2));
                        WaveLobby.delay.put(e.getPlayer().getName(), time);
                    }
                }
            }
        } catch (Exception e1) {
            e.getPlayer().sendMessage("" + e1);
        }
    }

    // onPlaceTrollTNT \\

    @EventHandler
    public void onPlaceTrollTNT(BlockPlaceEvent e) {
        try {
            if (e.getBlock().getType() == Material.TNT) {
                final Player p = e.getPlayer();
                e.getBlock().setType(Material.AIR);
                TNTPrimed tnt = (TNTPrimed) e.getBlock().getWorld().spawn(e.getBlock().getLocation(), TNTPrimed.class);
                tnt.setFuseTicks(40);

                Vector v = p.getLocation().getDirection().multiply(2.0D).setY(1.5D);
                p.setVelocity(v);
                p.playSound(p.getLocation(), Sound.BURP, 1.0F, 1.0F);
                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    public void run() {
                        ItemStack TROLLTNT = new ItemStack(Material.TNT);
                        ItemMeta TROLLTNTMeta = TROLLTNT.getItemMeta();
                        TROLLTNTMeta.setDisplayName(LobbyItems.getValue("").toString().replace("&", "§"));
                        TROLLTNT.setItemMeta(TROLLTNTMeta);
                        p.getInventory().setItem(4, TROLLTNT);
                        p.playSound(p.getLocation(), Sound.FIREWORK_BLAST2, 3.0F, 3.0F);
                    }
                }, 1L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    public void run() {
                        ItemStack LADET = new ItemStack(Material.FIREBALL);
                        ItemMeta LADETMeta = LADET.getItemMeta();
                        LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                        LADET.setItemMeta(LADETMeta);
                        p.getInventory().setItem(4, LADET);
                        p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                        p.setLevel(1);
                    }
                }, 4L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    public void run() {
                        ItemStack LADET = new ItemStack(Material.FIREBALL);
                        ItemMeta LADETMeta = LADET.getItemMeta();
                        LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                        LADET.setItemMeta(LADETMeta);
                        p.getInventory().setItem(4, LADET);
                        p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                        p.setLevel(1);
                    }
                }, 15L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    public void run() {
                        ItemStack LADET = new ItemStack(Material.FIREBALL);
                        ItemMeta LADETMeta = LADET.getItemMeta();
                        LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                        LADET.setItemMeta(LADETMeta);
                        p.getInventory().setItem(4, LADET);
                        p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                        p.setLevel(1);
                    }
                }, 30L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                    public void run() {
                        ItemStack LADET = new ItemStack(Material.FIREBALL);
                        ItemMeta LADETMeta = LADET.getItemMeta();
                        LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                        LADET.setItemMeta(LADETMeta);
                        p.getInventory().setItem(4, LADET);
                        p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                        p.setLevel(1);
                        p.getInventory().setItem(4, new ItemBuilder(Material.TNT).setName(LobbyItems.getValue("Gui.Gadgets.TrollTNT").toString().replace("&", "§")).build());
                    }
                }, 45L);
            }
        } catch (Exception e1) {
            e.getPlayer().sendMessage("");
        }
    }

    // onUseEnderpearl \\

    @EventHandler
    public void onUseEnderpearl(PlayerInteractEvent e) {
        try {
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (e.getPlayer().getItemInHand().getType() == Material.ENDER_PEARL) {
                    if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
                        Player p = e.getPlayer();

                        Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                            public void run() {
                                ItemStack TROLLTNT = new ItemStack(Material.ENDER_PEARL);
                                ItemMeta TROLLTNTMeta = TROLLTNT.getItemMeta();
                                TROLLTNTMeta.setDisplayName(LobbyItems.getValue("").toString().replace("&", "§"));
                                TROLLTNT.setItemMeta(TROLLTNTMeta);
                                p.getInventory().setItem(4, TROLLTNT);
                                p.playSound(p.getLocation(), Sound.FIREWORK_BLAST2, 3.0F, 3.0F);
                            }
                        }, 1L);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                            public void run() {
                                ItemStack LADET = new ItemStack(Material.FIREBALL);
                                ItemMeta LADETMeta = LADET.getItemMeta();
                                LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                                LADET.setItemMeta(LADETMeta);
                                p.getInventory().setItem(4, LADET);
                                p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                                p.setLevel(1);
                            }
                        }, 4L);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                            public void run() {
                                ItemStack LADET = new ItemStack(Material.FIREBALL);
                                ItemMeta LADETMeta = LADET.getItemMeta();
                                LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                                LADET.setItemMeta(LADETMeta);
                                p.getInventory().setItem(4, LADET);
                                p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                                p.setLevel(1);
                            }
                        }, 15L);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                            public void run() {
                                ItemStack LADET = new ItemStack(Material.FIREBALL);
                                ItemMeta LADETMeta = LADET.getItemMeta();
                                LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                                LADET.setItemMeta(LADETMeta);
                                p.getInventory().setItem(4, LADET);
                                p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                                p.setLevel(1);
                            }
                        }, 30L);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                            public void run() {
                                ItemStack LADET = new ItemStack(Material.FIREBALL);
                                ItemMeta LADETMeta = LADET.getItemMeta();
                                LADETMeta.setDisplayName(LobbyItems.getValue("Item.Gui.Gadgets.TrollTNT.Laden").toString().replace("&", "§"));
                                LADET.setItemMeta(LADETMeta);
                                p.getInventory().setItem(4, LADET);
                                p.playSound(p.getLocation(), Sound.NOTE_BASS, 3.0F, 3.0F);
                                p.getInventory().setItem(4, new ItemBuilder(Material.ENDER_PEARL).setName(LobbyItems.getValue("Gui.Gadgets.Enderpearl").toString().replace("&", "§")).build());
                            }
                        }, 45L);
                    }
                }
            }
        } catch(Exception e1){
            e.getPlayer().sendMessage("§4ERROR: §conUseEnderpearl §6" + e1);
        }
    }
}