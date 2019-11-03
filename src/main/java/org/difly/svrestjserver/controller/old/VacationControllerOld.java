package org.difly.svrestjserver.controller.old;

import org.difly.svrestjserver.model.old.VacationOld;
import org.difly.svrestjserver.service.old.VacationServiceOld;
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
    VacationServiceOld vacationServiceOld;

    @GetMapping("/vacations")
    private List<VacationOld> getAllVacation () {
        return vacationServiceOld.getAllVacation();
    }

    @GetMapping("/vacations/{id}")
    private VacationOld getVacation (@PathVariable("id") UUID id) {
        return vacationServiceOld.getVacationById(id);
    }

    @GetMapping("/vacations/user/{idUser}")
    private List<VacationOld> getAllVacationByUserId(@PathVariable("idUser") long idUser) {
        return vacationServiceOld.getAllVacationByUserId(idUser);
    }
}
