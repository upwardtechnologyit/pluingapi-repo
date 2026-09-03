package it.upwardtechnology.gestionale.plugin.data;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
public interface PluginStorage {
    void write(String relativePath,InputStream data);
    Optional<InputStream> read(String relativePath);
    boolean delete(String relativePath);
    List<String> list(String relativeDirectory);
}
