package org.difly.svrestjserver.component;

import org.difly.svrestjserver.model.old.UserDetailsOld;
import org.difly.svrestjserver.model.old.VacationOld;
import org.difly.svrestjserver.repository.old.UserDetailsRepositoryOld;
import org.difly.svrestjserver.repository.old.VacationRepositoryOld;
import org.difly.svrestjserver.service.old.UserDetailsCreatorOld;
import org.difly.svrestjserver.service.old.VacationCreatorOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DataLoaderOld {
    private UserDetailsRepositoryOld userDetailsRepositoryOld;
    private VacationRepositoryOld vacationRepositoryOld;

    @Autowired
    public DataLoaderOld(
            UserDetailsRepositoryOld userDetailsRepositoryOld,
            VacationRepositoryOld vacationRepositoryOld
    ) {
        this.userDetailsRepositoryOld = userDetailsRepositoryOld;
        this.vacationRepositoryOld = vacationRepositoryOld;
        loadUserDetails();
        loadVacations();
    }

    private void loadUserDetails() {
        UserDetailsCreatorOld creator = new UserDetailsCreatorOld();

        for (int i = 0; i < 25; i++) {
            UserDetailsOld user = creator.getUserDetails();
            userDetailsRepositoryOld.save(user);
        }

        userDetailsRepositoryOld.findAll().forEach(System.out::println);
    }

    private void loadVacations() {
        VacationCreatorOld creator = new VacationCreatorOld();
        Random r = new Random();

        for (int x = 1; x < 20; x++) {
            int c = r.nextInt(20)+1;

            for (int y = 0; y < c; y++) {
                VacationOld vacationOld = creator.getVacation((long)x);
                vacationRepositoryOld.save(vacationOld);
            }
        }

        vacationRepositoryOld.findAll().forEach(System.out::println);
    }
}
