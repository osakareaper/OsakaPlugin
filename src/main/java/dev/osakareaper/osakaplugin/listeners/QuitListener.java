package dev.osakareaper.osakaplugin.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Server server = Bukkit.getServer();

        // Remove mensagem padrão de saída
        event.quitMessage(null);

        // Mensagem de saída (global)
        server.sendMessage(Component.text()
                .append(Component.text("Já vai tarde,").color(TextColor.color(255, 0, 0)))
                .append(Component.text(" " + player.getName() + " ").color(TextColor.color(255, 200, 0)))
                .append(Component.text("! >:)").color(TextColor.color(255, 0, 0)))
        );
    }

}
