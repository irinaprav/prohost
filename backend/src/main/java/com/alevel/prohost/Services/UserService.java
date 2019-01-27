package com.alevel.prohost.Services;


import com.alevel.prohost.Entities.User;
import com.alevel.prohost.Operations.UserOperations;
import com.alevel.prohost.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserOperations {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User getUserByNickname(String nickname) {
        return userRepository.getUserByNickname(nickname);
    }

    @Override
    public Long saveUser(User newUser) {
        return newUser.getId();
    }

    @Override
    public void updateUser(User updatedUser) {

    }

    @Override
    public void deleteUser(Long idUser) {

    }
}
