package it.upwardtechnology.gestionale.plugin;
/** Dashboard widget contract. Kept source/binary compatible with the pre-1.0 API. */
public interface WidgetDefinition {
    String getId();
    String getTitolo();
    String getDescrizione();
    int getOrdine();
    String getPermesso();
    String getPluginId();
}
