package Zoo;

public abstract class Animal {

    String name;
    String color;
    int age;
    int hungry = 5;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("sleeping...");
    }

    public abstract void move();

    public void eat() {
        hungry--;
    }
}
