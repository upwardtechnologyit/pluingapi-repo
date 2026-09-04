package it.upwardtechnology.gestionale.plugin.event;
import java.util.function.Consumer;
public interface EventBus {
    void publish(PluginEvent event);
    EventSubscription subscribe(String eventType, Consumer<PluginEvent> listener);
}
