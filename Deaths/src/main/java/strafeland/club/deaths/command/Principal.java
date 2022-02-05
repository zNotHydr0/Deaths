package strafeland.club.deaths.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import strafeland.club.deaths.Main;

public class Principal implements CommandExecutor {
    private Main plugin;

    public Principal(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage("No puedes ejecutar comandos desde la consola");
            return false;
        } else {
            Player jugador = (Player) sender;
            // /deaths (0 args)
            // /deaths hola (1 args)
            // /deaths hola de nuevo (3 args)
            if (args.length > 0) {
                // /deaths spawn
                if (args[0].equalsIgnoreCase("version")) {
                    jugador.sendMessage("La version es 1.0");
                    return true;
                }
            } else if (args[0].equalsIgnoreCase("reload")) {
                // /deaths reload
                plugin.reloadConfig();
                jugador.sendMessage("Reload UwU");
                return true;
            }
        } return true;
    }
}