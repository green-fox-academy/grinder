package animalProtection;

public class Cat extends Animal {

    public Cat(String name, String ownerName, boolean isHealthy) {
        super(name, ownerName, isHealthy);
        healCost = (int)(Math.random() * 7);

    }


}
