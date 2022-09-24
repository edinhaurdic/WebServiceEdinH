package com.example.webserviceedinh.Service;


import com.example.webserviceedinh.Entities.User;
import com.example.webserviceedinh.Repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserService {

    private final WebClient webClient;
    private final UserRepo userRepo;

    public UserService(WebClient webClient, UserRepo userRepo) {
        this.webClient = webClient;
        this.userRepo = userRepo;
    }

    public List<User> findUserById(){
        return userRepo.findAll();
    }

    public User insertUser(User user){
        return userRepo.save(user);
    }



}
