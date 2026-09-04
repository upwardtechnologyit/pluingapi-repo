package it.upwardtechnology.gestionale.plugin.data;
import java.util.Map;
import java.util.Optional;
public interface PluginConfig {
    Optional<String> get(String key);
    Map<String,String> all();
    void set(String key,String value);
    void remove(String key);
}
