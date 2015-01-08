/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import static tsp.Dijkstra.computePaths;
import static tsp.Dijkstra.getShortestPathTo;

/**
 *
 * @author Kamila
 */
public class TheBestWaySearch {

    /**
     *
     * @param cars
     * @param vertices
     * @param towns
     * @param from
     */
    @SuppressWarnings("empty-statement")
    public static void searchTheBestWay(Car[] cars2, Vertex[] vertices2, List<Town> towns, int from) {
        Vertex[] vertices;
        Car[] cars=cars2;
        int all_distance = 0;
        for (int i = 0; i < cars.length; i++) {
            vertices = vertices2;
            Vertex source;
            System.out.println("Samochód nr " + (i + 1));
            List<Vertex> path = new ArrayList<>();
            List<Vertex> cars_path = new ArrayList<>();
            Task task;
            int tmp=0;
            while (!cars[i].truckload.isEmpty()) {
                
                if (tmp == 0) {
                    source = vertices[from];
                } else {
                    source = cars_path.get(cars_path.size() - 1);

                }
                source.previous=null;
                vertices = vertices2;
                System.out.println("Pobiera paczkę z " + source.name);
                task = cars[i].truckload.poll();
                vertices[task.to].previous = source;
                System.out.println("Zlecenie " + task.name + " do " + towns.get(task.to).name);
                
                computePaths(source);
                System.out.println("Odleglosc " + vertices[task.to].minDistance);
                all_distance=(int) (all_distance+ vertices[task.to].minDistance) ;
                   

                for (Vertex v : vertices) {
                 //System.out.println("Distance to " + v + ": " + v.minDistance);
                 path = getShortestPathTo(vertices[task.to]);
                // 
                 }
                path = getShortestPathTo(vertices[task.to]);
                System.out.println("Path: " + path);
                if(tmp!=0){
                    path.remove(0);
                    
                }
                cars_path.addAll( path);
                
                tmp++;
            }
            System.out.println("Path all: " + cars_path);
            System.out.println("Distance all: " + all_distance);
            //source.previous=source;

            /* vertices=vertices2;
             source=path.get(path.size()-1);
            
             task = cars[i].truckload.poll();
             System.out.println("Zlecenie "+task.name+" do "+towns.get(task.to).name);
             System.out.println("Pobiera paczkę z "+source.name);
             computePaths(source);
             System.out.println("Odleglosc " + vertices[task.to].minDistance);
             vertices[task.to].previous=source;
             for (Vertex v : vertices) {
             System.out.println("Distance to " + v + ": " + v.minDistance);
             path = getShortestPathTo(vertices[task.to]);
             System.out.println("Path: " + path);
             }
            
             path = getShortestPathTo(vertices[task.to]);
             System.out.println("Path all: " + path);
            
             source=path.get(path.size()-1);
             vertices=vertices2;
             task = cars[i].truckload.poll();
             System.out.println("Zlecenie "+task.name+" do "+towns.get(task.to).name);
             System.out.println("Pobiera paczkę z "+source.name);
             computePaths(source);
             System.out.println("Odleglosc " + vertices[task.to].minDistance);
             vertices[task.to].previous=source;
             for (Vertex v : vertices) {
             System.out.println("Distance to " + v + ": " + v.minDistance);
             path = getShortestPathTo(vertices[task.to]);
             System.out.println("Path: " + path);
             }
            
             path = getShortestPathTo(vertices[task.to]);
             System.out.println("Path all: " + path);
             
             List<Vertex> cars_path = new ArrayList<>();
             int n;
             n = cars[i].truckload.size();
             Vertex previous = vertices[from];
             PriorityQueue<Task> tmp = new PriorityQueue<>();;
             PriorityQueue<Task> tmp2 = new PriorityQueue<>();
             tmp = cars[i].truckload;
             tmp2 = tmp;
             int all_distance=0;
             for (int j = 0; j < n; j++) {
             System.out.println("Pobrano paczke z : " + previous.name);

             Task task = tmp.poll();
             // previous=vertices[task.to];
             System.out.println("osttani elem ściezki " + previous.name);
             computePaths(previous);
             System.out.println("Jedzie do  " + vertices[task.to].name + ": " + vertices[task.to].minDistance);
             // System.out.println("previous name  " + previous.name);
             vertices[task.to].previous=previous;
                
             List<Vertex> path = getShortestPathTo(vertices[task.to]);
             System.out.println("Jedzie do  " + vertices[task.to].name + ": " + vertices[task.to].minDistance);

             System.out.println("Path: " + path);
                
             cars_path.addAll(path);
             all_distance=(int) (all_distance+vertices[task.to].minDistance);
             int path_size = path.size();

             previous = path.get(path_size - 1);
                   
             for (int k = 0; k < path_size; k++) {
             while (tmp!=null){
             if (!towns.get(tmp.peek().to).name.equals(path.get(k).name)) {
             tmp2.offer(tmp.peek());
             } 
             System.out.println(towns.get(tmp.peek().to).name+ " "+ path.get(k).name);
             tmp.poll();
             System.out.println("wychodzi z pętli " +tmp.size());
             }
             cars[i].truckload = tmp2;
             tmp = cars[i].truckload;
             tmp2 = tmp;
             }
             n = cars[i].truckload.size();
                 
             }System.out.println("łączna długość " + all_distance);
             System.out.println("Path complete: " + cars_path);

             for (Vertex v : vertices) {
             System.out.println("Distance to " + v + ": " + v.minDistance);
             List<Vertex> path = getShortestPathTo(v);
             System.out.println("Path: " + path);
             }*/
        }

    }
}
