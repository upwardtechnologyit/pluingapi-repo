package it.upwardtechnology.gestionale.plugin.workflow;
import java.util.List;
public record WorkflowDefinition(String id,List<WorkflowStateDefinition> states,List<WorkflowTransitionDefinition> transitions) {
    public WorkflowDefinition { if(id==null||id.isBlank())throw new IllegalArgumentException("id required"); states=states==null?List.of():List.copyOf(states); transitions=transitions==null?List.of():List.copyOf(transitions); long initial=states.stream().filter(WorkflowStateDefinition::initialState).count(); if(!states.isEmpty()&&initial!=1)throw new IllegalArgumentException("workflow must have exactly one initial state"); }
}
