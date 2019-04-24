package zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZooAplication {
    public static void main(String[] args) {

        /*Zoo zoo = new Zoo();
        Bird seagull = new Bird("Seagull", 5);
        Mammal bear = new Mammal("Bear", 3);
        Reptile snake = new Reptile("Snake", 1);
        zoo.oldAnimals.add(seagull);
        zoo.oldAnimals.add(bear);
        zoo.oldAnimals.add(snake);

        seagull.eat("banana");
        bear.eat("fish");
        snake.eat("mouse");*/

        Zoo zoo = new Zoo();
        zoo.feed();
        zoo.feedDie();
    }
}
