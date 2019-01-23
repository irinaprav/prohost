package com.alevel.prohost.Services;


import com.alevel.prohost.Entities.Location;
import com.alevel.prohost.Entities.Message;
import com.alevel.prohost.Entities.User;
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
    public List<Message> getById(Long id) {
        return messageRepository.getById(id);
    }

    @Override
    public List<Message> getByLocation(Location location) {
        return messageRepository.getByLocation(location);
    }

    @Override
    public List<Message> getByTenant(User tenant) {
        return messageRepository.getByTenant(tenant);
    }

    @Override
    public List<Message> getByHost(User host) {
        return messageRepository.getByHost(host);
    }

    @Override
    public List<Message> getByStatusIsRead(Boolean isRead) {
        return messageRepository.getByIsRead(isRead);
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
