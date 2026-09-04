package it.upwardtechnology.gestionale.plugin.data;
import java.util.List;
import java.util.Map;
/** Database facade for plugin-owned tables. Implementations should audit and scope access. */
public interface PluginDatabase {
    int update(String sql,List<?> parameters);
    List<Map<String,Object>> query(String sql,List<?> parameters);
    <T> T transaction(TransactionWork<T> work);
    @FunctionalInterface interface TransactionWork<T> { T run(PluginDatabase transaction) throws Exception; }
}
