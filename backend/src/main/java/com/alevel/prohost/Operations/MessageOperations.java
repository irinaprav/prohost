package com.alevel.prohost.Operations;

import com.alevel.prohost.Entities.Location;
import com.alevel.prohost.Entities.Message;
import com.alevel.prohost.Entities.User;

import java.util.List;

public interface MessageOperations {

    List<Message> getAll();

    List<Message> getById(Long id);

    List<Message> getByLocation(Location location);

    List<Message> getByTenant(User tenant);

    List<Message> getByHost(User host);

    List<Message> getByStatusIsRead(Boolean isRead);

    void updateAll (Iterable<Message> messages);

    void updateMessage (Message message);

    void deleteMessageById(Long id);


}
