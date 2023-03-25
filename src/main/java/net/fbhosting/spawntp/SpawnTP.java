package net.fbhosting.spawntp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.fbhosting.spawntp.commands.SetSpawnCommand;
import net.fbhosting.spawntp.commands.SpawnCommand;

@Slf4j
public final class SpawnTP extends JavaPlugin implements Listener {
  @Getter
  private static SpawnTP instance;

  @Override
  public void onEnable() {
    instance = this; // NOSONAR - intended
    
    // load default configuration
    saveDefaultConfig();

    // register commands
    getCommand("spawn").setPermission("spawntp.teleport");
    getCommand("spawn").setExecutor(new SpawnCommand());
    
    getCommand("setspawn").setPermission("spawntp.admin");
    getCommand("setspawn").setExecutor(new SetSpawnCommand());
  }

  @Override
  public void onDisable() {
    log.info("Plugin disabled.");
  }
} 