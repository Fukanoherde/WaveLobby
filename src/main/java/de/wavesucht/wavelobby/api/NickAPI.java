package de.wavesucht.wavelobby.api;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.database.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NickAPI {

    public static boolean playerExists(String uuid) {
        try {
            ResultSet rs = MySQL.getResult("SELECT * FROM Nick WHERE UUID='" + uuid + "'");
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
            MySQL.update("INSERT INTO Nick (UUID, NAME, NICKED) VALUES ('" + uuid + "', '" + name + "', '0');");
        }
    }

    public static Integer getNicked(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM Nick WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("NICKED"));
                }
                i = Integer.valueOf(rs.getInt("NICKED"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            createPlayer(uuid, name);
            getNicked(uuid, name);
        }
        return i;
    }

    public static void setNicked(String uuid, String name, Integer nicked) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE Nick SET NICKED='" + nicked + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayer(uuid, name);
            setNicked(uuid, name, nicked);
        }
    }
}