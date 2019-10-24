package org.difly.svrestjserver;

import org.difly.svrestjserver.model.User;
import org.difly.svrestjserver.repository.UserDetailsRepository;
import org.difly.svrestjserver.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    ApplicationRunner init(UserRepository userRepo, UserDetailsRepository userDetailRepo) {
//        return args -> {
//            Stream.of("admin", "leader", "user")
//                    .forEach(name -> {
//                        User user  = new User();
//                        user.setName(name);
//                        user.setEmail(name + "@mail.com");
//                        user.setPassword(name);
//                        userRepo.save(user);
//                    });
//            userRepo.findAll().forEach(System.out::println);
//        };
//    }
}
