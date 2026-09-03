package it.upwardtechnology.gestionale.plugin.ui;
public record ExtensionView(String id,String label,String route,String icon,int order) {
    public ExtensionView { if(id==null||id.isBlank()||label==null||label.isBlank()||route==null||route.isBlank())throw new IllegalArgumentException("view fields required"); }
}
