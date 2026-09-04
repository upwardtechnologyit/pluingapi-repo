package it.upwardtechnology.gestionale.plugin.ui;
public interface NavigationRegistry { void register(NavigationItem item); default void unregisterByPluginId(String pluginId){} }
