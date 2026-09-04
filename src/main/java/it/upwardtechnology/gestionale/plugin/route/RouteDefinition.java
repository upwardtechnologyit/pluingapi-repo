package it.upwardtechnology.gestionale.plugin.route;
import java.util.Set;
public record RouteDefinition(String pluginId, HttpMethod method, String path, Set<String> requiredPermissions,
                              CsrfPolicy csrfPolicy, PluginRouteHandler handler) {
    public RouteDefinition {
        if(pluginId==null||pluginId.isBlank()) throw new IllegalArgumentException("pluginId required");
        if(method==null||handler==null) throw new IllegalArgumentException("method/handler required");
        if(path==null||path.isBlank()||!path.startsWith("/")) throw new IllegalArgumentException("path must start with /");
        requiredPermissions=requiredPermissions==null?Set.of():Set.copyOf(requiredPermissions);
        csrfPolicy=csrfPolicy==null?CsrfPolicy.REQUIRED:csrfPolicy;
        if(method==HttpMethod.GET && csrfPolicy==CsrfPolicy.REQUIRED) csrfPolicy=CsrfPolicy.NOT_REQUIRED;
    }
}
