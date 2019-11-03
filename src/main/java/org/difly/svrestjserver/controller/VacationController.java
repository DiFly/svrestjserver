package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.Vacation;
import org.difly.svrestjserver.model.VacationModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/Vacation")
public class VacationController {

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<VacationModel> vacationGetMapping() {
        //ToDo get all vacation
        return new ArrayList<VacationModel>();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public ResponseEntity<?> vacationPostMapping(@RequestBody VacationModel vacation) {
        //ToDo create new vacation
        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of vacation", ex);
        }
    }

    @PutMapping
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public ResponseEntity<?> vacationPutMapping(@RequestBody VacationModel vacation) {
        //ToDo change vacation
        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of vacation", ex);
        }
    }

}
