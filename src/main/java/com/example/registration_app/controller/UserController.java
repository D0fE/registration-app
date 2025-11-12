package com.example.registration_app.controller;

import com.example.registration_app.model.User;
import com.example.registration_app.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute User user,
                             BindingResult bindingResult,
                             Model model){
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("message", "Sign up is succesfull");
        return "register";
    }
}
