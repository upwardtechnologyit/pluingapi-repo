package it.upwardtechnology.gestionale.plugin.reference;
import it.upwardtechnology.gestionale.plugin.WidgetDefinition;
public final class ReferenceWidget implements WidgetDefinition {
    public String getId(){return "reference.widget";} public String getTitolo(){return "Reference Plugin";} public String getDescrizione(){return "Widget di verifica Plugin API 1.0";} public int getOrdine(){return 900;} public String getPermesso(){return "reference.visualizza";} public String getPluginId(){return "reference";}
}
