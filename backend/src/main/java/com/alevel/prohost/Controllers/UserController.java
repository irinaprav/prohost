package com.alevel.prohost.Controllers;

import com.alevel.prohost.Entities.User;
import com.alevel.prohost.Operations.UserOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserOperations userOperations;
    private Logger logger = LoggerFactory.getLogger(UserOperations.class);

    @Autowired
    public UserController(UserOperations userOperations) {
        this.userOperations = userOperations;
    }

    @RequestMapping("/user/all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> getAllUsers() {
        return userOperations.getAllUsers();
    }

    @RequestMapping("/user/userbyid")
    @ResponseStatus(value = HttpStatus.OK)
    public User getUserById(Long id) {
        return userOperations.getUserById(id);
    }

    @RequestMapping("/user/nick")
    @ResponseStatus(value = HttpStatus.OK)
    public User getUserByNickname(String nickname) {
        return userOperations.getUserByNickname(nickname);
    }

    @RequestMapping("/user/newuser")
    @ResponseStatus(value = HttpStatus.OK)
    public Long saveUser(User newUser) {
        return newUser.getId();
    }
    @RequestMapping("/user/update")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateUser(User updatedUser){
    }

    @RequestMapping("/user/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteUser(Long id){

    }

}

