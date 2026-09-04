package it.upwardtechnology.gestionale.plugin;

import it.upwardtechnology.gestionale.plugin.activity.ActivityProfileRegistry;
import it.upwardtechnology.gestionale.plugin.agenda.AgendaProfileRegistry;
import it.upwardtechnology.gestionale.plugin.capability.CapabilityRegistry;
import it.upwardtechnology.gestionale.plugin.data.PluginConfig;
import it.upwardtechnology.gestionale.plugin.data.PluginDatabase;
import it.upwardtechnology.gestionale.plugin.data.PluginMigrationRegistry;
import it.upwardtechnology.gestionale.plugin.data.PluginStorage;
import it.upwardtechnology.gestionale.plugin.event.EventBus;
import it.upwardtechnology.gestionale.plugin.route.RouteRegistry;
import it.upwardtechnology.gestionale.plugin.security.PermissionRegistry;
import it.upwardtechnology.gestionale.plugin.security.SecurityContext;
import it.upwardtechnology.gestionale.plugin.service.CoreServices;
import it.upwardtechnology.gestionale.plugin.ui.ModuleExtensionRegistry;
import it.upwardtechnology.gestionale.plugin.ui.NavigationRegistry;

/** All public services exposed by the Upward Core to a plugin. */
public interface PluginContext {
    PluginDescriptor plugin();
    CoreServices services();
    SecurityContext security();
    PermissionRegistry permissions();
    WidgetRegistry widgets();
    NavigationRegistry navigation();
    ModuleExtensionRegistry extensions();
    RouteRegistry routes();
    EventBus events();
    AgendaProfileRegistry agendaProfiles();
    ActivityProfileRegistry activityProfiles();
    PluginConfig config();
    PluginStorage storage();
    PluginMigrationRegistry migrations();
    PluginDatabase database();
    CapabilityRegistry capabilities();
}
