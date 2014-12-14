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
import static tsp.TheBestWaySearch.searchTheBestWay;

/**
 *
 * @author Kamila
 */
public class Start {

    public static void Start(String[] args) throws IOException {
        /*int n;
         n = Integer.parseInt(args[0]);
        
         int payload;
         payload = Integer.parseInt(args[1]);*/

        String miasta;
        miasta = args[2];

        String polaczenia;
        polaczenia = args[3];

        String zlecenia;
        zlecenia = args[4];

        List<Town> towns;
        towns = new ArrayList<>();
        
        TasksList taskslist;
        taskslist = new TasksList();
        
        List<Distance> distances;
        distances = new ArrayList<>();

        townsReading(towns, miasta);
        tasksReading(taskslist, zlecenia);
        distancesReading(distances, polaczenia);

        int n = 5;
        int payload = 4;
        Car[] cars = new Car[n];
        
      
               
        
        splitTasks(n, payload, taskslist, cars);
        searchTheBestWay(cars,distances,towns);
        
    }

}
