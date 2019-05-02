package animalProtection;

import java.util.Random;

public class Animal {

    String name;
    String ownerName;
    boolean isHealthy;
    int healCost;

    public Animal(String name, String ownerName, boolean isHealthy) {
        this.name = name;
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;

    }

    public void heal() {
        isHealthy = true;
    }

    public boolean isAdoptable() { //how to make a boolean
        if (isHealthy == true) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (isHealthy == true) {
            return (name + " is healthy, and adoptable");
        }
        else return (name + " is not healthy (" + healCost + "$), and not adoptable");
    }
}
