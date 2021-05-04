package de.wavesucht.wavelobby;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.commands.CMD_AllowOP;
import de.wavesucht.wavelobby.commands.CMD_Build;
import de.wavesucht.wavelobby.commands.CMD_ChatClear;
import de.wavesucht.wavelobby.commands.CMD_SetWarp;
import de.wavesucht.wavelobby.database.MySQL;
import de.wavesucht.wavelobby.files.LobbyItems;
import de.wavesucht.wavelobby.files.MessageManager;
import de.wavesucht.wavelobby.files.PermManager;
import de.wavesucht.wavelobby.files.PlayerHeads;
import de.wavesucht.wavelobby.gui.*;
import de.wavesucht.wavelobby.guimanager.*;
import de.wavesucht.wavelobby.listener.*;
import de.wavesucht.wavelobby.manager.WarpManager;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
    private BootsManager bootsManager;
    private InventoryManager inventoryManager;
    private JumpManager jumpManager;
    private ChatManager chatManager;

    // gui \\

    private GUI_Banner banner;
    private GUI_Navigator navigator;
    private GUI_Boots boots;
    private GUI_GadGets gadGets;
    private GUI_Heads heads;
    private GUI_LobbySwitcher lobbySwitcher;
    private GUI_TeamHeads teamHeads;
    private GUI_UserMenu userMenu;
    private GUI_YTHeads ytHeads;

    // gui_manager \\

    private GUI_Banner_Manager banner_manager;
    private GUI_Boots_Manager boots_manager;
    private GUI_HeadsManager headsManager;
    private GUI_Heads_Manager heads_manager;
    private GUI_Manager_Back back;
    private GUI_TeamHeads_Manager teamHeadsManager;
    private GUI_YTHeads_Maanager ytHeads_maanager;

    // Utils \\

    public static WaveLobby plugin;
    public static ArrayList<Player> build = new ArrayList<>();
    public static ArrayList<Player> PlayerHider = new ArrayList<>();
    public static HashMap<String, Long> delay = new HashMap<String, Long>();

    @Override
    public void onEnable() {

        enableFiles();
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

    private void enableFiles () {

        plugin = this;
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveResource("config.yml", true);
        }
        PermManager.loadFile();
        LobbyItems.loadFile();
        PlayerHeads.loadFile();
        MessageManager.loadFile();
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
        this.bootsManager = new BootsManager(this);
        this.inventoryManager = new InventoryManager(this);
        this.jumpManager = new JumpManager(this);
        this.chatManager = new ChatManager(this);

        // gui \\

        this.banner = new GUI_Banner(this);
        this.navigator = new GUI_Navigator(this);
        this.boots = new GUI_Boots(this);
        this.gadGets = new GUI_GadGets(this);
        this.heads = new GUI_Heads(this);
        this.lobbySwitcher = new GUI_LobbySwitcher(this);
        this.teamHeads = new GUI_TeamHeads(this);
        this.userMenu = new GUI_UserMenu(this);
        this.ytHeads = new GUI_YTHeads(this);

        // gui Manager \\

        this.banner_manager = new GUI_Banner_Manager(this);
        this.banner_manager = new GUI_Banner_Manager(this);
        this.headsManager = new GUI_HeadsManager(this);
        this.heads_manager = new GUI_Heads_Manager(this);
        this.back = new GUI_Manager_Back(this);
        this.teamHeadsManager = new GUI_TeamHeads_Manager(this);
        this.ytHeads_maanager = new GUI_YTHeads_Maanager(this);

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