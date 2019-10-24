package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.User;
import org.difly.svrestjserver.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user-list")
    public List<User> userList() {
        return userRepository
                .findAll()
                .stream()
                .collect(Collectors.toList());
    }
}
