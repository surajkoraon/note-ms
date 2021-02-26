package com.home.delegate;

import com.home.service.model.Description;
import com.home.service.model.Task;

import javax.inject.Inject;
import java.time.LocalDateTime;

public class GetTaskDelegate {
    @Inject
    Task task;
    @Inject
    Description description;
    public Task getTask()
    {
        task.setDate(LocalDateTime.now());
        task.setDescription(description);
        return task;
    }

}
