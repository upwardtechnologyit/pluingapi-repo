package it.upwardtechnology.gestionale.plugin.route;
public interface RouteRegistry {
    void register(RouteDefinition route);
    default void unregisterByPluginId(String pluginId) {}
}
