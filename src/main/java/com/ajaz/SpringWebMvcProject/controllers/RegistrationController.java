package com.ajaz.SpringWebMvcProject.controllers;

import com.ajaz.SpringWebMvcProject.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register")
    public String registerPage(ModelMap modelMap){
        return registrationService.registerPage(modelMap);
    }

    @PostMapping("/register")
    public String registerSuccessPage(ModelMap modelMap, @RequestParam String username, @RequestParam String password){
        return registrationService.registerSuccessPage(modelMap, username, password);
    }
}
