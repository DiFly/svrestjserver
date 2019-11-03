package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.old.Vacation;
import org.difly.svrestjserver.service.old.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
public class VacationControllerOld {
    @Autowired
    VacationService vacationService;

    @GetMapping("/vacations")
    private List<Vacation> getAllVacation () {
        return vacationService.getAllVacation();
    }

    @GetMapping("/vacations/{id}")
    private Vacation getVacation (@PathVariable("id") UUID id) {
        return vacationService.getVacationById(id);
    }

    @GetMapping("/vacations/user/{idUser}")
    private List<Vacation> getAllVacationByUserId(@PathVariable("idUser") long idUser) {
        return vacationService.getAllVacationByUserId(idUser);
    }
}
