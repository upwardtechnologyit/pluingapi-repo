package it.upwardtechnology.gestionale.plugin.agenda;
import java.util.Collection;
import java.util.Optional;
public interface AgendaProfileRegistry {
    void register(AgendaProfileDefinition profile);
    Optional<AgendaProfileDefinition> find(String profileId);
    Collection<AgendaProfileDefinition> all();
    default void unregisterByPluginId(String pluginId){}
}
