package it.upwardtechnology.gestionale.plugin.ui;
import java.util.List;
public record ExtensionField(String id,String label,FieldType type,boolean required,int order,List<Option> options,String helpText) {
    public enum FieldType { TEXT, TEXTAREA, NUMBER, DECIMAL, DATE, DATETIME, TIME, BOOLEAN, SELECT, MULTISELECT, ENTITY, FILE }
    public record Option(String value,String label){}
    public ExtensionField { if(id==null||id.isBlank()||label==null||label.isBlank()||type==null)throw new IllegalArgumentException("field id/label/type required"); options=options==null?List.of():List.copyOf(options); }
}
