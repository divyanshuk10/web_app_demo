package com.example.web_app_demo;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

    public boolean validateUser(String username, String password) {
        return username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("pass");
    }
}
