package animalProtection;

import java.util.*;

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
        shelter.listOfAimals.add(new Animal("mouse", "mouseOwner", false));

        Adaptor tomas = new Adaptor("Tomas");
        Adaptor martin = new Adaptor("Martin");
        Adaptor olaf = new Adaptor("Olaf");
        shelter.listOfAdaptors.add(tomas);
        shelter.listOfAdaptors.add(martin);
        shelter.listOfAdaptors.add(olaf);

        shelter.addAdopter(tomas);
        shelter.addAdopter(martin);
        shelter.addAdopter(olaf);

        //System.out.println(shelter.listOfAdaptors.size());
        //System.out.println(shelter.listOfAimals.size());
        //System.out.println(shelter.listOfAdaptorAndAnimal.size());

        shelter.findNewOwner();

        //.out.println(shelter.listOfAdaptors.size());
        //System.out.println(shelter.listOfAimals.size());
        //System.out.println(shelter.listOfAdaptorAndAnimal.size());

        System.out.println(shelter.listOfAdaptorAndAnimal.size());
        for (Adaptor adaptor : shelter.listOfAdaptorAndAnimal.keySet()) {
            System.out.println(adaptor.name + " " + shelter.listOfAdaptorAndAnimal.get(adaptor));
        }

        shelter.toString();

    }
}
