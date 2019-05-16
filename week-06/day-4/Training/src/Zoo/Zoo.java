package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("dog", "black", 3);
        Frog frog = new Frog("frog", "green", 2);
        Dog dog2 = new Dog("dog2", "brown", 20);
        Frog frog2 = new Frog("frog2", "yellow", 4);

        animals.add(dog);
        animals.add(frog);
        animals.add(dog2);
        animals.add(frog2);

        int oldestAnimal = 0;
        int youngestAnimal = 100;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).age > oldestAnimal) {
                oldestAnimal = animals.get(i).age;
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).age < youngestAnimal) {
                youngestAnimal = animals.get(i).age;
            }
        }
        System.out.println((oldestAnimal + youngestAnimal) / 2);
    }
}
