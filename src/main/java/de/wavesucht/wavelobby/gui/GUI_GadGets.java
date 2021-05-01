package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.ItemAPI;
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

public class GUI_GadGets implements Listener {

    private WaveLobby plugin;
    public GUI_GadGets (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    // onCreateGadGetInv \\

    @EventHandler
    public void onCreateGadGetInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getInventory().getName().equals(LobbyItems.getValue("Item.Hotbar.Name.UserMenu").toString().replace("&", "§"))) {
                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (!e.getSlotType().equals(InventoryType.SlotType.OUTSIDE)) {
                        if (!e.getCurrentItem().getType().equals(Material.AIR)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"))) {

                                Inventory GadGet = Bukkit.createInventory(null, 27, LobbyItems.getValue("Item.Gui.Gadget").toString().replace("&", "§"));

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(10, ItemAPI.createItemNoEnch2(Material.ENDER_PEARL, 1, 0, LobbyItems.getValue("Gui.Gadgets.Enderpearl").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 2L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(12, ItemAPI.createItemNoEnch2(Material.FISHING_ROD, 1, 0, LobbyItems.getValue("Gui.Gadgets.Enterhacken").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 4L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(14, ItemAPI.createItemNoEnch2(Material.NETHER_STAR, 1, 0, LobbyItems.getValue("Gui.Gadgets.Speed").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 6L);
                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(16, ItemAPI.createItemNoEnch2(Material.TNT, 1, 0, LobbyItems.getValue("Gui.Gadgets.TrollTNT").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 8L);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(18, new ItemBuilder(new ItemStack(Material.SKULL_ITEM, 1, (byte) 3)).setName(LobbyItems.getValue("Navigator.Preview").toString().replace("&", "§")).setSkullOwner("MHF_ArrowRight").buildSkull());
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 10);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(WaveLobby.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        GadGet.setItem(26, ItemAPI.createItemNoEnch2(Material.BARRIER, 1, 0, LobbyItems.getValue("Navigator.Remove.1").toString().replace("&", "§")));
                                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                                    }
                                }, 12);

                                p.openInventory(GadGet);
                            }
                        }
                    }
                }
            }
        } catch(Exception e1){
            p.sendMessage("§4Error onCreateGadGetInv §6" + e1);
        }
    }
}