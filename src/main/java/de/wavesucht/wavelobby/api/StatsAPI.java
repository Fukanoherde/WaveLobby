package de.wavesucht.wavelobby.api;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.database.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StatsAPI {

    public static boolean playerExists(String uuid) {
        try {
            ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
            if (rs.next()) {
                return rs.getString("UUID") != null;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void createPlayer(String uuid, String name) {
        if (!playerExists(uuid)) {
            MySQL.update("INSERT INTO Stats (UUID, NAME, KILLS, DEATHS, WIN, LOSE, COINS) VALUES ('" + uuid + "', '" + name + "', '0', '0', '0', '0', '100');");
        }
    }
    public static Integer getKills(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("KILLS"));
                }
                i = Integer.valueOf(rs.getInt("KILLS"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getKills(uuid, name);
        }
        return i;
    }
    public static Integer getCoins(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("COINS"));
                }
                i = Integer.valueOf(rs.getInt("COINS"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getCoins(uuid, name);
        }
        return i;
    }
    public static Integer getWins(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("WIN"));
                }
                i = Integer.valueOf(rs.getInt("WIN"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getWins(uuid, name);
        }
        return i;
    }
    public static Integer getLoses(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("LOSE"));
                }
                i = Integer.valueOf(rs.getInt("LOSE"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getLoses(uuid, name);
        }
        return i;
    }
    public static Integer getDeath(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("DEATHS"));
                }
                i = Integer.valueOf(rs.getInt("DEATHS"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getDeath(uuid, name);
        }
        return i;
    }
    public static void setKills(String uuid, String name, Integer kills) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Stats SET KILLS='" + kills + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setKills(uuid, name, kills);
        }
    }
    public static void setCoins(String uuid, String name, Integer coins) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Stats SET COINS='" + coins + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setCoins(uuid, name, coins);
        }
    }
    public static void setWins(String uuid, String name, Integer wins) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Stats SET WIN='" + wins + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setWins(uuid, name, wins);
        }
    }
    public static void setLose(String uuid, String name, Integer lose) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Stats SET LOSE='" + lose + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setLose(uuid, name, lose);
        }
    }
    public static void setDeaths(String uuid, String name, Integer death) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Stats SET DEATHS='" + death + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setDeaths(uuid, name, death);
        }
    }
    public static void addKills(String uuid, String name, Integer kills) {
        if (playerExists(uuid)) {
            setKills(uuid, name, Integer.valueOf(getKills(uuid, name)) + kills.intValue());
        } else {
            createPlayer(uuid, name);
            addKills(uuid, name, kills);
        }
    }
    public static void addLose(String uuid, String name, Integer lose) {
        if (playerExists(uuid)) {
            setLose(uuid, name, Integer.valueOf(getLoses(uuid, name)) + lose.intValue());
        } else {
            createPlayer(uuid, name);
            addLose(uuid, name, lose);
        }
    }
    public static void addCoins(String uuid, String name, Integer coins) {
        if (playerExists(uuid)) {
            setCoins(uuid, name, Integer.valueOf(getCoins(uuid, name)) + coins.intValue());
        } else {
            createPlayer(uuid, name);
            addCoins(uuid, name, coins);
        }
    }
    public static void addWins(String uuid, String name, Integer wins) {
        if (playerExists(uuid)) {
            setWins(uuid, name, Integer.valueOf(getWins(uuid, name)) + wins.intValue());
        } else {
            createPlayer(uuid, name);
            addWins(uuid, name, wins);
        }
    }
    public static void addDeath(String uuid, String name, Integer deaths) {
        if (playerExists(uuid)) {
            setDeaths(uuid, name, Integer.valueOf(getDeath(uuid, name)) + deaths.intValue());
        } else {
            createPlayer(uuid, name);
            addDeath(uuid, name, deaths);
        }
    }
    public static void removeKills(String uuid, String name, Integer kills) {
        if (playerExists(uuid)) {
            setKills(uuid, name, Integer.valueOf(getKills(uuid, name).intValue() - kills.intValue()));
        } else {
            createPlayer(uuid, name);
            removeKills(uuid, name, kills);
        }
    }
    public static void removeDeaths(String uuid, String name, Integer death) {
        if (playerExists(uuid)) {
            setDeaths(uuid, name, Integer.valueOf(getDeath(uuid, name).intValue() - death.intValue()));
        } else {
            createPlayer(uuid, name);
            removeDeaths(uuid, name, death);
        }
    }
    public static void removeCoins(String uuid, String name, Integer coins) {
        if (playerExists(uuid)) {
            setCoins(uuid, name, Integer.valueOf(getCoins(uuid, name).intValue() - coins.intValue()));
        } else {
            createPlayer(uuid, name);
            removeCoins(uuid, name, coins);
        }
    }
    public static void removeWin(String uuid, String name, Integer wins) {
        if (playerExists(uuid)) {
            setWins(uuid, name, Integer.valueOf(getWins(uuid, name).intValue() - wins.intValue()));
        } else {
            createPlayer(uuid, name);
            removeWin(uuid, name, wins);
        }
    }
    public static void removeLoses(String uuid, String name, Integer loses) {
        if (playerExists(uuid)) {
            setLose(uuid, name, Integer.valueOf(getLoses(uuid, name).intValue() - loses.intValue()));
        } else {
            createPlayer(uuid, name);
            removeLoses(uuid, name, loses);
        }
    }
    public static Integer getUserRanking(String p) {
        boolean done = false;
        int n = 0;
        try {
            ResultSet rs = MySQL.getResult("SELECT name FROM Stats ORDER BY KILLS DESC;");
            while ((rs.next()) && (!done)) {
                n++;
                if (rs.getString(1).equalsIgnoreCase(p)) {
                    done = true;
                }
            }
            rs.close();
        }
        catch (Exception err) {
            System.err.println("[] gSystem-Error-User-getUserRanking []");
            System.err.println(err);
            System.err.println("[] gSystem-Error-User-getUserRanking []");
        }
        return Integer.valueOf(n);
    }
}