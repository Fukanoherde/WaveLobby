package de.wavesucht.wavelobby.listener;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockManager implements Listener {

    private WaveLobby plugin;
    public BlockManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if (e.isCancelled()) {
            return;
        }
        if (plugin.build.contains(e.getPlayer())) {
            return;
        } else {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        if (e.isCancelled()) {
            return;
        }
        if (plugin.build.contains(e.getPlayer())) {
            return;
        } else {
            e.setCancelled(true);
        }
    }
}