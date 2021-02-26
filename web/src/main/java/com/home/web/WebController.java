package com.home.web;

import com.home.delegate.AddTaskDelegate;
import com.home.delegate.DemoDelegate;
import com.home.delegate.GetTaskDelegate;
import com.home.service.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class WebController {
    @Inject
    DemoDelegate demoDelegate;
    @Inject
    AddTaskDelegate addTaskDelegate;
    @Inject
    GetTaskDelegate getTaskDelegate;
    @GetMapping("/demo")
    public String demo()
    {
        return demoDelegate.helper();
    }
    @GetMapping("/gettask")
    public Task getTask()
    {
        return getTaskDelegate.getTask();
    }
    @PostMapping("/addtask")
    public Task addTask(@RequestBody Task task)
    {
        return addTaskDelegate.addTask(task);
    }
}
