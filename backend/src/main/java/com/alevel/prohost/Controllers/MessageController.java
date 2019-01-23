package com.alevel.prohost.Controllers;

import com.alevel.prohost.Entities.Location;
import com.alevel.prohost.Entities.Message;
import com.alevel.prohost.Entities.User;
import com.alevel.prohost.Operations.MessageOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageOperations messageOperations;
    private Logger logger = LoggerFactory.getLogger(RentController.class);

    @Autowired
    public MessageController(MessageOperations messageOperations) {
        this.messageOperations = messageOperations;
    }

    @RequestMapping(value = "/message/all", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getAll() { return messageOperations.getAll(); }

    @RequestMapping(value = "/message/byId", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getById(Long id) {
        return messageOperations.getById(id);
    }

    @RequestMapping(value = "/message/byLocation", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getByLocation(Location location) {
        return messageOperations.getByLocation(location);
    }

    @RequestMapping(value = "/message/byTenant", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getByTenant(User tenant) {
        return messageOperations.getByTenant(tenant);
    }

    @RequestMapping(value = "/message/byHost", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getByHost(User host) {
        return messageOperations.getByHost(host);
    }

    @RequestMapping(value = "/message/isRead", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Message> getByStatusIsRead(Boolean isRead) {
        return messageOperations.getByStatusIsRead(isRead);
    }

    @RequestMapping(value = "/message/updateAll", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateAll(Iterable<Message> messages) {
    }

    @RequestMapping(value = "/message/updateMessage", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateMessage(Message message) {
    }

    @RequestMapping(value = "/message/deleteMessage", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteMessageById(Long id) {
    }

}
