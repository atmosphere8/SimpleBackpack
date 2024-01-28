package me.atmosphere.simplebackpack;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import java.util.HashMap;

public class bpCommand implements CommandExecutor {

    private final HashMap<String, Inventory> playerBackpacks = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;


            if (!playerBackpacks.containsKey(player.getName())) {
                String customColor = ChatColor.translateAlternateColorCodes('§', "§x§1§2§3§4§5§6");
                Inventory backpack = player.getServer().createInventory(player, 9, customColor + "Backpack");
                playerBackpacks.put(player.getName(), backpack);
            }

            player.openInventory(playerBackpacks.get(player.getName()));
        } else {
            sender.sendMessage("This command can only be executed by a player.");
        }
        return true;
    }
}

