package it.upwardtechnology.gestionale.plugin.service;
import java.util.Map;
public interface AuditApi { void record(String action,String entityType,String entityId,Map<String,Object> details); }
