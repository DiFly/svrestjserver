package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.Vacation;
import org.difly.svrestjserver.model.VacationModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public VacationModel vacationGetMappingId(@PathVariable("id") UUID id) {
        //ToDo get vacation from id
        return new VacationModel();

        //{
        //  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "startDate": "2019-11-03T13:41:10.931Z",
        //  "endDate": "2019-11-03T13:41:10.931Z",
        //  "comment": "string",
        //  "approverComment": "string",
        //  "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "status": 0,
        //  "statusChangeDate": "2019-11-03T13:41:10.931Z",
        //  "createDateTime": "2019-11-03T13:41:10.931Z",
        //  "deleted": true,
        //  "employee": {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-03T13:41:10.931Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-03T13:41:10.931Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-03T13:41:10.931Z",
        //    "deleted": true,
        //    "balance": 0,
        //    "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "teams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "name": "string",
        //        "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "deleted": true,
        //        "teamLeadName": "string",
        //        "employeeCount": 0,
        //        "employees": [
        //          null
        //        ]
        //      }
        //    ]
        //  },
        //  "approver": {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-03T13:41:10.931Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-03T13:41:10.931Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-03T13:41:10.931Z",
        //    "deleted": true,
        //    "balance": 0,
        //    "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "teams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "name": "string",
        //        "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "deleted": true,
        //        "teamLeadName": "string",
        //        "employeeCount": 0,
        //        "employees": [
        //          null
        //        ]
        //      }
        //    ]
        //  }
        //}
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public ResponseEntity<?> vacationDeleteMappingId(@PathVariable("id") UUID id) {
        //ToDo change vacation to delete
        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of vacation", ex);
        }
    }

    @PutMapping("/{id}/status")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public ResponseEntity<?> vacationPutMappingIdStatusChange(@PathVariable("id") UUID id) {
        //{
        //  "approverComment": "string",
        //  "status": 0
        //}

        //ToDo change vacation status to approve or decline
        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of vacation", ex);
        }
    }

    @GetMapping("/employee/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<VacationModel> vacationGetMappingEmployeeId(@PathVariable("id") UUID id) {
        //ToDo get all vacation from employee id
        return new ArrayList<VacationModel>();

        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "startDate": "2019-11-03T13:45:44.954Z",
        //    "endDate": "2019-11-03T13:45:44.954Z",
        //    "comment": "string",
        //    "approverComment": "string",
        //    "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "status": 0,
        //    "statusChangeDate": "2019-11-03T13:45:44.954Z",
        //    "createDateTime": "2019-11-03T13:45:44.954Z",
        //    "deleted": true,
        //    "employee": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    },
        //    "approver": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    }
        //  }
        //]
    }

    @GetMapping("/team/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<VacationModel> vacationGetMappingTeamId(@PathVariable("id") UUID id) {
        //ToDo get all vacation from team id
        return new ArrayList<VacationModel>();

        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "startDate": "2019-11-03T13:45:44.954Z",
        //    "endDate": "2019-11-03T13:45:44.954Z",
        //    "comment": "string",
        //    "approverComment": "string",
        //    "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "status": 0,
        //    "statusChangeDate": "2019-11-03T13:45:44.954Z",
        //    "createDateTime": "2019-11-03T13:45:44.954Z",
        //    "deleted": true,
        //    "employee": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    },
        //    "approver": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    }
        //  }
        //]
    }

    @GetMapping("/team/{id}/range/{from}/{to}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<VacationModel> vacationGetMappingTeamIdRangeFromTo(
            @PathVariable("id") UUID id,
            @PathVariable("from") String from,
            @PathVariable("to") String to
            ) {
        //ToDo get all vacation from team id with range from and to
        return new ArrayList<VacationModel>();

        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "startDate": "2019-11-03T13:45:44.954Z",
        //    "endDate": "2019-11-03T13:45:44.954Z",
        //    "comment": "string",
        //    "approverComment": "string",
        //    "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "status": 0,
        //    "statusChangeDate": "2019-11-03T13:45:44.954Z",
        //    "createDateTime": "2019-11-03T13:45:44.954Z",
        //    "deleted": true,
        //    "employee": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    },
        //    "approver": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    }
        //  }
        //]
    }

    @GetMapping("/pending")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<VacationModel> vacationGetMappingPending() {
        //ToDo get all vacation pending
        return new ArrayList<VacationModel>();

        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "startDate": "2019-11-03T13:45:44.954Z",
        //    "endDate": "2019-11-03T13:45:44.954Z",
        //    "comment": "string",
        //    "approverComment": "string",
        //    "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "status": 0,
        //    "statusChangeDate": "2019-11-03T13:45:44.954Z",
        //    "createDateTime": "2019-11-03T13:45:44.954Z",
        //    "deleted": true,
        //    "employee": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    },
        //    "approver": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T13:45:44.954Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T13:45:44.954Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T13:45:44.954Z",
        //      "deleted": true,
        //      "balance": 0,
        //      "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "teams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "teamLeadName": "string",
        //          "employeeCount": 0,
        //          "employees": [
        //            null
        //          ]
        //        }
        //      ]
        //    }
        //  }
        //]
    }

}
