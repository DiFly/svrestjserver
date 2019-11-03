package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.TeamModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/Team")
public class TeamController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TeamModel teamGetMapping() {
        //ToDo return TeamModel list
//        return new TeamModel();
        return null;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "name": "string",
        //    "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "deleted": true,
        //    "teamLeadName": "string",
        //    "employeeCount": 0,
        //    "employees": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "firstName": "string",
        //        "surname": "string",
        //        "avatar": "string",
        //        "birthdate": "2019-11-03T12:01:04.796Z",
        //        "jobTitle": "string",
        //        "workEmail": "string",
        //        "email": "string",
        //        "phone": "string",
        //        "skype": "string",
        //        "workStartDate": "2019-11-03T12:01:04.796Z",
        //        "isActive": true,
        //        "workEndDate": "2019-11-03T12:01:04.796Z",
        //        "deleted": true,
        //        "balance": 0,
        //        "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "teams": [
        //          null
        //        ]
        //      }
        //    ]
        //  }
        //]
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> teamPostMapping(@RequestBody TeamModel team) {
        //ToDo create new TeamModel

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of team", ex);
        }
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> teamPutMapping(@RequestBody TeamModel team) {
        //ToDo change TeamModel

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of team", ex);
        }
    }

    @GetMapping("/all")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<TeamModel> teamGetMappingAll() {
        return new ArrayList<TeamModel>();
    }

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public TeamModel teamGetMappingId(@PathVariable("id") UUID id) {
        return new TeamModel();
    }

    @PutMapping("/{id}/state/{deleted}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> teamPutMappingIdState(@PathVariable("id") UUID id, @PathVariable("deleted") boolean deleted) {
        //ToDo change TeamModel status

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of team", ex);
        }
    }

    @PostMapping("/{id}/user/{employeeId}/add")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> teamPutMappingIdUserEmployeeIdAdd(@PathVariable("id") UUID id, @PathVariable("employeeId") UUID employeeId) {
        //ToDo change TeamModel add employee

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of team", ex);
        }
    }

    @PostMapping("/{id}/user/{employeeId}/remove")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> teamPutMappingIdUserEmployeeIdRemove(@PathVariable("id") UUID id, @PathVariable("employeeId") UUID employeeId) {
        //ToDo change TeamModel remove employee

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of team", ex);
        }
    }
}
