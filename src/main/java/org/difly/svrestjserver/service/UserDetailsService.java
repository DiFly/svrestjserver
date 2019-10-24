package org.difly.svrestjserver.service;

import org.difly.svrestjserver.model.UserDetails;
import org.difly.svrestjserver.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    public List<UserDetails> getAllUsersWithDetails() {
        List<UserDetails> users = new ArrayList<>();
        userDetailsRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public UserDetails getUserDetailsById(long id) {
        return userDetailsRepository.findById(id).get();
    }

    public void saveOrUpdate(UserDetails person) {
        userDetailsRepository.save(person);
    }

    public void delete(long id) {
        userDetailsRepository.deleteById(id);
    }
}
