package com.forTUE.SwimmingRaceRegistrationManagement.appControler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping({"/homePage"})
    public String home(){
        return "homePage";
    }

    @GetMapping({"/loginPage"})
    public String login(){
        return "loginPage";
    }

    @PostMapping({"/regPage"})
    public String register(){
        return "regPage";
    }
}
