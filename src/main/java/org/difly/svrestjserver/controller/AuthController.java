package org.difly.svrestjserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("api/auth")
public class AuthController {

    @GetMapping("/login")
    @ResponseStatus(value = HttpStatus.OK, reason = "Success")
    public String loginGetMap() {
        try {
            return "api/auth/login";
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Unauthorized"
            );
        }



        //No parameters
        //Responses
        //Code	Description	Links
        //200	Success //No links
    }

    @PostMapping("/forgotPassword")
    @ResponseStatus(HttpStatus.OK)
    public String forgotPasswordPostMap() {

        return "{\n" +
                "  \"email\": \"string\",\n" +
                "  \"date\": \"2019-10-31T21:31:13.186Z\"\n" +
                "}";
        //Request body
        // {
        //  "email": "string",
        //  "date": "2019-10-31T21:39:13.235Z"
        //}

        //Parameters
        //No parameters
        //Responses
        //Code	Description	Links
        //200   Success     No links
    }

    @PostMapping("/resetPassword")
    @ResponseStatus(HttpStatus.OK)
    public String resetPassword() {
        return "{\n" +
                "  \"token\": \"string\",\n" +
                "  \"password\": \"string\"\n" +
                "}";

        //Parameters
        //No parameters
        //
        //Request body
        //
        //Example Value
        //Schema
        //{
        //  "token": "string",
        //  "password": "string"
        //}
        //Responses
        //Code	Description	Links
        //200   //Success   //No links
    }

}
