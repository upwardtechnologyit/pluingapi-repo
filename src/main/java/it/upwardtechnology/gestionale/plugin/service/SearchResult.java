package it.upwardtechnology.gestionale.plugin.service;
import java.util.List;
public record SearchResult(List<EntityRecord> items,long total) { public SearchResult { items=items==null?List.of():List.copyOf(items); } }
