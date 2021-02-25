package jp.nrsy.mc.nervous.listeners.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import jp.nrsy.mc.nervous.helpers.MessageHelper;

public class ManageCommandListener implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (args.length == 0) {
      MessageHelper.alert(sender, "コマンド引数が指定されていません。");
      return true;
    }

    return false;
  }

}
