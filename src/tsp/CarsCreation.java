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
public class CarsCreation {

    /**
     *
     * @param n
     * @param payload
     * @param cars
     */
    public static void creatCars(int n, int payload, Car cars[]){
        for (int i = 0; i < n; i++) {
            Car car;
            car = new Car(payload);
            cars[i] = car;
        }
    }
}
