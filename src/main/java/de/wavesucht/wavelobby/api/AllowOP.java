package de.wavesucht.wavelobby.api;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.database.MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AllowOP {

    public static boolean playerExists(String uuid) {
        try {
            ResultSet rs = MySQL.getResult("SELECT * FROM AllowOP WHERE UUID='" + uuid + "'");
            if (rs.next()) {
                return rs.getString("UUID") != null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void createPlayerOp(String uuid, String name) {
        if (!playerExists(uuid)) {
            MySQL.update("INSERT INTO AllowOP (UUID, NAME, OpPerm) VALUES ('" + uuid + "', '" + name + "', '0');");
        }
    }

    public static Integer getOpPerm(String uuid, String name) {
        Integer i = Integer.valueOf(0);
        if (playerExists(uuid)) {
            try {
                ResultSet rs = MySQL.getResult("SELECT * FROM AllowOP WHERE UUID='" + uuid + "'");
                if (rs.next()) {
                    Integer.valueOf(rs.getInt("OPPerm"));
                }
                i = Integer.valueOf(rs.getInt("OPPerm"));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            createPlayerOp(uuid, name);
            getOpPerm(uuid, name);
        }
        return i;
    }

    public static void setOpPerm(String uuid, String name, Integer opperm) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE AllowOP SET OpPerm='" + opperm + "' WHERE UUID='" + uuid + "'");
        } else {
            createPlayerOp(uuid, name);
            setOpPerm(uuid, name, opperm);
        }
    }
}