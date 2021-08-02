import { Component, OnInit } from '@angular/core';
import {Todo} from '../../models/todo.model';
import {TodoService} from '../../services/todo.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {
  todos: Todo[] = [];

  constructor(
    private todoService: TodoService
  ) { }

  ngOnInit(): void {
    this.todoService.getTodos().subscribe(todoList => {
      this.todos = todoList;
    })
  }

}
