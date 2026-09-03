package it.upwardtechnology.gestionale.plugin.agenda;
import it.upwardtechnology.gestionale.plugin.ui.*;
import it.upwardtechnology.gestionale.plugin.workflow.WorkflowDefinition;
import java.util.List;
import java.util.Map;
import java.util.Set;
/** Defines a vertical agenda such as core.default, giardinieri.lavori or ordini. */
public record AgendaProfileDefinition(String id,String pluginId,String label,String singularLabel,String createLabel,String icon,
                                      WorkflowDefinition workflow,List<ExtensionField> fields,List<ExtensionAction> actions,
                                      Set<String> viewPermissions,Set<String> managePermissions,Map<String,Object> metadata) {
    public AgendaProfileDefinition { if(id==null||id.isBlank()||pluginId==null||pluginId.isBlank()||label==null||label.isBlank())throw new IllegalArgumentException("agenda profile id/plugin/label required"); singularLabel=singularLabel==null?label:singularLabel; createLabel=createLabel==null?"Nuovo "+singularLabel:createLabel; fields=fields==null?List.of():List.copyOf(fields); actions=actions==null?List.of():List.copyOf(actions); viewPermissions=viewPermissions==null?Set.of():Set.copyOf(viewPermissions); managePermissions=managePermissions==null?Set.of():Set.copyOf(managePermissions); metadata=metadata==null?Map.of():Map.copyOf(metadata); }
}
