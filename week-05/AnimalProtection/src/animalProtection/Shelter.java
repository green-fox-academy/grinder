package animalProtection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class Shelter {

    int budget = 50;
    List<Animal> listOfAimals = new ArrayList<>();
    List<Adaptor> listOfAdaptors = new ArrayList<>();
    List<Adaptor> listOfPotentionalNewOwners = new ArrayList<>();
    HashMap<Adaptor, Animal> listOfAdaptorAndAnimal = new HashMap();

    public Shelter() {

    }

    public int rescue (Animal animal) {
        listOfAimals.add(animal);
        return listOfAimals.size();
    }

    public void heal() {
        int numberOfNotHealthyAnimals = 0;
        for (int i = 0; i < listOfAimals.size(); i++) {
            if (listOfAimals.get(i).isHealthy == false) {
                numberOfNotHealthyAnimals += 1;
            }
        }System.out.println(numberOfNotHealthyAnimals);
    }

    public void addAdopter(Adaptor name) {
        listOfPotentionalNewOwners.add(name);
    }

    public void findNewOwner() {
        int randomAdaptorIndex = (new Random()).nextInt(listOfAdaptors.size());
        Adaptor randomAdaptor = listOfAdaptors.get(randomAdaptorIndex);
        int randomAnimalIndex = (new Random()).nextInt(listOfAimals.size());
        Animal randomAnimal = listOfAimals.get(randomAnimalIndex);

        listOfAdaptorAndAnimal.put(randomAdaptor, randomAnimal);
        listOfAdaptors.remove(randomAdaptor);
        listOfAimals.remove(randomAnimal);
    }
    public int earnDonation(int donation) {
        budget += donation;
        return budget;
    }
    public String toString() {
        for (Animal i : listOfAimals) {
            if (i.isHealthy != true) {
                return (i.name + " is not healthy (" + i.healCost + "$), and not adoptable");
            }
        }
        return ("Budget: " + budget + "$,\nThere are " + listOfAimals.size() + " animal(s) and " +
                listOfPotentionalNewOwners.size() + " potential adopter(s)");
    }

}
