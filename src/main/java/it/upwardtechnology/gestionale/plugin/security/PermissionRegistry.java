package it.upwardtechnology.gestionale.plugin.security;
import it.upwardtechnology.gestionale.plugin.PermissionDefinition;
import java.sql.SQLException;
public interface PermissionRegistry {
    boolean register(PermissionDefinition definition);
    default int deleteByPluginId(String pluginId) throws SQLException { return 0; }
}
