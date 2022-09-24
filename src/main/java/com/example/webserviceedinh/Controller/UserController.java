package com.example.webserviceedinh.Controller;

import com.example.webserviceedinh.Entities.User;
import com.example.webserviceedinh.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findUserById(){
        return userService.findUserById();
    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }
}
