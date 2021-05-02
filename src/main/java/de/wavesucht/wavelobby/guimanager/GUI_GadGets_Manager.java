package de.wavesucht.wavelobby.guimanager;

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class GUI_GadGets_Manager implements Listener {

    private WaveLobby plugin;
    public GUI_GadGets_Manager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
}