package it.upwardtechnology.gestionale.plugin.workflow;
import java.util.Set;
public record WorkflowTransitionDefinition(String id,String fromState,String toState,String label,Set<String> requiredPermissions) {
    public WorkflowTransitionDefinition { if(id==null||id.isBlank()||fromState==null||toState==null)throw new IllegalArgumentException("transition fields required"); requiredPermissions=requiredPermissions==null?Set.of():Set.copyOf(requiredPermissions); }
}
