package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.UserDetails;
import org.difly.svrestjserver.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/user-details")
    private List<UserDetails> getAllPersons() {
        return userDetailsService.getAllUsersWithDetails();
    }

    @GetMapping("/user-details/{id}")
    private UserDetails getPerson(@PathVariable("id") long id) {
        return userDetailsService.getUserDetailsById(id);
    }

    @DeleteMapping("/user-details/{id}")
    private void deletePerson(@PathVariable("id") long id) {
        userDetailsService.delete(id);
    }

    @PostMapping("/user-details")
    private long savePerson(@RequestBody UserDetails userDetails) {
        userDetailsService.saveOrUpdate(userDetails);
        return userDetails.getId();
    }
}
