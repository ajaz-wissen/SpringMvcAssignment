package com.ajaz.SpringWebMvcProject.services;

import com.ajaz.SpringWebMvcProject.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
public class RegistrationService {

    public String registerPage(ModelMap modelMap){
        return "register";
    }

    public String registerSuccessPage(ModelMap modelMap, String username, String password) {
        Map<String, String> users = UserRepository.getUserRepository();
        if(users.containsKey(username)){
            System.out.println("Username already exists.");
            modelMap.put("UsernameExistsError", "Username " + username + " already exists. Please use a different one.");
            return "register";
        }

        users.put(username, password);

        System.out.println("username: " + username + " and password: " + password);

        modelMap.put("username", username);
        return "register_success";
    }
}
