package com.kebino;

public class Main {

    public static void main(String[] args) {

        //abstract classes cannot be instantiated by itself
        //

        //Vehicle vehicle = new Vehicle(); <-- nope. Vehicle has no implementation of
        //                                      the abstract method move()


        //it should be instantiated by its child class which has an implementation
        //of its abstract method

        //Car, Ship, and Jet are considered as Vehicle since they extend the Vehicle class
        //they also provide an implementation for the abstract method of the Vehicle class
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Ship();
        Vehicle vehicle3 = new Jet();

        vehicle1.start(); // output: starting engine...
        vehicle1.move(); // output: Move on land

        vehicle2.start(); // output: starting engine...
        vehicle2.move(); // output Move on water

        vehicle3.start(); // output: starting engine...
        vehicle3.move(); //output: Fly

        //Remember that abstract classes cannot be instantiated by itself?
        //well that is not entirely true
        //there is a way to instantiate an abstract class by itself
        //we just need to provide an implementation for its abstract method
        //when we create the object

        Vehicle vehicle4 = new Vehicle() {
            @Override
            public void move() {
                System.out.println("Move through time and space");
            }
        };

        vehicle4.start(); //output: starting engine
        vehicle4.move(); //output: Move through time and space
    }
}
