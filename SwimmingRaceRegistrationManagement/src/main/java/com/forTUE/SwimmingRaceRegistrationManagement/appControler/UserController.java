package com.forTUE.SwimmingRaceRegistrationManagement.appControler;


import com.forTUE.SwimmingRaceRegistrationManagement.appService.RegLoginService;
import com.forTUE.SwimmingRaceRegistrationManagement.jpaRepos.UserRepo;
import com.forTUE.SwimmingRaceRegistrationManagement.models.RegUser;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;



    @GetMapping(value = {"/","/home"})
    public String viewHomePage(){
        return "homePage";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "loginPage";
    }

    @GetMapping(value = "/registration")
    public String regForm(Model model) {
        model.addAttribute("user", new RegUser());

        return "regPage";
    }


    @GetMapping(value ="/process_register")
    public String processRegister(Model model, RegUser user) {
        model.addAttribute("user", new RegUser());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "loginPage";
    }

    @PostMapping({"/logout"})
        public String logOut(){
        return "homePage";
    }
}
