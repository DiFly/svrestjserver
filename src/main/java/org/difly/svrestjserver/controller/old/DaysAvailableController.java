package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.old.UserDetailsOld;
import org.difly.svrestjserver.model.custom.AvailableDays;
import org.difly.svrestjserver.service.old.UserDetailsServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DaysAvailableController {
    @Autowired
    UserDetailsServiceOld userDetailsServiceOld;

    @GetMapping("/user-days-available/{id}")
    private AvailableDays getAvailableDays(@PathVariable("id") long id) {
        UserDetailsOld user = userDetailsServiceOld.getUserDetailsById(id);
        AvailableDays availableDays = new AvailableDays();
        availableDays.setUserId(id);
        availableDays.setDays(user.getDaysavailable());
        return availableDays;
    }
}
