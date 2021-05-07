package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
import de.wavesucht.wavelobby.files.LobbyItems;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GUI_GadGets_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_GadGets_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onGiveSpeedItem (InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Gui.Gadgets.Gadget").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Speed").toString().replace("&", "§"))) {
                                p.getInventory().setItem(4, ItemAPI.creationItem(Material.NETHER_STAR, 1, 0, LobbyItems.getValue("Gui.Gadgets.Speed").toString().replace("&", "§"), Enchantment.LURE, 1));
                                p.closeInventory();
                            }
                        }
                    }
                }
            }
        } catch (Exception e1) {
            p.sendMessage("§4Error onGiveSpeedItem §6" + e1);
        }
    }
    @EventHandler
    public void onSpeedFromGadGet (PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_AIR && e.getPlayer().getItemInHand().getType() == Material.NETHER_STAR) {
            if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
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
    }
}