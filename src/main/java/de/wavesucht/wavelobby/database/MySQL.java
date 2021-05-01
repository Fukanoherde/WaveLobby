package de.wavesucht.wavelobby.database;

/*

Created by LionGaming_95

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;

public class MySQL {

    public static Connection con;

    public static void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + WaveLobby.getPlugin().Host + ":" + WaveLobby.getPlugin().Port + "/" + WaveLobby.getPlugin().Datenbank + "?user=" + WaveLobby.getPlugin().User + "&password=" + WaveLobby.getPlugin().Password + "&autoReconnect=true");
            Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §eThe database succesfully connected!");
        } catch (SQLException e) {
            Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §4ERROR: the connection has been error! §3Please contact the Plugin Developer -> LionGaming_95!");
        }
    }

    public static void close() {
        if (isConnected()) {
            try {
                con.close();
                Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §cThe database succesfully disconnected!");
            } catch (SQLException e) {
                Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §4ERROR: §cthe connection has been error! Please contact the Plugin Developer -> LionGaming_95");
            }
        }
    }

    public static boolean isConnected () {
        return con != null;
    }

    public static void createStatsTable() {
        if (isConnected()) {
            try {
                con.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS Stats (UUID VARCHAR(100), NAME VARCHAR(100), KILLS int, DEATHS int , WIN int , LOSE int , COINS int)");
                Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §eStats Table created");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createNickTable() {
        if (isConnected()) {
            try {
                con.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS Nick (UUID VARCHAR(100), NAME VARCHAR(100), NICKED int)");
                Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §eNick Table created");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createAllowOPTable() {
        if (isConnected()) {
            try {
                con.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS AllowOP (UUID VARCHAR(100), NAME VARCHAR(100), OPPerm int)");
                Bukkit.getConsoleSender().sendMessage("§7[§3MySQL§7] §eAllowOP Table created");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void update(String qry) {
        if (isConnected()) {
            try {
                con.createStatement().executeUpdate(qry);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ResultSet getResult(String qry) {
        ResultSet rs = null;
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(qry);
        } catch (SQLException e) {
            connect();
            System.err.println(e);
        }
        return rs;
    }
}