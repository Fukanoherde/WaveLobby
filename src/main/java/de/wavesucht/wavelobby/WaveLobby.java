package de.wavesucht.wavelobby;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.commands.CMD_AllowOP;
import de.wavesucht.wavelobby.commands.CMD_Build;
import de.wavesucht.wavelobby.commands.CMD_ChatClear;
import de.wavesucht.wavelobby.commands.CMD_SetWarp;
import de.wavesucht.wavelobby.database.MySQL;
import de.wavesucht.wavelobby.listener.BlockManager;
import de.wavesucht.wavelobby.listener.LoginManager;
import de.wavesucht.wavelobby.listener.PlayerHider;
import de.wavesucht.wavelobby.listener.PlayerManager;
import de.wavesucht.wavelobby.manager.WarpManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class WaveLobby extends JavaPlugin {

    // Commands \\

    private CMD_AllowOP allowOP;
    private CMD_ChatClear cc;
    private CMD_Build buildMode;
    private CMD_SetWarp setWarp;

    // Listener \\

    private LoginManager login;
    private PlayerManager player;
    private BlockManager blockManager;
    private PlayerHider playerHider;

    // Utils \\

    public static WaveLobby plugin;
    public static ArrayList<Player> build = new ArrayList<>();
    public static ArrayList<Player> PlayerHider = new ArrayList<>();

    @Override
    public void onEnable() {

        enableManager();
        enableDatabase();
        enableEvents();
        enableCommands();
        enableMessage();

    }

    @Override
    public void onDisable() {

        disableDatabase();
        disableMessage();

    }

    private void disableDatabase () {

        if (MySQL.isConnected()) {
            MySQL.close();
        }
    }

    private void disableMessage () {

        Bukkit.getConsoleSender().sendMessage("§l");
        Bukkit.getConsoleSender().sendMessage("§9---------- §eWaveLobby §9----------");
        Bukkit.getConsoleSender().sendMessage("§l ");
        Bukkit.getConsoleSender().sendMessage("§7Version: §e" + this.plugin.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("§7YouTube: §ePsychoGamer_95");
        Bukkit.getConsoleSender().sendMessage("§7Website: §ewww.wavesucht.de");
        Bukkit.getConsoleSender().sendMessage("§7Minecraft-Name §eLionGaming1995");
        Bukkit.getConsoleSender().sendMessage("§9---------------------------------------");
    }

    private void enableManager () {

        plugin = this;
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveResource("config.yml", true);
        }
        try {
            WarpManager.savecfg();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void enableDatabase () {

        MySQL.connect();
        MySQL.createStatsTable();
        MySQL.createNickTable();
        MySQL.createAllowOPTable();
    }

    private void enableEvents () {

        this.login = new LoginManager(this);
        this.player = new PlayerManager(this);
        this.blockManager = new BlockManager(this);
        this.playerHider = new PlayerHider(this);

    }

    private void enableCommands () {

        this.allowOP = new CMD_AllowOP(this);
        this.cc = new CMD_ChatClear(this);
        this.buildMode = new CMD_Build(this);
        this.setWarp = new CMD_SetWarp(this);
    }

    private void enableMessage () {

        Bukkit.getConsoleSender().sendMessage("§l");
        Bukkit.getConsoleSender().sendMessage("§9---------- §eWaveLobby §9----------");
        Bukkit.getConsoleSender().sendMessage("§l ");
        Bukkit.getConsoleSender().sendMessage("§7Version: §e" + this.plugin.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("§7YouTube: §ePsychoGamer_95");
        Bukkit.getConsoleSender().sendMessage("§7Website: §ewww.wavesucht.de");
        Bukkit.getConsoleSender().sendMessage("§7Minecraft-Name §eLionGaming1995");
        Bukkit.getConsoleSender().sendMessage("§9---------------------------------------");
    }

    public static void invClearer (Player p) {
        p.getInventory().clear();
    }

    public static WaveLobby getPlugin() {
        return plugin;
    }

    public String Prefix = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Lobby.Prefix"));
    public boolean AllowJoinMessage = getConfig().getBoolean("Lobby.AllowJoinMessage");
    public boolean AllowQuitMessage = getConfig().getBoolean("Lobby.AllowQuitMessage");
    public String JoinMessage = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Messages.JoinMessage"));
    public String QuitMessage = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Messages.QuitMessage"));
    public String User = ChatColor.translateAlternateColorCodes('&', getConfig().getString("MySQL.Username"));
    public String Password = ChatColor.translateAlternateColorCodes('&', getConfig().getString("MySQL.Password"));
    public String Host = ChatColor.translateAlternateColorCodes('&', getConfig().getString("MySQL.Host"));
    public String Datenbank = ChatColor.translateAlternateColorCodes('&', getConfig().getString("MySQL.Datenbank"));
    public String Port = ChatColor.translateAlternateColorCodes('&', getConfig().getString("MySQL.Port"));
    public int JumpHeigh = getConfig().getInt("Lobby.DoppleJumpHeigh");
}