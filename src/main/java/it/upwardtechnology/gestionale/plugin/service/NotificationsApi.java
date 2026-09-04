package it.upwardtechnology.gestionale.plugin.service;
import java.util.Map;
public interface NotificationsApi { long notifyUser(long userId,String type,String title,String message,Map<String,Object> metadata); }
