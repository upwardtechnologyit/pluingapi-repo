package it.upwardtechnology.gestionale.plugin.route;
import it.upwardtechnology.gestionale.plugin.security.PluginPrincipal;
import java.util.*;
public record PluginRequest(HttpMethod method, String path, Map<String,List<String>> parameters,
                            Map<String,String> headers, byte[] body, PluginPrincipal principal) {
    public PluginRequest {
        parameters = immutableMulti(parameters); headers = headers == null ? Map.of() : Map.copyOf(headers);
        body = body == null ? new byte[0] : body.clone();
    }
    public Optional<String> parameter(String name) { var v=parameters.get(name); return v==null||v.isEmpty()?Optional.empty():Optional.ofNullable(v.getFirst()); }
    @Override public byte[] body(){ return body.clone(); }
    private static Map<String,List<String>> immutableMulti(Map<String,List<String>> in){
        if(in==null)return Map.of(); var out=new LinkedHashMap<String,List<String>>(); in.forEach((k,v)->out.put(k,v==null?List.of():List.copyOf(v))); return Collections.unmodifiableMap(out);
    }
}
