package com.alevel.prohost.Repositories;

import com.alevel.prohost.Entities.Location;
import com.alevel.prohost.Entities.Message;
import com.alevel.prohost.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> getAll();

    List<Message> getById(Long id);

    List<Message> getByLocation(Location location);

    List<Message> getByTenant(User tenant);

    List<Message> getByHost(User host);

    List<Message> getByIsRead(Boolean isRead);

}
