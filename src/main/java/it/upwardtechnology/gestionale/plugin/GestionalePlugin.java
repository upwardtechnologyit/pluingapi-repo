package it.upwardtechnology.gestionale.plugin;

import it.upwardtechnology.gestionale.plugin.security.PermissionRegistry;

/** Main ServiceLoader contract implemented by every Upward plugin. */
public interface GestionalePlugin {
    String getId();
    String getNome();
    default String getVersion() { return "unspecified"; }
    default String getDescription() { return null; }
    default String getVendor() { return null; }
    default int getRequiredApiMajor() { return PluginApi.MAJOR_VERSION; }
    default int getMinimumApiMinor() { return 0; }

    /** Legacy registration hooks retained for binary compatibility. */
    default void registerPermissions(PermissionRegistry registry) {}
    default void registerWidgets(WidgetRegistry registry) {}

    /** New 1.0 extension entry point. Core should invoke it once during loading. */
    default void configure(PluginContext context) {
        registerPermissions(context.permissions());
        registerWidgets(context.widgets());
    }

    /** Legacy lifecycle hooks retained for already compiled plugins. */
    default void onStart() {}
    default void onStop() {}

    /** Context-aware lifecycle. Default bridges to the legacy hooks. */
    default void onStart(PluginContext context) { onStart(); }
    default void onStop(PluginContext context) { onStop(); }

    default PluginDescriptor descriptor() {
        return new PluginDescriptor(getId(), getNome(), getVersion(), getDescription(), getVendor(),
                getRequiredApiMajor(), getMinimumApiMinor(), java.util.List.of());
    }
}
