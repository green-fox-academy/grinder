package animalProtection;

public class Parrot extends Animal {

    public Parrot (String name, String ownerName, boolean isHealthy) {
        super(name, ownerName, isHealthy);
        healCost = (int)(Math.random() * 5 + 6);
    }
}
