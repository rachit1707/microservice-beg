package com.rachit.userservice.user.service;

import com.rachit.userservice.user.entity.User;
import com.rachit.userservice.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User addUser(User user){
        return repository.save(user);
    }

    public Optional<User> findUserById(Integer id){
        return repository.findById(id);
    }
}
