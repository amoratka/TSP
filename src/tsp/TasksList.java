/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.PriorityQueue;

/**
 *
 * @author Kamila
 */
public class TasksList {
    int from;
    PriorityQueue <Task> tasks;

    public TasksList() {
        this.tasks = new PriorityQueue <>();
    }
       
}
