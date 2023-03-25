package net.fbhosting.spawntp;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class SpawnTP extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    // load default configuration
    saveDefaultConfig();

    // register commands
  }

  @Override
  public void onDisable() {
    log.info("Plugin disabled.");
  }
} 