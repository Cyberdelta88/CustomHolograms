package fr.cyberdelta88.CustomHolograms.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Cmdcustomhologram implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length >= 1) {
                ArmorStand as1 = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                as1.setCustomName(args[0]);
                as1.setCustomNameVisible(true);
                as1.setGravity(false);
                as1.setVisible(false);

                if (args.length >= 2) {
                    ArmorStand as2 = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    as2.setCustomName(args[1]);
                    as2.setCustomNameVisible(true);
                    as2.setGravity(false);
                    as2.setVisible(false);

                    if (args.length >= 3) {
                        ArmorStand as3 = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                        as3.setCustomName(args[2]);
                        as3.setCustomNameVisible(true);
                        as3.setGravity(false);
                        as3.setVisible(false);

                        if (args.length >= 4) {
                            ArmorStand as4 = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                            as4.setCustomName(args[3]);
                            as4.setCustomNameVisible(true);
                            as4.setGravity(false);
                            as4.setVisible(false);
                        }
                    }
                }

                p.sendMessage(ChatColor.LIGHT_PURPLE + "Your hologram was successfully generated");

            } else {
                p.sendMessage(ChatColor.DARK_RED + "/" + label + " (first line) (second line) (third line) (fourth line)");
            }
        }


        return false;
    }
}
