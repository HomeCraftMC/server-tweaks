package pl.psalkowski.servertweaks.feature;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.psalkowski.servertweaks.ServerTweaksPlugin;

public class SpawnOnJoinFeature implements Listener {

    private final ServerTweaksPlugin plugin;
    private final double x;
    private final double y;
    private final double z;
    private final float yaw;
    private final float pitch;

    public SpawnOnJoinFeature(ServerTweaksPlugin plugin) {
        this.plugin = plugin;
        this.x = plugin.getConfig().getDouble("spawn-on-join.x", 0);
        this.y = plugin.getConfig().getDouble("spawn-on-join.y", 1);
        this.z = plugin.getConfig().getDouble("spawn-on-join.z", 0);
        this.yaw = (float) plugin.getConfig().getDouble("spawn-on-join.yaw", 0);
        this.pitch = (float) plugin.getConfig().getDouble("spawn-on-join.pitch", 0);
    }

    public void register() {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        Location spawnLocation = new Location(world, x, y, z, yaw, pitch);
        player.teleport(spawnLocation);
    }
}
