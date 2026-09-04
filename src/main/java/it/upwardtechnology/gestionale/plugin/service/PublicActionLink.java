package it.upwardtechnology.gestionale.plugin.service;

import java.time.Instant;

/** Link pubblico restituito dal Core. Il token compare solo nell'URL, mai nel database in chiaro. */
public record PublicActionLink(
        String actionId,
        String path,
        String url,
        Instant expiresAt,
        boolean singleUse) {
}
