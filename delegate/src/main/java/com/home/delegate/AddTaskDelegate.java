package com.home.delegate;

import com.home.service.model.Description;
import com.home.service.model.Task;

import javax.inject.Inject;
import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class AddTaskDelegate {
    public Task addTask(Task newTask)
    {
        System.out.println("added new user");
        return newTask;
    }

}
