package org.difly.svrestjserver.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/auth")
public class AuthController {

    @GetMapping("/login")
    public String loginGetMap() {
        return "api/auth/login";

        //No parameters
        //Responses
        //Code	Description	Links
        //200	Success //No links
    }

    @PostMapping("/forgotPassword")
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
