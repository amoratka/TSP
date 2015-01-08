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
class Edge {

    public final Vertex target;
    public final double weight;

    public Edge(Vertex argTarget, double argWeight) {
        target = argTarget;
        weight = argWeight;
    }

    /* public void edge ( Edge[] edge, Distance[] distances, List <Town> towns){
     for( int i = 0; i<distances.length; i++){
     edge[i].target =new Vertex(towns.get(distances[i].adjacencies.get(i).to).name);
     edge[i].weight
     }
     }*/
}
