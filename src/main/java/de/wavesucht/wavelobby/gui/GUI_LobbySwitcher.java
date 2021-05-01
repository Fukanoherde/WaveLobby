package de.wavesucht.wavelobby.gui;

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class GUI_LobbySwitcher implements Listener {

    private WaveLobby plugin;
    public GUI_LobbySwitcher (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onLobbySwitcher(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_AIR && e.getPlayer().getItemInHand().getType() == Material.GLOWSTONE_DUST) {
            if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
                Inventory LobbySwitcher = Bukkit.createInventory(null, 9, LobbyItems.getValue("Item.Hotbar.Name.Lobby").toString().replace("&", "§"));

                LobbySwitcher.setItem(0, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("LobbySwitcher.Lobby.Default.1").toString().replace("&", "§")).build());

                LobbySwitcher.setItem(2, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("LobbySwitcher.Lobby.Default.2").toString().replace("&", "§")).build());

                LobbySwitcher.setItem(4, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("LobbySwitcher.Lobby.Default.3").toString().replace("&", "§")).build());

                LobbySwitcher.setItem(6, new ItemBuilder(Material.BARRIER).setName(LobbyItems.getValue("Navigator.Placeholder").toString().replace("&", "§")).build());

                LobbySwitcher.setItem(8, new ItemBuilder(Material.EMERALD_BLOCK).setName(LobbyItems.getValue("LobbySwitcher.Lobby.Premium.1").toString().replace("&", "§")).build());
                /*
                e.getPlayer().openInventory(LobbySwitcher);
                 */
                e.getPlayer().sendMessage(plugin.Prefix + "§cFolgt im Update!");
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
                e.setCancelled(true);
            }
        }
    }
}