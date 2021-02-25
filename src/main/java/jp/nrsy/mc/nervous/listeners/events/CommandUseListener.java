package jp.nrsy.mc.nervous.listeners.events;

import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import jp.nrsy.mc.nervous.helpers.MessageHelper;

public class CommandUseListener implements Listener {

  @EventHandler
  public void onEvent(PlayerCommandPreprocessEvent event) {
    MessageHelper.log(event.getPlayer().getName() + ": /" + event.getMessage() , Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
  }

}
