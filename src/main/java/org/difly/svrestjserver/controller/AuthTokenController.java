package org.difly.svrestjserver.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("connect")
public class AuthTokenController {

    @PostMapping("/token")
    public String connectTokenPostMap(@ModelAttribute String someclassmodel) {
        return "{\n" +
                "            \"access_token\": \"eyJhbGciOiJSUzI1NiIsImtpZCI6IjU4MmEzNWMwY2E4MTA5OTViNDg3ZWNjYmZkZTQzYmRjIiwidHlwIjoiSldUIn0.eyJuYmYiOjE1NzI1NTkzNzAsImV4cCI6MTU3MjU1OTQ0MCwiaXNzIjoiaHR0cHM6Ly85MS4xOTcuMTQ1LjIwOjUyNTQwIiwiYXVkIjpbImh0dHBzOi8vOTEuMTk3LjE0NS4yMDo1MjU0MC9yZXNvdXJjZXMiLCJhcGkiXSwiY2xpZW50X2lkIjoiYXBpIiwic3ViIjoiN2ZhYzY0NGQtYzYyMS00YjE0LTgzZDctZWY3NTM0N2ZhMTQ5IiwiYXV0aF90aW1lIjoxNTcyNTU5MzcwLCJpZHAiOiJsb2NhbCIsInJvbGUiOiJBZG1pbmlzdHJhdG9yIiwic2NvcGUiOlsiZW1haWwiLCJvcGVuaWQiLCJwcm9maWxlIiwicm9sZSIsImFwaSJdLCJhbXIiOlsicHdkIl19.qRC1ZxKZnHEeV16rDj1oWX7R2yeeQn38egwupl8KeKEPYYVili6RqdN9pLnil2OcuZjuXTPrc4lKD_hBrQO0Hguvr0bgXcoiHHTwqoNPalujheLxwrzuFmTkEwurriixRvr7swG-kuBK6u3GdAZ3n6zYMcG3dhwKxlGlV58I5pwWysZzxW4XORppOroSY9q1pFJQ4OoZhtzQlkdLe17iyHpfpIfoWfLf_z-9QlsB2JyGjCFZ2Qp8hGms2mfNuEiR9IoGZn3QtChYveJJlSxOqyuGz759dvWMXfp5IBbLKbB4zw_2wBvV9JIK0RC3G37EMBZO4s7XwJfzLdlc5hPuxQ\",\n" +
                "            \"expires_in\": 70,\n" +
                "            \"token_type\": \"Bearer\",\n" +
                "            \"scope\": \"api email openid profile role\"\n" +
                "        }";
        //request
        //      formData.append('username', userDetails.email);
        //    formData.append('password', userDetails.password);
        //    formData.append('client_id', 'api');
        //    formData.append('client_secret', 'vacationsecrets');
        //    formData.append('grant_type', 'password');
        //response
        //{
        //    "access_token": "eyJhbGciOiJSUzI1NiIsImtpZCI6IjU4MmEzNWMwY2E4MTA5OTViNDg3ZWNjYmZkZTQzYmRjIiwidHlwIjoiSldUIn0.eyJuYmYiOjE1NzI1NTkzNzAsImV4cCI6MTU3MjU1OTQ0MCwiaXNzIjoiaHR0cHM6Ly85MS4xOTcuMTQ1LjIwOjUyNTQwIiwiYXVkIjpbImh0dHBzOi8vOTEuMTk3LjE0NS4yMDo1MjU0MC9yZXNvdXJjZXMiLCJhcGkiXSwiY2xpZW50X2lkIjoiYXBpIiwic3ViIjoiN2ZhYzY0NGQtYzYyMS00YjE0LTgzZDctZWY3NTM0N2ZhMTQ5IiwiYXV0aF90aW1lIjoxNTcyNTU5MzcwLCJpZHAiOiJsb2NhbCIsInJvbGUiOiJBZG1pbmlzdHJhdG9yIiwic2NvcGUiOlsiZW1haWwiLCJvcGVuaWQiLCJwcm9maWxlIiwicm9sZSIsImFwaSJdLCJhbXIiOlsicHdkIl19.qRC1ZxKZnHEeV16rDj1oWX7R2yeeQn38egwupl8KeKEPYYVili6RqdN9pLnil2OcuZjuXTPrc4lKD_hBrQO0Hguvr0bgXcoiHHTwqoNPalujheLxwrzuFmTkEwurriixRvr7swG-kuBK6u3GdAZ3n6zYMcG3dhwKxlGlV58I5pwWysZzxW4XORppOroSY9q1pFJQ4OoZhtzQlkdLe17iyHpfpIfoWfLf_z-9QlsB2JyGjCFZ2Qp8hGms2mfNuEiR9IoGZn3QtChYveJJlSxOqyuGz759dvWMXfp5IBbLKbB4zw_2wBvV9JIK0RC3G37EMBZO4s7XwJfzLdlc5hPuxQ",
        //    "expires_in": 70,
        //    "token_type": "Bearer",
        //    "scope": "api email openid profile role"
        //}

        //interseptor
        //      headers: req.headers.append(
        //      'Authorization',
        //      `Bearer ${ window['auth_token'] }`)});
        //      `Bearer ${ sessionStorage.getItem('auth_token')}`
        //        )
    }
}
