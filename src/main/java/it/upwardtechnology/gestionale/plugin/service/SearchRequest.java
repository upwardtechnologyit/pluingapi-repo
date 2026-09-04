package it.upwardtechnology.gestionale.plugin.service;
import java.util.Map;
public record SearchRequest(String text,int offset,int limit,Map<String,Object> filters,String sortBy,boolean ascending) {
    public SearchRequest { if(offset<0)offset=0; if(limit<=0)limit=50; if(limit>500)limit=500; filters=filters==null?Map.of():Map.copyOf(filters); }
    public static SearchRequest all(){ return new SearchRequest(null,0,100,Map.of(),null,true); }
}
