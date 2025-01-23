package com.example.web_app_demo.mvc;

import com.example.web_app_demo.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UserValidationService validationService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleUserLogin(ModelMap model, @RequestParam String name,
                                  @RequestParam String password) {
        boolean isValid = validationService.validateUser(name, password);
        model.put("password", password);
        model.put("name", name);
        if (isValid) {
            return "welcome";
        }

        model.put("errorMessage", "Invalid Credentials");
        return "login";
    }


}
