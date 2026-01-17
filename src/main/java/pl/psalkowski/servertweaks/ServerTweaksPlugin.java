package pl.psalkowski.servertweaks;

import org.bukkit.plugin.java.JavaPlugin;
import pl.psalkowski.servertweaks.feature.SpawnOnJoinFeature;

public class ServerTweaksPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        if (getConfig().getBoolean("spawn-on-join.enabled", false)) {
            new SpawnOnJoinFeature(this).register();
            getLogger().info("Feature enabled: spawn-on-join");
        }

        getLogger().info("ServerTweaks enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerTweaks disabled!");
    }
}
