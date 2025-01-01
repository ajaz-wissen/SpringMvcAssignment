package com.ajaz.SpringWebMvcProject.services;

import com.ajaz.SpringWebMvcProject.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Map;

@Service
public class LoginService {

    public String loginUser(ModelMap modelMap){
        return "login";
    }

    public String welcomePage(ModelMap modelMap, String username, String password){
        Map<String, String> users = UserRepository.getUserRepository();
        if(users.containsKey(username) && users.get(username).equals(password)){
            modelMap.put("username", username);

            return "welcome";
        }

        modelMap.put("errorMsg", "Please provide correct credentials.");
        return "login";
    }
}
