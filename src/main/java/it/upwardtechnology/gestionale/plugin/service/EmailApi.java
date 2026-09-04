package it.upwardtechnology.gestionale.plugin.service;
import java.util.List;
import java.util.Map;
public interface EmailApi {
    void send(String to,String subject,String body,boolean html,List<Attachment> attachments);
    void sendTemplate(String templateKey,String to,Map<String,Object> variables,List<Attachment> attachments);
    record Attachment(String filename,String contentType,byte[] content){ public Attachment { content=content==null?new byte[0]:content.clone(); } @Override public byte[] content(){ return content.clone(); } }
}
