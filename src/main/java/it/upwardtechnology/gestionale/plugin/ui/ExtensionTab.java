package it.upwardtechnology.gestionale.plugin.ui;
import java.util.Set;
public record ExtensionTab(String id,String label,String icon,String route,int order,Set<String> requiredPermissions) {
    public ExtensionTab { if(id==null||id.isBlank()||label==null||label.isBlank())throw new IllegalArgumentException("tab id/label required"); requiredPermissions=requiredPermissions==null?Set.of():Set.copyOf(requiredPermissions); }
}
