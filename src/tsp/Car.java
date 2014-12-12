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
public class Car {
    int payload;
    Task[] truckload= new Task[payload];
    
    public Car(int payload){
            this.payload=payload;
            this.truckload=new Task[payload];
    }
}
