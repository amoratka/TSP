/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

/**
 *
 * @author Kamila
 */
public class Task implements Comparable <Task> {

    int id;
    int to;
    String name;
    int priority;

    @Override
    public int compareTo(Task t) {
        return -(this.priority-t.priority);
    }



}
