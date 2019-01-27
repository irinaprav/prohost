package com.alevel.prohost.Repositories;

import com.alevel.prohost.Entities.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> getAll();

    Message getById(Long id);

    List<Message> getByLocationId(Long idLocation);

    List<Message> getByTenantId(Long tenantId);

    List<Message> getByHostId(Long idHost);

    List<Message> getByStatusIsRead(Boolean isRead);

}
