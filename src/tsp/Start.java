/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static tsp.FileReading.distancesReading;
import static tsp.FileReading.tasksReading;
import static tsp.FileReading.townsReading;
import static tsp.TasksSplit.splitTasks;

/**
 *
 * @author Kamila
 */
public class Start {

    public static void Start() throws IOException {
        List<Town> towns;
        towns = new ArrayList<>();
        TasksList taskslist;
        taskslist = new TasksList();
        List<Distance> distances;
        distances = new ArrayList<>();
        townsReading(towns);
        tasksReading(taskslist);
        distancesReading(distances);
        int n = 5;
        int payload = 4;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            Car car = new Car(payload);
            cars[i] = car;
        }
        splitTasks(n,payload,taskslist,cars);

    }

}
