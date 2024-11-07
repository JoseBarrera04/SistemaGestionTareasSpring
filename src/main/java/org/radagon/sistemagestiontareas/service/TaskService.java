package org.radagon.sistemagestiontareas.service;

import org.radagon.sistemagestiontareas.model.Task;
import org.radagon.sistemagestiontareas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasksByUserId(Long userId) {
        return taskRepository.findByUserId(userId);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}
