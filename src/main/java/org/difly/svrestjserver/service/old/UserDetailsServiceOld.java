package org.difly.svrestjserver.service.old;

import org.difly.svrestjserver.model.old.UserDetailsOld;
import org.difly.svrestjserver.repository.UserDetailsRepositoryOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceOld {
    @Autowired
    UserDetailsRepositoryOld userDetailsRepositoryOld;

    public List<UserDetailsOld> getAllUsersWithDetails() {
        List<UserDetailsOld> users = new ArrayList<>();
        userDetailsRepositoryOld.findAll().forEach(user -> users.add(user));
        return users;
    }

    public UserDetailsOld getUserDetailsById(long id) {
        return userDetailsRepositoryOld.findById(id).get();
    }

    public void saveOrUpdate(UserDetailsOld person) {
        userDetailsRepositoryOld.save(person);
    }

    public void delete(long id) {
        userDetailsRepositoryOld.deleteById(id);
    }
}
