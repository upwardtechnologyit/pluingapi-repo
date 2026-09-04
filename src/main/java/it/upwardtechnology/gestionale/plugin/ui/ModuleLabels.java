package it.upwardtechnology.gestionale.plugin.ui;
import java.util.Map;
public record ModuleLabels(String moduleLabel,String singularLabel,String pluralLabel,String createLabel,Map<String,String> overrides) {
    public ModuleLabels { overrides=overrides==null?Map.of():Map.copyOf(overrides); }
}
