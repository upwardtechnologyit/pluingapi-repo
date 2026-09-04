# Contratto Plugin API 1.1.1

Il Core espone motori e servizi; i plugin possono usarli, estenderli e creare moduli verticali senza importare classi interne.

## Extension model

Un plugin puo:
- creare nuove route e pagine;
- aggiungere menu, tab, campi, azioni e viste a un modulo Core;
- creare profili Agenda indipendenti con terminologia e workflow propri;
- creare profili Attivita;
- leggere/modificare entita Core tramite `CoreServices`;
- pubblicare/ascoltare eventi;
- registrare permessi e widget;
- mantenere configurazione, storage, migrazioni e dati plugin.

## Agenda Engine

Il Core mantiene `core.default`; i plugin possono aggiungere `giardinieri.lavori`, `ordini`, `noleggi`, ecc. Ogni profilo ha campi, azioni e workflow separati ma condivide calendario, assegnatari, notifiche, audit e visibilita.

L'assegnazione supporta USER e TEAM. La visibilita e modellata come OWN / TEAM / ALL e deve sempre essere verificata dal runtime Core.

## Regola di sicurezza

"Tutto estendibile" non significa "segreti esposti". Password DB/SMTP, Stripe secret, chiavi di cifratura, session internals, filtri di sicurezza e QueryManager non fanno parte dell'API.


## ClientiApi 1.1.1

Regole anagrafiche esposte ai plugin tramite `ClientiApi.constraints()`:
- codice fiscale / identificativo fiscale facoltativo;
- lunghezza massima 20 caratteri, senza vincolo fisso a 16;
- email obbligatoria;
- telefono facoltativo;
- cellulare facoltativo.

I record cliente espongono inoltre partita IVA, codice fiscale, codice SDI e PEC.

## Email e Public Actions

La serie 1.1 espone `EmailApi` e `PublicActionApi` per flussi esterni sicuri e riutilizzabili dai plugin.
