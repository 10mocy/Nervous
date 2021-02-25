package jp.nrsy.mc.nervous.listeners.events;

import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import jp.nrsy.mc.nervous.helpers.MessageHelper;

public class ConnectionListener implements Listener {

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    MessageHelper.log(event.getPlayer().getName() + " が接続しました。", Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
  }

}
