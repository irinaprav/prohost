package com.alevel.prohost.Services;


import com.alevel.prohost.Entities.Message;
import com.alevel.prohost.Operations.MessageOperations;
import com.alevel.prohost.Repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements MessageOperations {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public List<Message> getAll() {
        return messageRepository.getAll();
    }

    @Override
    public Message getById(Long id) {
        return messageRepository.getById(id);
    }

    @Override
    public List<Message> getByLocationId(Long idLocation) {
        return messageRepository.getByLocationId(idLocation);
    }

    @Override
    public List<Message> getByTenantId(Long tenantId) {
        return messageRepository.getByTenantId(tenantId);
    }

    @Override
    public List<Message> getByHostId(Long idHost) {
        return messageRepository.getByHostId(idHost);
    }

    @Override
    public List<Message> getByStatusIsRead(Boolean isRead) {
        return messageRepository.getByStatusIsRead(isRead);
    }

    @Override
    public Long saveMessage(Message newMessage) {
        return newMessage.getId();
    }

    @Override
    public void updateAll(Iterable<Message> messages) {

    }

    @Override
    public void updateMessage(Message message) {

    }

    @Override
    public void deleteMessageById(Long id) {

    }
}
