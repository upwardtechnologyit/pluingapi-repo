package it.upwardtechnology.gestionale.plugin;

import java.util.List;
import java.util.Objects;

/** Immutable public metadata for a plugin. */
public record PluginDescriptor(
        String id,
        String name,
        String version,
        String description,
        String vendor,
        int requiredApiMajor,
        int minimumApiMinor,
        List<String> dependencies
) {
    public PluginDescriptor {
        id = require(id, "id");
        name = require(name, "name");
        version = require(version, "version");
        description = normalize(description);
        vendor = normalize(vendor);
        dependencies = dependencies == null ? List.of() : List.copyOf(dependencies);
        if (requiredApiMajor < 1 || minimumApiMinor < 0) {
            throw new IllegalArgumentException("Invalid API requirement.");
        }
    }

    public PluginDescriptor(String id, String name, String version) {
        this(id, name, version, null, null, PluginApi.MAJOR_VERSION, 0, List.of());
    }

    private static String require(String value, String field) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(field + " cannot be blank.");
        return value.trim();
    }
    private static String normalize(String value) {
        return value == null || value.isBlank() ? null : value.trim();
    }
}
