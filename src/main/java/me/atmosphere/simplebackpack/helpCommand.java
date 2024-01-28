package me.atmosphere.simplebackpack;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class helpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD + "SB Help");
            player.sendMessage(ChatColor.YELLOW + "/bphelp - for help");
            player.sendMessage(ChatColor.YELLOW  + "/bp - opens your backpack");
        } else {
            sender.sendMessage("This command can only be executed by a player.");
        }
        return true;
    }
}
