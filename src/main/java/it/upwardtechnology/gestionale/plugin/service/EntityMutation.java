package it.upwardtechnology.gestionale.plugin.service;
import java.util.Map;
public record EntityMutation(Map<String,Object> values) { public EntityMutation { values=values==null?Map.of():Map.copyOf(values); } }
