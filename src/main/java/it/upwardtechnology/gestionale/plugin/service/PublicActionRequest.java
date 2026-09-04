package it.upwardtechnology.gestionale.plugin.service;

import it.upwardtechnology.gestionale.plugin.route.HttpMethod;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Richiesta di creazione di un link pubblico temporaneo verso una route del plugin.
 * Il Core vincola il token al plugin chiamante e alla route indicata.
 */
public record PublicActionRequest(
        String actionType,
        String routePath,
        Set<HttpMethod> allowedMethods,
        Instant expiresAt,
        boolean singleUse,
        Map<String, Object> metadata) {

    public PublicActionRequest {
        allowedMethods = allowedMethods == null ? Set.of() : Set.copyOf(allowedMethods);
        metadata = metadata == null ? Map.of() : Map.copyOf(new LinkedHashMap<>(metadata));
    }
}
