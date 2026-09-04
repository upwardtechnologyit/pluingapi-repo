package it.upwardtechnology.gestionale.plugin.route;
import java.nio.charset.StandardCharsets;
import java.util.Map;
public record PluginResponse(int status, String contentType, Map<String,String> headers, byte[] body) {
    public PluginResponse { headers=headers==null?Map.of():Map.copyOf(headers); body=body==null?new byte[0]:body.clone(); }
    @Override public byte[] body(){ return body.clone(); }
    public static PluginResponse text(int status,String text){ return new PluginResponse(status,"text/plain; charset=UTF-8",Map.of(), text==null?new byte[0]:text.getBytes(StandardCharsets.UTF_8)); }
    public static PluginResponse json(int status,String json){ return new PluginResponse(status,"application/json; charset=UTF-8",Map.of(), json==null?new byte[0]:json.getBytes(StandardCharsets.UTF_8)); }
}
