package strafeland.club.deaths.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            this.manageCommand((Player) commandSender, args);
        } else {
            commandSender.sendMessage("§4---- §c§lDEATHS §lCommands §4----");
            commandSender.sendMessage("§f");
            commandSender.sendMessage("§c/deaths gui §4> §7To open the menu.");
            commandSender.sendMessage("§c/deaths thunder §4> §7To enable lightning when someone dies.");
            commandSender.sendMessage("§c/deaths announce §4> §7To enable deaths announcements.");
            commandSender.sendMessage("§c/deaths build §4> §7To enable block place.");
            commandSender.sendMessage("§c/deaths destroy §4> §7To enable block break.");
        }
        return true;
    }


    private void manageCommand(Player launcher, String[] args) {
        if (args.length == 0) {
            launcher.sendMessage("§4---- §c§lDEATHS §lCommands §4----");
            launcher.sendMessage("§f");
            launcher.sendMessage("§c/deaths gui §4⇨ §7To open the menu.");
            launcher.sendMessage("§c/deaths thunder §4⇨ §7To enable lightning when someone dies.");
            launcher.sendMessage("§c/deaths announce §4⇨ §7To enable deaths announcements.");
            launcher.sendMessage("§c/deaths build §4⇨ §7To enable block place.");
            launcher.sendMessage("§c/deaths destroy §4⇨ §7To enable block break.");
            return;
        }
    }
}