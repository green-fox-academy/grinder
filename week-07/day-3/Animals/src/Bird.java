public class Bird extends Animal implements Hello {

    public Bird(String name, int age, String color) {
        super(name, age, color);

    }

    @Override
    public void increaseAge() {
        age += 2;
    }

    @Override
    public void hello() {
        System.out.println("i am a " + getName());
    }
}
