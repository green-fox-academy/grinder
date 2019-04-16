package Objects;

import counterLogic.Counter;

public class Main {
    public static void main(String[] args) {

        PostIt first = new PostIt("orange", "blue", "Idea 1");
        System.out.println(first.firstSentence());

        BlogPost firstTitle = new BlogPost("John Doe", "Lorem Ipsum", "posted at", "12.08.2012");
        System.out.println(firstTitle.samples());

        Animal dog = new Animal("dog");
        System.out.println(dog.introduce());
        dog.eat();
        System.out.println(dog.introduce());
        dog.drink();
        System.out.println(dog.introduce());
        dog.play();
        System.out.println(dog.introduce());

        Sharpie newOne = new Sharpie("green", 500);
        newOne.use();
        System.out.println(newOne.function());

        Counter counter1 = new Counter(5);
        System.out.println(counter1.get());
        counter1.add(5);
        counter1.get();
        System.out.println(counter1.get());
        counter1.add(5);
        System.out.println(counter1.get());
        counter1.reset();
        System.out.println(counter1.get());






    }
}
