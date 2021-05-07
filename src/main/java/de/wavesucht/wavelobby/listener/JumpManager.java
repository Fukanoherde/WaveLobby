package de.wavesucht.wavelobby.listener;

import de.wavesucht.wavelobby.WaveLobby;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class JumpManager implements Listener {

    private WaveLobby plugin;
    public JumpManager (WaveLobby plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onFly(PlayerToggleFlightEvent e){
        Player p =  e.getPlayer();
        if(p.getGameMode() == GameMode.SURVIVAL){
            e.setCancelled(true);
            p.setAllowFlight(false);
            p.setFlying(false);
            p.setVelocity(p.getLocation().getDirection().multiply(2).add(new Vector(0,0.5,0)));
            p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1, 1);

        }
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.SURVIVAL){
            if (p.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR){
                p.setAllowFlight(true);
                p.setFlying(false);
            }
        }
    }
    @EventHandler
    public void onDM(EntityDamageEvent e){
        if (e.getEntity() instanceof Player) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onDubbleJump(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.setAllowFlight(true);
        p.setFlying(false);
    }
}