package it.upwardtechnology.gestionale.plugin.ui;
public interface ModuleExtensionRegistry { void register(ModuleExtension extension); default void unregisterByPluginId(String pluginId){} }
