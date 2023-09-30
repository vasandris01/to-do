package com.example.todo.service;

import com.example.todo.model.User;
import com.example.todo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
