package it.upwardtechnology.gestionale.plugin.service;
import java.util.Optional;
public interface CrudService {
    Optional<EntityRecord> findById(long id);
    SearchResult search(SearchRequest request);
    EntityRecord create(EntityMutation mutation);
    EntityRecord update(long id,EntityMutation mutation);
    boolean delete(long id);
}
