package jp.nrsy.mc.nervous;

import org.bukkit.plugin.java.JavaPlugin;

import jp.nrsy.mc.nervous.listeners.commands.ManageCommandListener;
import jp.nrsy.mc.nervous.listeners.events.AutoMinecartSpawner;
import jp.nrsy.mc.nervous.listeners.events.CommandUseListener;
import jp.nrsy.mc.nervous.listeners.events.ConnectionListener;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("nv").setExecutor(new ManageCommandListener());

    getServer().getPluginManager().registerEvents(new ConnectionListener(), this);
    getServer().getPluginManager().registerEvents(new CommandUseListener(), this);

    getServer().getPluginManager().registerEvents(new AutoMinecartSpawner(), this);

    getLogger().info("Nervousが読み込まれました");
  }

  @Override
  public void onDisable() {
    getLogger().info("Nervousが停止されました");
   }
}
