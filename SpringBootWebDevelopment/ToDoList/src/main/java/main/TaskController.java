package main;

import main.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import main.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks/")
    public List<Task> getAllTasks() {
        Iterable<Task> taskIterable = taskRepository.findAll();
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task task : taskIterable) {
            tasks.add(task);
        }
        return tasks;
    }

    @PostMapping(value = "/tasks/", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        taskRepository.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable int id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return new ResponseEntity<>(optionalTask.get(), HttpStatus.OK);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Task> deleteTaskById(@PathVariable int id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PatchMapping(value = "/tasks/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable int id) {
        Optional<Task> taskUpdate = taskRepository.findById(id);
        if (taskUpdate.isPresent()) {
            taskUpdate.get().setId(id);
            taskUpdate.get().setTitle(task.getTitle());
            taskUpdate.get().setDescription(task.getDescription());
            taskUpdate.get().setDone(task.isDone());
            taskUpdate.get().setCreationTime(task.getCreationTime());
            taskRepository.save(taskUpdate.get());
            return ResponseEntity.status(HttpStatus.OK).body(taskUpdate.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(task);
        }
    }
}
