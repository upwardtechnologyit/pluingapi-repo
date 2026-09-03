package it.upwardtechnology.gestionale.plugin.activity;
import java.util.Collection;
import java.util.Optional;
public interface ActivityProfileRegistry { void register(ActivityProfileDefinition profile); Optional<ActivityProfileDefinition> find(String profileId); Collection<ActivityProfileDefinition> all(); default void unregisterByPluginId(String pluginId){} }
