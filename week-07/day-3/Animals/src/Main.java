import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("dog", 1, "black");

        System.out.println(animal.getAge());
        animal.setAge(2);
        System.out.println(animal.getName() + " is " + animal.getAge());

        Bird bird = new Bird("pitu", 3, "yellow");

        animal.increaseAge();
        System.out.println(animal.getName() + " is " + animal.getAge());

        animal.increaseAge();
        bird.increaseAge();
        System.out.println(bird.age);

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(animal);
        listOfAnimals.add(bird);
        listOfAnimals.add(new Bird("pacito", 2, "green"));


        List<Animal> newList = listOfAnimals
                .stream()
                .filter(a -> a.getName().equals("pacito"))
                .collect(Collectors.toList());
        System.out.println(newList);

        Hello hello = new Hello() {

            @Override
            public void hello() {

            }
        };

        hello.hello();
    }
}

