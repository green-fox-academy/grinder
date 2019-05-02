package animalProtection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter();

        Cat cat = new Cat("cat", "catOwner", false);
        Dog dog = new Dog("dog", "dogOwner", false);
        Parrot parrot = new Parrot("parrot", "parrotOwner", true);
        shelter.listOfAimals.add(cat);
        shelter.listOfAimals.add(dog);
        shelter.listOfAimals.add(parrot);

        Adaptor tomas = new Adaptor("Tomas");
        Adaptor martin = new Adaptor("Martin");
        Adaptor olaf = new Adaptor("Olaf");
        shelter.listOfAdaptors.add(tomas);
        shelter.listOfAdaptors.add(martin);
        shelter.listOfAdaptors.add(olaf);

        shelter.addAdopter(tomas);
        shelter.addAdopter(martin);
        shelter.addAdopter(olaf);

        System.out.println(shelter.listOfAdaptors.size());
        System.out.println(shelter.listOfAimals.size());
        System.out.println(shelter.adaptorAndAnimal.size());

        shelter.findNewOwner();

        System.out.println(shelter.listOfAdaptors.size());
        System.out.println(shelter.listOfAimals.size());
        System.out.println(shelter.adaptorAndAnimal.size());

        /*for ( i : shelter.adaptorAndAnimal.keySet()) {
            System.out.println();
        }*/

        shelter.toStringShelter();

    }
}
