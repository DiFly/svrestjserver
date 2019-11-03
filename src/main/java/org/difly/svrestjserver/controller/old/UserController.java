package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.old.UserOld;
import org.difly.svrestjserver.repository.old.UserRepositoryOld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private UserRepositoryOld userRepositoryOld;

    public UserController(UserRepositoryOld userRepositoryOld) {
        this.userRepositoryOld = userRepositoryOld;
    }

    @GetMapping("/user-list")
    public List<UserOld> userList() {
        return userRepositoryOld
                .findAll()
                .stream()
                .collect(Collectors.toList());
    }
}
