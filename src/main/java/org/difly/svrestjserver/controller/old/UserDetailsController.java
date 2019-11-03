package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.old.UserDetailsOld;
import org.difly.svrestjserver.service.old.UserDetailsServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserDetailsController {
    @Autowired
    UserDetailsServiceOld userDetailsServiceOld;

    @GetMapping("/user-details")
    private List<UserDetailsOld> getAllPersons() {
        return userDetailsServiceOld.getAllUsersWithDetails();
    }

    @GetMapping("/user-details/{id}")
    private UserDetailsOld getPerson(@PathVariable("id") long id) {
        return userDetailsServiceOld.getUserDetailsById(id);
    }

    @DeleteMapping("/user-details/{id}")
    private void deletePerson(@PathVariable("id") long id) {
        userDetailsServiceOld.delete(id);
    }

    @PostMapping("/user-details")
    private long savePerson(@RequestBody UserDetailsOld userDetailsOld) {
        userDetailsServiceOld.saveOrUpdate(userDetailsOld);
        return userDetailsOld.getId();
    }
}
