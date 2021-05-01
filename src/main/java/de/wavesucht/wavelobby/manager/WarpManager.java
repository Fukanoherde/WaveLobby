package de.wavesucht.wavelobby.manager;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class WarpManager {

    private WaveLobby plugin;
    public WarpManager (WaveLobby plugin) {
        this.plugin = plugin;
    }

    public static File f = new File("plugins//WaveLobby", "Location.yml");
    public static YamlConfiguration config = YamlConfiguration.loadConfiguration(f);

    public static void setWarpPoint(Player p, String warpname) throws IOException {
        String path = "WaveLobby" + "." + warpname + ".";

        String welt = p.getWorld().getName();
        double x = p.getLocation().getX();
        double y = p.getLocation().getY();
        double z = p.getLocation().getZ();
        float yaw = p.getLocation().getYaw();
        float pitch = p.getLocation().getPitch();

        config.set(path + "Welt", welt);
        config.set(path + "X", Double.valueOf(x));
        config.set(path + "Y", Double.valueOf(y));
        config.set(path + "Z", Double.valueOf(z));
        config.set(path + "Yaw", Float.valueOf(yaw));
        config.set(path + "Pitch", Float.valueOf(pitch));
        config.set(path + "SetFrom", p.getUniqueId() + " : " + p.getName());

        config.options().header("WaveLobby" + " WarpManager");
        config.options().copyHeader(true);

        savecfg();
    }
    public static void teleportToWarp(Player player, String warpname) {
        String path = "WaveLobby" + "." + warpname + ".";
        String world = config.getString(path + "Welt");
        double x = config.getDouble(path + "X");
        double y = config.getDouble(path + "Y");
        double z = config.getDouble(path + "Z");
        float yaw = (float)config.getDouble(path + "Yaw");
        float pitch = (float)config.getDouble(path + "Pitch");
        Location location = new Location(Bukkit.getWorld(world), x, y, z, yaw, pitch);
        player.teleport(location);
    }
    public static void deletedWarpPoint(Player p, String warpname) {
        String path = warpname + " . ";

        config.set(path + "Welt", null);
        config.set(path + "X", null);
        config.set(path + "Y", null);
        config.set(path + "Z", null);
        config.set(path + "Yaw", null);
        config.set(path + "Pitch", null);
        config.set(path + "SetFrom", null);
        config.set(warpname, null);

        if (p == null) {
            Bukkit.getConsoleSender().sendMessage(WaveLobby.getPlugin().Prefix + "§cThe warp §3" + warpname + " §chas been deleted by §b" + p.getDisplayName() + "§c!");
        } else {
            Bukkit.getConsoleSender().sendMessage(WaveLobby.getPlugin().Prefix + "§cThe warp §3" + warpname + " §chas been deleted!");
        }
        try {
            config.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            savecfg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean isWarpExist(String warpname) {
        String path = "WaveLobby" + "." + warpname + ".";
        if(config.get(path) == null) {
            return false;
        }
        return true;
    }
    public static void savecfg() throws IOException {
        config.save(f);
    }
}