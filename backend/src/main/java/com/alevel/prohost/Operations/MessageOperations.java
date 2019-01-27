package com.alevel.prohost.Operations;

import com.alevel.prohost.Entities.Message;

import java.util.List;

public interface MessageOperations {

    List<Message> getAll();

    Message getById(Long id);

    List<Message> getByLocationId(Long idLocation);

    List<Message> getByTenantId(Long tenantId);

    List<Message> getByHostId(Long idHost);

    List<Message> getByStatusIsRead(Boolean isRead);

    Long saveMessage(Message newMessage);

    void updateAll (Iterable<Message> messages);

    void updateMessage (Message message);

    void deleteMessageById(Long id);


}
