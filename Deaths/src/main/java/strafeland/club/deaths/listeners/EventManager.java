package strafeland.club.deaths.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventManager implements Listener {

    @EventHandler
    public void onBlock(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("virtual.break")) {
            player.sendMessage(ChatColor.RED + "§lHey! " + ChatColor.GRAY + "You can't break that block here.");
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlock(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("virtual.place")) {
            player.sendMessage(ChatColor.RED + "§lHey! " + ChatColor.GRAY + "You can't place that block here.");
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Player killer = event.getEntity().getKiller();
        event.setDeathMessage(ChatColor.DARK_RED + "§c§lDEATHS §8| " + player.getDisplayName() + ChatColor.RED +
                " has killed by " + ChatColor.GREEN + killer.getDisplayName());

    }
}
