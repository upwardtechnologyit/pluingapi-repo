package it.upwardtechnology.gestionale.plugin.ui;
import java.util.Set;
public record NavigationItem(String id,String pluginId,String section,String label,String path,String icon,int order,Set<String> requiredPermissions) {
    public NavigationItem { if(id==null||id.isBlank()||pluginId==null||pluginId.isBlank()||label==null||label.isBlank()||path==null||path.isBlank())throw new IllegalArgumentException("navigation fields required"); requiredPermissions=requiredPermissions==null?Set.of():Set.copyOf(requiredPermissions); }
}
