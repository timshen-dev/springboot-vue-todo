package com.example.todoapp.controller;

import com.example.todoapp.entity.Task;
import com.example.todoapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")  // 允许前端跨域请求
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAll() {
        return service.getAllTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        service.addTask(task.getTitle());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTask(id);
    }

    @PutMapping("/{id}/toggle")
    public void toggle(@PathVariable Long id) {
        service.toggleCompleted(id);
    }
}