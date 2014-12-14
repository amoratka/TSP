/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import static tsp.CarsCreation.creatCars;

/**
 *
 * @author Kamila
 */
public class TasksSplit {

    /**
     *
     * @param n
     * @param payload
     * @param taskslist
     * @param cars
     */
    public static void splitTasks(int n, int payload, TasksList taskslist, Car[] cars) {
        creatCars(n, payload, cars);
        boolean isEmpty = false;
        for (int i = 0; i < cars[i].payload; i++) {
            for (int j = 0; j < n; j++) {
                if (taskslist.tasks.peek() != null) {
                    System.out.println("i: " + i + " j: " + j);
                    cars[j].truckload.offer( taskslist.tasks.poll());

                } else {
                    isEmpty = true;
                    break;
                }
                // System.out.println("id "+cars[j].truckload[i].id+" priorytet "+cars[j].truckload[i].priority);
            }
            if (isEmpty == true) {
                break;
            }
        }

    }
}
