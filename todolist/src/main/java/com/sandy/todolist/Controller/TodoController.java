package com.sandy.todolist.Controller;

import com.sandy.todolist.Entity.Todo;
import com.sandy.todolist.Service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    //get all
    @GetMapping("")
        public List<Todo> getAllTodos() {
        return todoService.getTodoList();
    }

    //get one by id
    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id) {
        return todoService.getTodoById(id);
    }

    //create new todo
    @PostMapping("")
    public Todo createTodo(@RequestBody Todo newTodo) {
        return todoService.createTodo(newTodo);
    }

    //update todo
    @PutMapping("/{id}")
    public void updateTodo(@RequestBody Todo updatedTodo, @PathVariable int id) {
        todoService.updateTodo(id, updatedTodo);
    }

}
