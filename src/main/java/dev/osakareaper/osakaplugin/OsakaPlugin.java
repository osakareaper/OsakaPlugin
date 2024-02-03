package dev.osakareaper.osakaplugin;

import dev.osakareaper.osakaplugin.listeners.BlockBreakListener;
import dev.osakareaper.osakaplugin.listeners.EntityListener;
import dev.osakareaper.osakaplugin.listeners.JoinListener;
import dev.osakareaper.osakaplugin.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class OsakaPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new QuitListener(), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreakListener(), this);
        Bukkit.getPluginManager().registerEvents(new EntityListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
