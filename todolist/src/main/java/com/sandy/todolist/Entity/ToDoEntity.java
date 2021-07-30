package com.sandy.todolist.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private int id;

    @Column(name = "Text")
    private String text;

    @Column(name = "DueDate")
    private Date dueDate;

    @Column(name = "IsComplete")
    private boolean isComplete;

}
