package com.example.todo.repo;

import com.example.todo.model.ToDo;
import com.example.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ToDoRepo extends JpaRepository<ToDo,Long> {

}
