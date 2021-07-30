package com.sandy.todolist.Service;

import com.sandy.todolist.Entity.Todo;
import com.sandy.todolist.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    //to populate the main list
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    //to populate the form
    public Todo getTodoById(int id) {
        return todoRepository.getById(id);
    }

    public Todo createTodo(Todo newTodo) {
        return todoRepository.save(newTodo);
    }

//    //triggered by toggle, crosses out
//    public void toggleTodoStatus(int id) {
//        Todo currentTodo = todoRepository.getById(id);
//        boolean currentStatus = currentTodo.isComplete();
//        currentTodo.setComplete(!currentStatus);
//    }

    //more elaborate updating through a form
    public void updateTodo(int id, Todo updatedTodo) {
        Todo currentTodo = todoRepository.getById(id);
        currentTodo.setText(updatedTodo.getText());
        currentTodo.setDueDate(updatedTodo.getDueDate());
        currentTodo.setComplete(updatedTodo.isComplete());
    }
}
