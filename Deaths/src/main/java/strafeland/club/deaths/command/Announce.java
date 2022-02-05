package strafeland.club.deaths.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Announce implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            this.manageCommand((Player) commandSender, args);
        } else {
            commandSender.sendMessage("§c§lDEATHS §8| La consola no puede ejecutar este comando.");
        }
        return true;
    }


    private void manageCommand(Player launcher, String[] args) {
        if (args.length == 0) {
            launcher.sendMessage("§c§lDEATHS §8| §6Oye dime que opcion quieres:");
            launcher.sendMessage("§7/announce on");
            launcher.sendMessage("§7/announce off");
            return;
        } else {
            if (args[0].equalsIgnoreCase("on")) {
                launcher.sendMessage("§c§lDEATHS §8| §aNow deaths announcements are enable.");
                return;
            }
            if (args[0].equalsIgnoreCase("off")) {
                launcher.sendMessage("§c§lDEATHS §8| §4Now deaths announcements are disabled.");
                return;
            }
        }
    }
}