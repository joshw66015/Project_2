package com.company;
import java.util.*;

public class Main {
    /*
    3/1/2019
    Joshua Woodson
     */
    public static Scanner input = new Scanner(System.in);
    public static int maxTasks = 100;
    public static String[] task = new String[maxTasks];
    public static int currentTask = 0;
    public static String[] taskDes = new String[maxTasks];

    public static void main(String[] args) {
        int askTask;
        do {
            System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            askTask = input.nextInt();
            input.nextLine();
            switch (askTask) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    list();
                    break;
                case 0:
                    askTask = 0;
                    break;
            }
        } while (askTask != 0);
    }
    static void add() {
        String newTask;
        System.out.println("What task would you like to add?");
        newTask = input.nextLine();
        System.out.println("description of task?");
        String newTaskDescription = input.nextLine();
        task[currentTask]=newTask;
        taskDes[currentTask]=newTaskDescription;
        currentTask+=1;
    }
    static void remove() {
        System.out.println("What task would you like to remove!");
        int remNum = input.nextInt();
        input.nextLine();
        for(int i = remNum; i<currentTask;i++){
            task[i] = task[i+1];
            taskDes[i]= taskDes[i+1];
        }
        currentTask-=1;
    }
    static void update() {
        System.out.println("What task do you want to update!");
        int Num = input.nextInt();
        input.nextLine();
        System.out.println("What do you want to update it to");
        String newTask = input.nextLine();
        System.out.println("what would you like the new description to be?");
        String newTaskDescription = input.nextLine();
        taskDes[Num]=newTaskDescription;
        task[Num]=newTask;
    }
    static void list() {
        for (int i = 0; i < currentTask; i++) {
            if(task[i]!= null){
                System.out.println(i+") "+task[i]+" "+taskDes[i]);
            }
        }
    }
}

