package dev.osakareaper.osakaplugin.listeners;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class EntityListener implements Listener {
    @EventHandler
    public void onEntityRightClick(PlayerInteractEntityEvent event) {

        if (event.getRightClicked().getType() == EntityType.CHICKEN) {
            Chicken chicken = (Chicken) event.getRightClicked();

            chicken.getWorld().createExplosion(chicken.getLocation(), 5F);
        }
    }
}
