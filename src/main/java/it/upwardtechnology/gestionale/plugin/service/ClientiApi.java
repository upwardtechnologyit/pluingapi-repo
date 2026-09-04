package it.upwardtechnology.gestionale.plugin.service;

/**
 * Accesso ai clienti del Core.
 *
 * Regole anagrafiche correnti:
 * - codice fiscale / identificativo fiscale facoltativo e senza lunghezza fissa a 16 caratteri;
 * - email obbligatoria;
 * - telefono e cellulare facoltativi quando è presente l'email.
 */
public interface ClientiApi extends CrudService {

    default Constraints constraints() {
        return Constraints.DEFAULT;
    }

    record Constraints(
            boolean codiceFiscaleRequired,
            int codiceFiscaleMaxLength,
            boolean emailRequired,
            boolean telefonoRequired,
            boolean cellulareRequired
    ) {
        public static final Constraints DEFAULT = new Constraints(
                false,
                20,
                true,
                false,
                false
        );
    }
}
