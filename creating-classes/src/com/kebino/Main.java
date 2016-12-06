package com.kebino;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //create instance of Monster
        Monster rattata = new Monster("Rattata", 5);
        Monster pidgey = new Monster("Pidgey", 3);
        Monster caterpie = new Monster("Caterpie", 4);

        //create a list of monsters
        List<Monster> monsterList = new ArrayList<Monster>();

        //add the instances of monsters to the list
        monsterList.add(rattata);
        monsterList.add(pidgey);
        monsterList.add(caterpie);

//        ---------------------------------------------
//         equivalent of monsterList if it was an array
//        ---------------------------------------------
//        Monster[] monsterArray = new Monster[3];
//        monsterArray[0] = rattata;
//        monsterArray[1] = pidgey;
//        monsterArray[2] = caterpie;
//        ---------------------------------------------

        //enhanced for loop
        for(Monster m : monsterList) {
            wildEnemyAppears(m);
        }

        //classic for loop
        for(int x = 0; x < monsterList.size(); x++) {
            wildEnemyAppears(monsterList.get(x));
        }
    }

    static void wildEnemyAppears(Monster monster) {
        System.out.println("Level " + monster.getLevel() + " " + monster.getName() + " wants to battle!");
    }
}
