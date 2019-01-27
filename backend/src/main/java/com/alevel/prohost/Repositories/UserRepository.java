package com.alevel.prohost.Repositories;

import com.alevel.prohost.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByNickname(String nickname);
}

