package com.example.todoapp.service;

import com.example.todoapp.entity.Task;
import com.example.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public void addTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    public void toggleCompleted(Long id) {
        Task task = repository.findById(id).orElse(null);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            repository.save(task);
        }
    }
}