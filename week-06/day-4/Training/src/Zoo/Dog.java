package Zoo;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void move() {
        System.out.println("dog is running");
    }
}
