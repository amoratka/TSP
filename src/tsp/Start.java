/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static tsp.FileReading.DistancesReading;
import static tsp.FileReading.TasksReading;
import static tsp.FileReading.TownsReading;

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
        //PriorityQueue <Task> tasks;
        //tasks=new PriorityQueue<>();
        List<Distance> distances;
        distances = new ArrayList<>();
        TownsReading(towns);
        TasksReading(taskslist);
        DistancesReading(distances);
       
    }

}
