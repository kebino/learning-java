package com.kebino;

/**
 * Created by kevin on 07/12/2016.
 */

// this is also a child of the Enemy class

// a child class can also override the methods
// that it inherited

// it can also add new methods and variables

public class OrcMasterWarrior extends Enemy {

    //overriding a method that was inherited from Enemy class
    @Override
    public void attack() {
        System.out.println("Not so basic attack by master warrior orc!");
    }

    //adding new method
    public void specialBossMove() {
        System.out.println("Health is low... use special boss move!");
    }
}
