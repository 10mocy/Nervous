package jp.nrsy.mc.nervous.listeners.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Minecart;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.inventory.EquipmentSlot;

public class AutoMinecartSpawner implements Listener {

  @EventHandler
  public void onInteractEvent(PlayerInteractEvent event) {
    if(event.getHand() != EquipmentSlot.HAND) return;
    if(event.getClickedBlock().getType() != Material.RAILS && event.getClickedBlock().getType() != Material.POWERED_RAIL ) return;
    if(event.getAction() != Action.RIGHT_CLICK_BLOCK) return;

    Location loc = event.getClickedBlock().getLocation().add(0, 1, 0);
    event.getClickedBlock().getWorld().spawn(loc, Minecart.class);
  }

  @EventHandler
  public void onLeaveEvent(VehicleExitEvent event) {
    if(event.getVehicle().getType() != EntityType.MINECART) return;
    event.getVehicle().remove();
  }
}
