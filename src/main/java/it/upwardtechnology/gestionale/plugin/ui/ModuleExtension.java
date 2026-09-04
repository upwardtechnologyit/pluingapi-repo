package it.upwardtechnology.gestionale.plugin.ui;
import java.util.List;
import java.util.Map;
public record ModuleExtension(String id,String pluginId,String targetModule,ModuleLabels labels,
                              List<ExtensionField> fields,List<ExtensionAction> actions,List<ExtensionTab> tabs,
                              List<ExtensionView> views,Map<String,Object> metadata) {
    public ModuleExtension { if(id==null||id.isBlank()||pluginId==null||pluginId.isBlank()||targetModule==null||targetModule.isBlank())throw new IllegalArgumentException("extension id/plugin/target required"); fields=fields==null?List.of():List.copyOf(fields); actions=actions==null?List.of():List.copyOf(actions); tabs=tabs==null?List.of():List.copyOf(tabs); views=views==null?List.of():List.copyOf(views); metadata=metadata==null?Map.of():Map.copyOf(metadata); }
}
