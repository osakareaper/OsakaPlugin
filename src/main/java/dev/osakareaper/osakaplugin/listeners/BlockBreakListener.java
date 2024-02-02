package dev.osakareaper.osakaplugin.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
    private int grassBlocks = 0;

    @EventHandler
    public void onGrassBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();

        if (event.getBlock().getType() == Material.GRASS_BLOCK) {
            grassBlocks++;
            player.sendMessage(Component.text("Você quebrou " + grassBlocks + " blocos de grama."));
        }
    }
}
