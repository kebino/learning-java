package com.kebino;

public class Main {

    public static void main(String[] args) {
        //Polymorphism

        //Normally this is what we do when we
        //create an object
        Pet pet = new Pet();

        //Polymorphism is when we create an instance of
        //of a class using its child class

        //example 1:
        //create a Pet object using an instance of
        //Dog class
        //Dog is considered a Pet since it extends Pet
        Pet pet2 = new Dog();

        //if we execute the method speak
        pet.speak(); //output will be Generic pet sound!
        pet2.speak(); //output will be Bark!

        //example 2:
        //lets create an array of Pet
        Pet[] pets = new Pet[4];

        pets[0] = new Dog(); // Dog class is considered a Pet since it extends Pet class
        pets[1] = new Cat(); // Cat class is considered a Pet since it extends Pet class
        pets[2] = new Mouse(); // Mouse class is considered a Pet since it extends Pet class
        pets[3] = new Pet(); // Create an instance of Pet

        for(int x = 0; x < pets.length; x++) {
            pets[x].speak();
        }
    }
}
