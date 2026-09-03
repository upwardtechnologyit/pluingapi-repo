package it.upwardtechnology.gestionale.plugin.activity;
import it.upwardtechnology.gestionale.plugin.ui.ExtensionAction;
import it.upwardtechnology.gestionale.plugin.ui.ExtensionField;
import it.upwardtechnology.gestionale.plugin.workflow.WorkflowDefinition;
import java.util.List;
import java.util.Map;
public record ActivityProfileDefinition(String id,String pluginId,String label,String singularLabel,String createLabel,String icon,
                                        WorkflowDefinition workflow,List<ExtensionField> fields,List<ExtensionAction> actions,Map<String,Object> metadata) {
    public ActivityProfileDefinition { if(id==null||id.isBlank()||pluginId==null||pluginId.isBlank()||label==null||label.isBlank())throw new IllegalArgumentException("activity profile fields required"); singularLabel=singularLabel==null?label:singularLabel; createLabel=createLabel==null?"Nuova "+singularLabel:createLabel; fields=fields==null?List.of():List.copyOf(fields); actions=actions==null?List.of():List.copyOf(actions); metadata=metadata==null?Map.of():Map.copyOf(metadata); }
}
