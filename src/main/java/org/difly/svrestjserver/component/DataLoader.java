package org.difly.svrestjserver.component;

import org.difly.svrestjserver.model.User;
import org.difly.svrestjserver.model.UserDetails;
import org.difly.svrestjserver.repository.UserDetailsRepository;
import org.difly.svrestjserver.repository.UserRepository;
import org.difly.svrestjserver.service.UserDetailsCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DataLoader {
    private UserRepository userRepository;
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    public DataLoader(
            UserRepository userRepository,
            UserDetailsRepository userDetailsRepository
    ) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
        loadUser();
        loadUserDetails();
    }

    private void loadUser() {
        Stream.of("admin", "leader", "user")
                .forEach(name -> {
                    User user  = new User();
                    user.setName(name);
                    user.setEmail(name + "@mail.com");
                    user.setPassword(name);
                    userRepository.save(user);
                });
        userRepository.findAll().forEach(System.out::println);
    }

    private void loadUserDetails() {
        UserDetailsCreator creator = new UserDetailsCreator();

        for (int i = 0; i < 100; i++) {
            UserDetails user = creator.getUserDetails();
            userDetailsRepository.save(user);
        }

        userDetailsRepository.findAll().forEach(System.out::println);

    }
}
