package it.upwardtechnology.gestionale.plugin.security;
import java.util.Optional;
public interface SecurityContext {
    Optional<PluginPrincipal> currentUser();
    boolean hasPermission(String permissionKey);
    void requirePermission(String permissionKey) throws SecurityException;
}
