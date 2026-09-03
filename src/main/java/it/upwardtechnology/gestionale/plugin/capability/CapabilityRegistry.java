package it.upwardtechnology.gestionale.plugin.capability;
import java.util.Optional;
/** Escape hatch for additive 1.x capabilities without breaking PluginContext. */
public interface CapabilityRegistry {
    <T> Optional<T> find(String capabilityId, Class<T> type);
    default boolean isAvailable(String capabilityId) { return find(capabilityId, Object.class).isPresent(); }
}
