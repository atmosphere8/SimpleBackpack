package me.atmosphere.sbackpack;

import org.bukkit.plugin.java.JavaPlugin;

public final class SBackpack extends JavaPlugin {

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
