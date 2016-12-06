package com.kebino;

public class Main {

    public static void main(String[] args) {
    	//create the objects
	    Enemy enemy = new Enemy();
	    OrcLowLife orcLowLife = new OrcLowLife();
	    OrcMasterWarrior orcMasterWarrior = new OrcMasterWarrior();

	    //use the attack method
	    enemy.attack();
	    orcLowLife.attack();
	    orcMasterWarrior.attack();

	    //method add in the child class
	    orcMasterWarrior.specialBossMove();
    }
}
