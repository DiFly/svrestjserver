package org.difly.svrestjserver.controller;

import org.difly.svrestjserver.model.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/Transaction")
public class TransactionController {

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public Transaction transactionGetMappingId(@PathVariable("id") UUID id) {
        //ToDO Get transaction from uuid
        return new Transaction();
        //{
        //  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "change": 0,
        //  "comment": "string",
        //  "employee": {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-03T12:32:04.089Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-03T12:32:04.089Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-03T12:32:04.089Z",
        //    "deleted": true,
        //    "transactions": [
        //      null
        //    ],
        //    "vacations": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "startDate": "2019-11-03T12:32:04.089Z",
        //        "endDate": "2019-11-03T12:32:04.089Z",
        //        "comment": "string",
        //        "approverComment": "string",
        //        "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "status": 0,
        //        "statusChangeDate": "2019-11-03T12:32:04.089Z",
        //        "createDateTime": "2019-11-03T12:32:04.089Z",
        //        "deleted": true
        //      }
        //    ],
        //    "approvedVacations": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "startDate": "2019-11-03T12:32:04.089Z",
        //        "endDate": "2019-11-03T12:32:04.089Z",
        //        "comment": "string",
        //        "approverComment": "string",
        //        "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "status": 0,
        //        "statusChangeDate": "2019-11-03T12:32:04.089Z",
        //        "createDateTime": "2019-11-03T12:32:04.089Z",
        //        "deleted": true
        //      }
        //    ],
        //    "employeeTeams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "team": {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "employeeTeams": [
        //            null
        //          ]
        //        }
        //      }
        //    ],
        //    "leadedTeams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "name": "string",
        //        "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "deleted": true,
        //        "employeeTeams": [
        //          null
        //        ]
        //      }
        //    ]
        //  }
        //}
    }

    @GetMapping("/api/Transaction/employee/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public List<Transaction> transactionGetMappingEmployeeId(@PathVariable("id") UUID id) {
        //ToDo Get all transaction from one employee
        return new ArrayList<Transaction>();

        //[
        //  {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "change": 0,
        //    "comment": "string",
        //    "employee": {
        //      "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //      "firstName": "string",
        //      "surname": "string",
        //      "avatar": "string",
        //      "birthdate": "2019-11-03T12:38:14.268Z",
        //      "jobTitle": "string",
        //      "workEmail": "string",
        //      "email": "string",
        //      "phone": "string",
        //      "skype": "string",
        //      "workStartDate": "2019-11-03T12:38:14.268Z",
        //      "isActive": true,
        //      "workEndDate": "2019-11-03T12:38:14.268Z",
        //      "deleted": true,
        //      "transactions": [
        //        null
        //      ],
        //      "vacations": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "startDate": "2019-11-03T12:38:14.268Z",
        //          "endDate": "2019-11-03T12:38:14.268Z",
        //          "comment": "string",
        //          "approverComment": "string",
        //          "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "status": 0,
        //          "statusChangeDate": "2019-11-03T12:38:14.268Z",
        //          "createDateTime": "2019-11-03T12:38:14.268Z",
        //          "deleted": true
        //        }
        //      ],
        //      "approvedVacations": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "startDate": "2019-11-03T12:38:14.268Z",
        //          "endDate": "2019-11-03T12:38:14.268Z",
        //          "comment": "string",
        //          "approverComment": "string",
        //          "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "status": 0,
        //          "statusChangeDate": "2019-11-03T12:38:14.268Z",
        //          "createDateTime": "2019-11-03T12:38:14.268Z",
        //          "deleted": true
        //        }
        //      ],
        //      "employeeTeams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "team": {
        //            "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //            "name": "string",
        //            "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //            "deleted": true,
        //            "employeeTeams": [
        //              null
        //            ]
        //          }
        //        }
        //      ],
        //      "leadedTeams": [
        //        {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "employeeTeams": [
        //            null
        //          ]
        //        }
        //      ]
        //    }
        //  }
        //]
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> transactionPostMapping(@RequestBody Transaction transaction) {
        //ToDo create transaction

        try {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct value of transaction", ex);
        }

        //{
        //  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //  "change": 0,
        //  "comment": "string",
        //  "employee": {
        //    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //    "firstName": "string",
        //    "surname": "string",
        //    "avatar": "string",
        //    "birthdate": "2019-11-03T12:38:36.797Z",
        //    "jobTitle": "string",
        //    "workEmail": "string",
        //    "email": "string",
        //    "phone": "string",
        //    "skype": "string",
        //    "workStartDate": "2019-11-03T12:38:36.797Z",
        //    "isActive": true,
        //    "workEndDate": "2019-11-03T12:38:36.797Z",
        //    "deleted": true,
        //    "transactions": [
        //      null
        //    ],
        //    "vacations": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "startDate": "2019-11-03T12:38:36.797Z",
        //        "endDate": "2019-11-03T12:38:36.797Z",
        //        "comment": "string",
        //        "approverComment": "string",
        //        "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "status": 0,
        //        "statusChangeDate": "2019-11-03T12:38:36.797Z",
        //        "createDateTime": "2019-11-03T12:38:36.797Z",
        //        "deleted": true
        //      }
        //    ],
        //    "approvedVacations": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "startDate": "2019-11-03T12:38:36.797Z",
        //        "endDate": "2019-11-03T12:38:36.797Z",
        //        "comment": "string",
        //        "approverComment": "string",
        //        "approverId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "status": 0,
        //        "statusChangeDate": "2019-11-03T12:38:36.797Z",
        //        "createDateTime": "2019-11-03T12:38:36.797Z",
        //        "deleted": true
        //      }
        //    ],
        //    "employeeTeams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "employeeId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "teamId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "team": {
        //          "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "name": "string",
        //          "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //          "deleted": true,
        //          "employeeTeams": [
        //            null
        //          ]
        //        }
        //      }
        //    ],
        //    "leadedTeams": [
        //      {
        //        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "name": "string",
        //        "teamLeadId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        //        "deleted": true,
        //        "employeeTeams": [
        //          null
        //        ]
        //      }
        //    ]
        //  }
        //}
    }
}
