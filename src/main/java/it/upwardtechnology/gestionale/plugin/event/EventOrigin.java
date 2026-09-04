package it.upwardtechnology.gestionale.plugin.event;
public record EventOrigin(Kind kind, String pluginId) {
    public enum Kind { CORE, USER, SYSTEM, PLUGIN }
    public static EventOrigin core(){ return new EventOrigin(Kind.CORE,null); }
    public static EventOrigin user(){ return new EventOrigin(Kind.USER,null); }
    public static EventOrigin system(){ return new EventOrigin(Kind.SYSTEM,null); }
    public static EventOrigin plugin(String id){ return new EventOrigin(Kind.PLUGIN,id); }
}
