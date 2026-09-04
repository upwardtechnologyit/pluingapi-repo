package it.upwardtechnology.gestionale.plugin.event;
import java.time.Instant;
import java.util.Map;
public record PluginEvent(String type, Instant occurredAt, EventOrigin origin, Map<String,Object> data) {
    public PluginEvent { if(type==null||type.isBlank())throw new IllegalArgumentException("type required"); occurredAt=occurredAt==null?Instant.now():occurredAt; origin=origin==null?EventOrigin.system():origin; data=data==null?Map.of():Map.copyOf(data); }
}
