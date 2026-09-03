package it.upwardtechnology.gestionale.plugin.ui;
import java.util.Set;
public record ExtensionAction(String id,String label,String icon,String route,int order,Set<String> requiredPermissions) {
    public ExtensionAction { if(id==null||id.isBlank()||label==null||label.isBlank())throw new IllegalArgumentException("action id/label required"); requiredPermissions=requiredPermissions==null?Set.of():Set.copyOf(requiredPermissions); }
}
