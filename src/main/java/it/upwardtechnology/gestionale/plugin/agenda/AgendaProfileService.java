package it.upwardtechnology.gestionale.plugin.agenda;
import java.util.List;
import java.util.Optional;
public interface AgendaProfileService {
    String profileId();
    AgendaItem create(AgendaItemDraft draft);
    Optional<AgendaItem> findById(long id);
    List<AgendaItem> search(AgendaQuery query);
    AgendaItem update(long id, AgendaItemDraft draft);
    boolean delete(long id);
    AgendaItem transition(long id,String transitionId);
}
