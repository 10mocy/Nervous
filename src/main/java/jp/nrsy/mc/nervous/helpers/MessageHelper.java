package jp.nrsy.mc.nervous.helpers;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageHelper {

  public static void alert(String msg, String permission) {
    Bukkit.broadcast(formatAlert(msg), permission);
  }

  public static void info(String msg, String permission) {
    Bukkit.broadcast(formatInfo(msg), permission);
  }

  public static void success(String msg, String permission) {
    Bukkit.broadcast(formatSuccess(msg), permission);
  }

  public static void log(String msg, String permission) {
    Bukkit.broadcast(formatLog(msg), permission);
  }

  public static void alert(Player player, String msg) {
    player.sendMessage(formatAlert(msg));
  }

  public static void info(Player player, String msg) {
    player.sendMessage(formatInfo(msg));
  }

  public static void success(Player player, String msg) {
    player.sendMessage(formatSuccess(msg));
  }

  public static void log(Player player, String msg) {
    player.sendMessage(formatLog(msg));
  }

  public static void alert(UUID uuid, String msg) {

  }

  public static void info(UUID uuid, String msg) {

  }

  public static void success(UUID uuid, String msg) {

  }

  public static void log(UUID uuid, String msg) {

  }

  public static String formatLog(String msg) {
    return ChatColor.GOLD + "*" + ChatColor.GRAY + " > " + msg;
  }

  private static String formatAlert(String msg) {
    return ChatColor.RED + "* ! > " + msg;
  }

  private static String formatInfo(String msg) {
    return ChatColor.AQUA + "* i > " + msg;
  }

  private static String formatSuccess(String msg) {
    return ChatColor.GREEN + "* > " + msg;
  }


}
