package com.example.gatewaydemo.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Login Ok";
    }
}
