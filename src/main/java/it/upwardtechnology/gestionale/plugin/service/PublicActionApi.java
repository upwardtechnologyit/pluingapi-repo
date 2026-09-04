package it.upwardtechnology.gestionale.plugin.service;

/**
 * Capability Core per creare/revocare azioni pubbliche tokenizzate.
 * Esempi: firma remota, conferma esterna, approvazione cliente.
 */
public interface PublicActionApi {
    PublicActionLink create(PublicActionRequest request);
    void revoke(String actionId);
}
