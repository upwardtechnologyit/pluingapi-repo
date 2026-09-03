package it.upwardtechnology.gestionale.plugin.agenda;
import java.util.List;
public interface AgendaApi {
    AgendaProfileService forProfile(String profileId);
    List<AgendaItem> searchVisible(AgendaQuery query);
}
