package jp.nrsy.mc.nervous.listeners.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import jp.nrsy.mc.nervous.helpers.MessageHelper;

public class ManageCommandListener implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(!(sender instanceof Player)) {
      sender.sendMessage(MessageHelper.formatLog("ゲーム内から実行してください。"));
      return true;
    }

    Player player = (Player) sender;

    if (args.length == 0) {
      MessageHelper.alert(player,  "コマンド引数が指定されていません。");
      return true;
    }

    return false;
  }

}
