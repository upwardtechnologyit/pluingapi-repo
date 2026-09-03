package it.upwardtechnology.gestionale.plugin.security;
import java.util.Set;
public record PluginPrincipal(long userId, String username, boolean administrator, Set<String> permissions) {
    public PluginPrincipal { permissions = permissions == null ? Set.of() : Set.copyOf(permissions); }
    public boolean hasPermission(String key) { return administrator || permissions.contains(key); }
}
