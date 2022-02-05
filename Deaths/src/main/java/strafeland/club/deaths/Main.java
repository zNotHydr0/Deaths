package strafeland.club.deaths;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import strafeland.club.deaths.command.*;
import strafeland.club.deaths.listeners.EventManager;

import java.io.File;

public class Main extends JavaPlugin {

    public String rutaConfig;

    @Override
    public void onEnable() {
        super.onEnable();
        System.out.println("[DEATHS]: Plugin habilitado");
        this.initCommand();
        this.initEvents();
        getServer().getPluginManager().registerEvents(new EventManager(), this);
        registerConfig();
    }

    private void initCommand() {
        getCommand("thunder").setExecutor(new Thunder());
        getCommand("deaths").setExecutor(new Help());
        getCommand("place").setExecutor(new Place());
        getCommand("break").setExecutor(new Break());
        getCommand("version").setExecutor(new Version());
    }

    private void initEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EventManager(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        System.out.println("[DEATHS]: Plugin desactivado");
    }

    public void registerConfig(){
        File config = new File(this.getDataFolder(),"config.yml");
        rutaConfig = config.getPath();
        if(!config.exists()){
            this.getConfig().options().copyDefaults(true);
            saveConfig();
        }
    }
}
