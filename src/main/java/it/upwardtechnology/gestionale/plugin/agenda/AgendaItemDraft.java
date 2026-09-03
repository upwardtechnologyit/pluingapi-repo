package it.upwardtechnology.gestionale.plugin.agenda;
import java.time.Instant;
import java.util.List;
import java.util.Map;
public record AgendaItemDraft(String profileId,String title,String description,Instant startsAt,Instant endsAt,
                              Long clientId,Long contactId,String status,List<AgendaAssignee> assignees,
                              String sourcePluginId,String sourceEntityType,String sourceEntityId,Map<String,Object> customFields) {
    public AgendaItemDraft { if(profileId==null||profileId.isBlank()||title==null||title.isBlank()||startsAt==null)throw new IllegalArgumentException("profile/title/start required"); assignees=assignees==null?List.of():List.copyOf(assignees); customFields=customFields==null?Map.of():Map.copyOf(customFields); }
}
