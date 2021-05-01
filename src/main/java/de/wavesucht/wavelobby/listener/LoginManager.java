package de.wavesucht.wavelobby.listener;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.AllowOP;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class LoginManager implements Listener {

    private WaveLobby plugin;
    public LoginManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onLogin (PlayerLoginEvent e) {

        Player p = e.getPlayer();
        if (p.isOp()) {
            if (AllowOP.getOpPerm(p.getUniqueId().toString(), p.getName()).intValue() == 0) {
                if (!PermissionsEx.getUser(p).inGroup("Owner")) {
                    e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§4ERROR: §cDu bist nicht befugt auf dem Server OP zu besitzen, §3und wurdest deswegen vom Server gekickt!");
                    p.setOp(false);
                } else if (PermissionsEx.getUser(p).inGroup("Owner")) {
                    e.allow();
                }
            }
        } else {
            e.allow();
        }
    }
}