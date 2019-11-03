package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.EmployeeModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController("api/Employee")
public class EmployeeController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeModel> employeeGetMapping() {
        //ToDo Get list of employees

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> employeePostMapping(@RequestBody EmployeeModel employee) throws URISyntaxException {
        //ToDo Create employee

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct Actor Id", ex);
        }

        //{
        //  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "firstName": "string",
        //  "surname": "string",
        //  "avatar": "string",
        //  "birthdate": "2019-11-03T10:29:39.212Z",
        //  "jobTitle": "string",
        //  "workEmail": "string",
        //  "email": "string",
        //  "phone": "string",
        //  "skype": "string",
        //  "workStartDate": "2019-11-03T10:29:39.212Z",
        //  "isActive": true,
        //  "workEndDate": "2019-11-03T10:29:39.212Z",
        //  "deleted": true,
        //  "balance": 0,
        //  "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "teams": [
        //    {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "name": "string",
        //      "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "deleted": true,
        //      "teamLeadName": "string",
        //      "employeeCount": 0,
        //      "employees": [
        //        null
        //      ]
        //    }
        //  ]
        //}
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> employeePutMapping(@RequestBody EmployeeModel employee) throws URISyntaxException {
        //ToDo Change one employee

        try {
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct Actor Id", ex);
        }
    }

    @GetMapping("/paged/{offset}/{count}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<EmployeeModel> employeeGetMappingPagedWithOffsetAndCount(@PathVariable("offset") long offset, @PathVariable("count") long count) {
        //ToDo Get list of employees with offset and count

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }

    @GetMapping("/all")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<EmployeeModel> employeeGetMappingAll() {
        //ToDo Get list of employees all

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }


    @GetMapping("/all/paged/{offset}/{count}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<EmployeeModel> employeeGetMappingAllPagedWithOffsetAndCount(@PathVariable("offset") long offset, @PathVariable("count") long count) {
        //ToDo Get list of employees all with offset and count

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }


    @GetMapping("/team/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<EmployeeModel> employeeGetMappingTeamId(@PathVariable("id") UUID id) {
        //ToDo Get list of employees from team id

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }

    @GetMapping("/team/{id}/api/Employee/team/{id}/paged/{offset}/{count}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<EmployeeModel> employeeGetMappingTeamIdPagedWithOffsetAndCount(@PathVariable("id") UUID id, @PathVariable("offset") long offset, @PathVariable("count") long count) {
        //ToDo Get list of employees from team id with offset and count

        List<EmployeeModel> list = new ArrayList<EmployeeModel>();
        return list;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public EmployeeModel employeeGetMappingId(@PathVariable("id") UUID id) {
        //ToDo Get employee from id

        EmployeeModel employee = new EmployeeModel();
        return employee;
        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-02T19:40:45.898Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-02T19:40:45.898Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-02T19:40:45.898Z",
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
        //]
    }

    @PutMapping("/{id}/state/{deleted}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public ResponseEntity<?> employeePutMappingIdState(@PathVariable("id") UUID id, @PathVariable("deleted") boolean deleted) throws URISyntaxException {
        //ToDo Change one employee

        try {
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct employee Id", ex);
        }
    }


}
