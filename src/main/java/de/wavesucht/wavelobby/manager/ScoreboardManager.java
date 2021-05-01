package de.wavesucht.wavelobby.manager;

/*

Created by LionGaming_95

 */

import de.wavesucht.wavelobby.WaveLobby;
import de.wavesucht.wavelobby.api.StatsAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.util.HashMap;

public class ScoreboardManager {

    private WaveLobby plugin;
    public static Scoreboard board;
    public static HashMap<Scoreboard, Player> boards = new HashMap();

    public ScoreboardManager(WaveLobby plugin) {
        this.plugin = plugin;
    }

    public static void setScoreboard(Player p) {
        board = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective obj = board.registerNewObjective("test", "bbb");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("§4§lWaveSucht");

        obj.getScore("§l      ").setScore(14);
        obj.getScore("§7§lOnline Players:").setScore(13);
        obj.getScore("§l    ").setScore(11);
        obj.getScore("§7§lDeine Coins:").setScore(10);
        obj.getScore("§l").setScore(8);
        obj.getScore("§7§lUnser Forum:").setScore(7);
        obj.getScore("§b§lwavesucht.de").setScore(6);
        obj.getScore("§l ").setScore(5);
        obj.getScore("§7§lDein Rang:").setScore(4);
        if (PermissionsEx.getUser(p.getName()).inGroup("Owner")) {
            obj.getScore("§4§lInhaber").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Admin")) {
            obj.getScore("§c§lAdmin").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrDev")) {
            obj.getScore("§b§lSrDeveloper").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Developer")) {
            obj.getScore("§b§lDeveloper").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Dev")) {
            obj.getScore("§b§lTest-Developer").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrMod")) {
            obj.getScore("§3§lSrModerator").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Moderator")) {
            obj.getScore("§3§lModerator").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Mod")) {
            obj.getScore("§3§lTest-Moderator").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrSupporter")) {
            obj.getScore("§1§lSrSupporter").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Supporter")) {
            obj.getScore("§1§lSupporter").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Supporter")) {
            obj.getScore("§1§lTest-Supporter").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("SrBuilder")) {
            obj.getScore("§a§lSrBuilder").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Builder")) {
            obj.getScore("§a§lBuilder").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("T-Builder")) {
            obj.getScore("§a§lTest-Builder").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("YouTuber")) {
            obj.getScore("§5§lYouTuber").setScore(3);
        } else if (PermissionsEx.getUser(p.getName()).inGroup("Premium")) {
            obj.getScore("§6§l§lPremium").setScore(3);
        } else {
            obj.getScore("§8§lSpieler").setScore(3);
        }
        obj.getScore("§l  ").setScore(2);
        obj.getScore("§7§lTeamSpeak:").setScore(1);
        obj.getScore("§b§lts.wavesucht.de").setScore(0);

        p.setScoreboard(board);

        Team owner = board.registerNewTeam("aaa");
        Team admin = board.registerNewTeam("bbb");
        Team srdeveloper = board.registerNewTeam("ccc");
        Team developer = board.registerNewTeam("ddd");
        Team tdev= board.registerNewTeam("fff");
        Team srmoderator = board.registerNewTeam("ggg");
        Team moderator = board.registerNewTeam("hhh");
        Team tmoderator = board.registerNewTeam("iii");
        Team srsupporter = board.registerNewTeam("jjj");
        Team supporter = board.registerNewTeam("kkk");
        Team tsupporter = board.registerNewTeam("lll");
        Team srbuilder = board.registerNewTeam("mmm");
        Team builder = board.registerNewTeam("nnn");
        Team tbuilder = board.registerNewTeam("ooo");
        Team youtuber = board.registerNewTeam("ppp");
        Team premium = board.registerNewTeam("qqq");
        Team spieler = board.registerNewTeam("rrr");

        for (Player all : Bukkit.getOnlinePlayers()) {
            if (PermissionsEx.getUser(all).inGroup("Owner")) {
                owner.setPrefix("§4§lInhaber §8| ");
                owner.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Admin")) {
                admin.setPrefix("§c§lAdmin §8| ");
                admin.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("SrDev")) {
                srdeveloper.setPrefix("§b§lSrDev §8| ");
                srdeveloper.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Developer")) {
                developer.setPrefix("§b§lDev §8| ");
                developer.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("T-Dev")) {
                tdev.setPrefix("§b§lT-Dev §8| ");
                tdev.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("SrMod")) {
                srmoderator.setPrefix("§3§lSrMod §8| ");
                srmoderator.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Moderator")) {
                moderator.setPrefix("§3§lMod §8| ");
                moderator.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("T-Mod")) {
                tmoderator.setPrefix("§3§lT-Mod §8| ");
                tmoderator.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("SrSupporter")) {
                srsupporter.setPrefix("§1§lSrSupporter §8| ");
                srsupporter.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Supporter")) {
                supporter.setPrefix("§1§lSupporter §8| ");
                supporter.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("T-Supporter")) {
                tsupporter.setPrefix("§1§lT-Supporter §8| ");
                tsupporter.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("SrBuilder")) {
                srbuilder.setPrefix("§a§lSrBuilder §8| ");
                srbuilder.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Builder")) {
                builder.setPrefix("§a§lBuilder §8| ");
                builder.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("T-Builder")) {
                tbuilder.setPrefix("§a§lT-Builder §8| ");
                tbuilder.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("YouTuber")) {
                youtuber.setPrefix("§5§lYouTuber §8| ");
                youtuber.addPlayer(all);
            } else if (PermissionsEx.getUser(all).inGroup("Premium")) {
                premium.setPrefix("§6§lPremium §8| ");
                premium.addPlayer(all);
            } else {
                spieler.setPrefix("§8§lSpieler | ");
                spieler.addPlayer(all);
            }
        }
    }
    public static void UpdateScoreboard(Player p) {
        board = p.getScoreboard();
        Objective obj = board.getObjective("test");

        obj.getScore("§e" + Bukkit.getOnlinePlayers().size() + " §8/ §a" + Bukkit.getMaxPlayers()).setScore(12);
        obj.getScore("§e" + StatsAPI.getCoins(p.getUniqueId().toString(), p.getName())).setScore(9);
    }
}