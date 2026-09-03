package it.upwardtechnology.gestionale.plugin.workflow;
public record WorkflowStateDefinition(String id,String label,boolean initialState,boolean terminalState,String icon) {
    public WorkflowStateDefinition { if(id==null||id.isBlank()||label==null||label.isBlank())throw new IllegalArgumentException("id/label required"); }
}
