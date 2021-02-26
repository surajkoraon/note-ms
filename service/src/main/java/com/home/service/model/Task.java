package com.home.service.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Task {
    public String name="suraj kumar oraon";
    public String id="task_1";
    public Description description;
    public LocalDateTime date=LocalDateTime.now();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
