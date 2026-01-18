<p align="center">
  <img src=".github/logo.jpeg" alt="ServerTweaks" width="128">
</p>

# ServerTweaks

A modular Paper plugin providing server utilities and tweaks for Minecraft servers.

## Features

### Spawn on Join

Teleports players to configured coordinates when they join the server. Useful for lobby servers or controlled spawn areas.

- Configurable X, Y, Z coordinates
- Configurable yaw and pitch (player rotation)
- Can be enabled/disabled independently

## Installation

### Download

- **Latest Release**: https://s3.psalkowski.pl/minecraft-plugins/server-tweaks/ServerTweaks.jar
- **Snapshot (dev)**: https://s3.psalkowski.pl/minecraft-plugins/server-tweaks/ServerTweaks-X.Y.Z-SNAPSHOT.jar

### Steps

1. Download `ServerTweaks.jar`
2. Place in your server's `plugins/` folder
3. Restart the server
4. Edit `plugins/ServerTweaks/config.yml` to configure features
5. Restart or reload the server

## Configuration

### config.yml

```yaml
spawn-on-join:
  enabled: false    # Enable/disable spawn-on-join
  x: 0              # X coordinate
  y: 1              # Y coordinate
  z: 0              # Z coordinate
  yaw: 0            # Player rotation (horizontal)
  pitch: 0          # Player rotation (vertical)
```

## Compatibility

| Plugin Version | Minecraft | Paper | Java |
|----------------|-----------|-------|------|
| 1.1.x          | 1.21.11   | 1.21  | 21+  |
| 1.0.x          | 1.21.11   | 1.21  | 21+  |

**Server Software**: Paper or Paper-based forks (Purpur, Pufferfish, etc.)

## Building from Source

```bash
mvn clean package
```

Output: `target/ServerTweaks-<version>.jar`

## CI/CD

Builds are automated via Woodpecker CI:
- **Push to main**: Builds and uploads `ServerTweaks-X.Y.Z-SNAPSHOT.jar`
- **Tag `vX.Y.Z`**: Builds release, uploads `ServerTweaks.jar` (latest) and `ServerTweaks-X.Y.Z.jar` (versioned), then bumps version

## License

MIT
