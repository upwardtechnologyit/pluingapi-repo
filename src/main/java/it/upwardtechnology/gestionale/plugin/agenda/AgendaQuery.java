package it.upwardtechnology.gestionale.plugin.agenda;
import java.time.Instant;
import java.util.Set;
public record AgendaQuery(Instant from,Instant to,Set<String> profileIds,Set<Long> userIds,Set<Long> teamIds,
                          Set<String> statuses,AgendaVisibility visibility) {
    public AgendaQuery { profileIds=profileIds==null?Set.of():Set.copyOf(profileIds); userIds=userIds==null?Set.of():Set.copyOf(userIds); teamIds=teamIds==null?Set.of():Set.copyOf(teamIds); statuses=statuses==null?Set.of():Set.copyOf(statuses); visibility=visibility==null?AgendaVisibility.OWN:visibility; }
}
