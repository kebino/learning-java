package com.kebino;

/**
 * Created by kevin on 07/12/2016.
 */
public abstract class Vehicle {

    //constructor
    public Vehicle(){

    }

    public void start(){
        System.out.println("starting engine...");
    }

    //an abstract method
    //will be implemented by child classes
    public abstract void move();
}
