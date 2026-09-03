package it.upwardtechnology.gestionale.plugin;

import java.util.Objects;

/** Stable permission definition declared by a plugin. */
public final class PermissionDefinition {
    private final String permissionKey;
    private final String nome;
    private final String descrizione;
    private final String modulo;
    private final boolean sistema;
    private final String pluginId;

    public PermissionDefinition(String permissionKey, String nome, String descrizione,
                                String modulo, boolean sistema, String pluginId) {
        this.permissionKey = require(permissionKey, "permissionKey");
        this.nome = require(nome, "nome");
        this.descrizione = normalize(descrizione);
        this.modulo = require(modulo, "modulo");
        this.sistema = sistema;
        this.pluginId = require(pluginId, "pluginId");
    }
    public String getPermissionKey(){ return permissionKey; }
    public String getNome(){ return nome; }
    public String getDescrizione(){ return descrizione; }
    public String getModulo(){ return modulo; }
    public boolean isSistema(){ return sistema; }
    public String getPluginId(){ return pluginId; }
    private static String require(String v,String f){ if(v==null||v.isBlank()) throw new IllegalArgumentException(f+" non puo essere vuoto."); return v.trim(); }
    private static String normalize(String v){ return v==null||v.isBlank()?null:v.trim(); }
    @Override public boolean equals(Object o){ if(this==o)return true; if(!(o instanceof PermissionDefinition d))return false; return sistema==d.sistema && permissionKey.equals(d.permissionKey)&&nome.equals(d.nome)&&Objects.equals(descrizione,d.descrizione)&&modulo.equals(d.modulo)&&pluginId.equals(d.pluginId); }
    @Override public int hashCode(){ return Objects.hash(permissionKey,nome,descrizione,modulo,sistema,pluginId); }
}
