package dev.osakareaper.osakaplugin.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Server server = Bukkit.getServer();

        // Remove mensagem padrão de entrada
        event.joinMessage(null);

        // Mensagem de entrada (global)
        server.sendMessage(Component.text()
                .append(Component.text("Ei").color(TextColor.color(120, 0, 200)))
                .append(Component.text(" " + player.getName() + ",").color(TextColor.color(255, 200, 0)))
                .append(Component.text(" vai se foder! -.-'").color(TextColor.color(120, 0, 200)))
        );
    }


}
