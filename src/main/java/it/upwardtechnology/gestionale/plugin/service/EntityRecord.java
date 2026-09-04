package it.upwardtechnology.gestionale.plugin.service;
import java.util.Map;
public record EntityRecord(long id,String type,Map<String,Object> values) { public EntityRecord { if(type==null||type.isBlank())throw new IllegalArgumentException("type required"); values=values==null?Map.of():Map.copyOf(values); } }
