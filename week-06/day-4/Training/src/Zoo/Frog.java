package Zoo;

public class Frog extends Animal {

    public Frog(String name, String color, int age) {
        super(name, color, age);
    }

    public void move() {
        System.out.println("frog is jumping");
    }
}
