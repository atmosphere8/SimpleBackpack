package me.atmosphere.simplebackpack;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleBackpack extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enable");
        getCommand("bphelp").setExecutor(new helpCommand());
        getCommand("bp").setExecutor(new bpCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("Disable");
    }
}
