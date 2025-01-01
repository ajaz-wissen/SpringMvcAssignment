package com.ajaz.SpringWebMvcProject.controllers;

import com.ajaz.SpringWebMvcProject.repositories.UserRepository;
import com.ajaz.SpringWebMvcProject.services.LoginService;
import com.ajaz.SpringWebMvcProject.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = "/login")
    public String loginUser(ModelMap modelMap){
        return loginService.loginUser(modelMap);
    }

    @PostMapping("/login")
    public String welcomePage(ModelMap modelMap, @RequestParam String username,
                              @RequestParam String password){
       return loginService.welcomePage(modelMap, username, password);
    }
}
