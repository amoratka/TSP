/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.List;

/**
 *
 * @author Kamila
 */
public class TheBestWaySearch {

    /**
     *
     * @param cars
     * @param distances
     * @param towns
     */
    public static void searchTheBestWay(Car[] cars, List<Distance> distances, List<Town> towns) {
        //System.out.println(towns.get(0).name + " " + towns.get(0).id + " " + towns.size());
        int n = towns.size();
        Node[] graph;
        graph = new Node[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new Node();
        }
        for (int i = 0; i < n; i++) {
            graph[i].id = towns.get(i).id;
            for (int j = 0; j < distances.size(); j++) {
                if (distances.get(j).from == graph[i].id) {
                    Element element;
                    element = new Element();
                    element.to = distances.get(j).to;
                    element.distance = distances.get(j).distance;
                    graph[i].list.add(element);

                }//sprawdzenie póxniej czy listy elemntów nie są puste
            }

        }
        /*  for (int j = 0; j <graph.length; j++) {
         System.out.println("skad"+graph[j].id);
         for (int i = 0; i < graph[j].list.size(); i++) {
         System.out.print(graph[j].list.get(i).to + " " + graph[j].list.get(i).distance + " ");
         }
         System.out.println();
         }*/
    }
}
