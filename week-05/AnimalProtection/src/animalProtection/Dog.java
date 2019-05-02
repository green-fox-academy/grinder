package animalProtection;

public class Dog extends Animal {

    public Dog(String name, String ownerName, boolean isHealthy) {
        super(name, ownerName, isHealthy);
        healCost = (int)(Math.random() * 2 + 7);
    }
}
