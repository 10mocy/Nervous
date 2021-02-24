package jp.nrsy.mc.nervous;

import org.bukkit.plugin.java.JavaPlugin;

import jp.nrsy.mc.nervous.listeners.ConnectionListener;
import jp.nrsy.mc.nervous.listeners.ManageCommandListener;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("nv").setExecutor(new ManageCommandListener());

    getServer().getPluginManager().registerEvents(new ConnectionListener(), this);

    getLogger().info("Nervousが読み込まれました");
  }

  @Override
  public void onDisable() {
    getLogger().info("Nervousが停止されました");
   }
}
