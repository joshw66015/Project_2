package com.company;

import java.util.ArrayList;

public class Task {
    public String taskName;
    public String taskDescription;
    public int taskPriority;
    public int id;

    public Task(String taskName, String taskDescription, int taskPriority) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTaskName() {
        return taskName;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public int getTaskPriority() {
        return taskPriority;
    }
}