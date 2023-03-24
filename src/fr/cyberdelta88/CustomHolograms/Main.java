package fr.cyberdelta88.CustomHolograms;

import fr.cyberdelta88.CustomHolograms.commands.Cmdcustomhologram;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("CustomHolograms plugin is started");
        this.getCommand("customhologram").setExecutor(new Cmdcustomhologram());
    }

    @Override
    public void onDisable() {
        System.out.println("CustomHolograms plugin is stoped");
    }
}
