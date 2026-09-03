package it.upwardtechnology.gestionale.plugin.data;
public record PluginMigration(String version,String description,String resourcePath,String sha256) {
    public PluginMigration { if(version==null||version.isBlank()||resourcePath==null||resourcePath.isBlank())throw new IllegalArgumentException("migration version/resource required"); }
}
