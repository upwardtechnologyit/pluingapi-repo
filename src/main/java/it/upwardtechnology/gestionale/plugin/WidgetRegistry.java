package it.upwardtechnology.gestionale.plugin;
public interface WidgetRegistry {
    boolean register(WidgetDefinition widget);
    default boolean unregister(String widgetId) { return false; }
}
