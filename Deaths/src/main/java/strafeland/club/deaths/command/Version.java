package strafeland.club.deaths.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Version implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            this.manageCommand((Player) commandSender, args);
        } else {
            commandSender.sendMessage("§c§lDEATHS §8| §7Version: §e1.0");
        }
        return true;
    }

    private void manageCommand(Player launcher, String[] args) {
        if (args.length == 0) {
            launcher.sendMessage("§c§lDEATHS §8| §7Version: §e1.0");
        }
    }

}
