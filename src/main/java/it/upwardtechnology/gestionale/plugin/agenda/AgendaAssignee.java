package it.upwardtechnology.gestionale.plugin.agenda;
public record AgendaAssignee(AssigneeType type,long id,String displayName) { public AgendaAssignee { if(type==null||id<=0)throw new IllegalArgumentException("valid assignee required"); } }
