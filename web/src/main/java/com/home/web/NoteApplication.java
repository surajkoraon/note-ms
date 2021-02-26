package com.home.web;

import com.home.delegate.AddTaskDelegate;
import com.home.delegate.DemoDelegate;
import com.home.delegate.GetTaskDelegate;
import com.home.service.model.Description;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.home.service.model.Task;


@SpringBootApplication
public class NoteApplication {
    @Bean
    public DemoDelegate demoDelegate()
    {
        return new DemoDelegate();
    }
    @Bean
    public Task getTask()
    {
        return new Task();
    }
    @Bean
    public AddTaskDelegate addTaskDelegate()
    {
        return new AddTaskDelegate();
    }
    @Bean
    public Description description()
    {
        return new Description();
    }
    @Bean
    public GetTaskDelegate getTaskDelegate()
    {
        return new GetTaskDelegate();
    }
    public static void main(String[] args)
    {
        SpringApplication.run(NoteApplication.class);
    }

}
