package com.example.todo.controller;

import com.example.todo.model.User;
import com.example.todo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@AllArgsConstructor
public class PageController {
    private UserService userService;


    @GetMapping("/home")
    public String getAll(Model model){
        model.addAttribute("users", userService.getAllUser());
        return "home";
    }

    @GetMapping("/todo/{id}")
    public String getToDos(@PathVariable("id") int id, Model model) {
    //    model.addAttribute("todos", userService.getToDoByUserId(id));
        return "todo";
    }
}
