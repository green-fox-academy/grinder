package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    /*List<Animal> oldAnimals;

    public Zoo() {
        oldAnimals = new ArrayList<>();
    }*/

    List<Eatable> animals;

    public Zoo() {
        animals = new ArrayList<>();
        animals.add(new Bird("Seagull", 5));
        animals.add(new Mammal("Bear", 6));
        animals.add(new Reptile("Snake", 1));
    }

    public void feed() {
        for (Eatable animal : animals) {
            animal.eat("banana");
        }
    }

        public void feedDie() {
            for (Eatable animal : animals) {
                animal.eatEarthWorm("Earthworm");
            }
        }
}

