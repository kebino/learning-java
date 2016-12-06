package com.kebino;

/**
 * Created by kevin on 07/12/2016.
 */
public class Car extends Vehicle {

    //classes that extends an abstract class
    //needs to implement the abstract methods
    @Override
    public void move() {
        System.out.println("Move on land");
    }
}
