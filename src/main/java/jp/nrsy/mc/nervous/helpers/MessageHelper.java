package jp.nrsy.mc.nervous.helpers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

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

  public static void alert(CommandSender sender, String msg) {
    sender.sendMessage(formatAlert(msg));
  }

  public static void info(CommandSender sender, String msg) {
    sender.sendMessage(formatInfo(msg));
  }

  public static void success(CommandSender sender, String msg) {
    sender.sendMessage(formatSuccess(msg));
  }

  public static void log(CommandSender sender, String msg) {
    sender.sendMessage(formatLog(msg));
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

  private static String formatLog(String msg) {
    return ChatColor.GOLD + "*" + ChatColor.GRAY + " > " + msg;
  }
}
