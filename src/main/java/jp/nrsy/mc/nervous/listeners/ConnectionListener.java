package jp.nrsy.mc.nervous.listeners;

import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import jp.nrsy.mc.nervous.helpers.MessageHelper;

public class ConnectionListener implements Listener {

  @EventHandler
  public void onPlayerLogin(PlayerLoginEvent event) {
    MessageHelper.log(event.getPlayer().getName() + " が接続試行中です。\n" + "IPアドレス: " + event.getAddress().getHostAddress(), Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    MessageHelper.log(event.getPlayer().getName() + " が接続しました。", Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
  }
}
