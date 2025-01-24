package com.Mahmood.airline_booking_system.controller;



import com.Mahmood.airline_booking_system.model.User;
import com.Mahmood.airline_booking_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String phoneNumber) {
        return userService.registerUser(username, password, email, phoneNumber);
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "Login successful!";
        }
        return "Invalid credentials!";
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam Long userId, @RequestParam String email, @RequestParam String phoneNumber) {
        return userService.updateUser(userId, email, phoneNumber);
    }
}

