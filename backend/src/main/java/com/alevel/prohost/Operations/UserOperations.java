package com.alevel.prohost.Operations;

import com.alevel.prohost.Entities.User;

import java.util.List;

public interface UserOperations {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByNickname(String nickname);

    Long saveUser (User newUser);

    void updateUser (User updatedUser);

    void deleteUser (Long idUser);
}
