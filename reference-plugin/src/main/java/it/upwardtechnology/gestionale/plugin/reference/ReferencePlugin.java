package it.upwardtechnology.gestionale.plugin.reference;
import it.upwardtechnology.gestionale.plugin.*;
import it.upwardtechnology.gestionale.plugin.agenda.*;
import it.upwardtechnology.gestionale.plugin.security.PermissionRegistry;
import it.upwardtechnology.gestionale.plugin.ui.*;
import it.upwardtechnology.gestionale.plugin.workflow.*;
import java.util.*;
public final class ReferencePlugin implements GestionalePlugin {
    public String getId(){return "reference";} public String getNome(){return "Upward Reference Plugin";} public String getVersion(){return "1.0.0";} public String getDescription(){return "Plugin di collaudo della Plugin API 1.0";}
    @Override public void registerPermissions(PermissionRegistry r){ r.register(new PermissionDefinition("reference.visualizza","Visualizza Reference","Accesso al plugin reference","reference",false,"reference")); r.register(new PermissionDefinition("reference.lavori.manage","Gestisci lavori","Gestione Agenda Lavori","reference",false,"reference")); }
    @Override public void registerWidgets(WidgetRegistry r){ r.register(new ReferenceWidget()); }
    @Override public void configure(PluginContext c){
        GestionalePlugin.super.configure(c);
        var wf=new WorkflowDefinition("reference.lavoro", List.of(
            new WorkflowStateDefinition("programmato","Programmato",true,false,"calendar"),
            new WorkflowStateDefinition("in_corso","In corso",false,false,"play"),
            new WorkflowStateDefinition("completato","Completato",false,true,"check")
        ), List.of(
            new WorkflowTransitionDefinition("avvia","programmato","in_corso","Avvia",Set.of("reference.lavori.manage")),
            new WorkflowTransitionDefinition("completa","in_corso","completato","Completa",Set.of("reference.lavori.manage"))
        ));
        c.agendaProfiles().register(new AgendaProfileDefinition("reference.lavori","reference","Lavori","Lavoro","Nuovo lavoro","briefcase",wf,
            List.of(new ExtensionField("cliente_note","Note lavoro",ExtensionField.FieldType.TEXTAREA,false,10,List.of(),null)),
            List.of(),Set.of("reference.visualizza"),Set.of("reference.lavori.manage"),Map.of()));
        c.navigation().register(new NavigationItem("reference.lavori","reference","Reference","Lavori","/plugins/reference/lavori","briefcase",100,Set.of("reference.visualizza")));
    }
}
