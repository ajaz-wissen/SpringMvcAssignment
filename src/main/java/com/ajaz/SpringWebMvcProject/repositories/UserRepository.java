package com.ajaz.SpringWebMvcProject.repositories;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    static Map<String, String> users = new HashMap<>();
    public static Map<String, String> getUserRepository(){
        return users;
    }
}
