/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamila
 */
public class Node {

    int id;
    List<Element> list;

    public Node() {
       // this.id=0;
        this.list = new ArrayList();
    }
}
