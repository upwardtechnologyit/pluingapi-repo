package it.upwardtechnology.gestionale.plugin.service;

import it.upwardtechnology.gestionale.plugin.agenda.AgendaApi;

public interface CoreServices {
    AziendaApi azienda();
    ClientiApi clienti();
    ContattiApi contatti();
    PreventiviApi preventivi();
    FattureApi fatture();
    PagamentiApi pagamenti();
    DocumentiApi documenti();
    AllegatiApi allegati();
    EmailApi email();
    NotificationsApi notifications();
    AgendaApi agenda();
    CrudService attivita();
    UtentiApi utenti();
    RuoliApi ruoli();
    PermessiApi permessi();
    SearchApi search();
    AuditApi audit();
    default PublicActionApi publicActions() {
        throw new UnsupportedOperationException("PublicActionApi richiede Upward Plugin API 1.1+");
    }
}
