package com.kebino;

/**
 * Created by kevin on 06/12/2016.
 */
public class Monster {

    private int level; // <-- referenced using this.level
    private String name; // <-- referenced using this.name

    //Constructor
    public Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
