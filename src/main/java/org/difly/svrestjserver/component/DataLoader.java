package org.difly.svrestjserver.component;

import org.difly.svrestjserver.model.User;
import org.difly.svrestjserver.model.UserDetails;
import org.difly.svrestjserver.model.Vacation;
import org.difly.svrestjserver.repository.UserDetailsRepository;
import org.difly.svrestjserver.repository.UserRepository;
import org.difly.svrestjserver.repository.VacationRepository;
import org.difly.svrestjserver.service.UserDetailsCreator;
import org.difly.svrestjserver.service.VacationCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.Stream;

@Component
public class DataLoader {
    private UserRepository userRepository;
    private UserDetailsRepository userDetailsRepository;
    private VacationRepository vacationRepository;

    @Autowired
    public DataLoader(
            UserRepository userRepository,
            UserDetailsRepository userDetailsRepository,
            VacationRepository vacationRepository
    ) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
        this.vacationRepository = vacationRepository;
        loadUser();
        loadUserDetails();
        loadVacations();
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

    private void loadVacations() {
        VacationCreator creator = new VacationCreator();
        Random r = new Random();

        for (int x = 4; x < 105; x++) {
            int c = r.nextInt(20)+1;

            for (int y = 0; y < c; y++) {
                Vacation vacation = creator.getVacation((long)x);
                vacationRepository.save(vacation);
            }
        }

        vacationRepository.findAll().forEach(System.out::println);
    }
}
