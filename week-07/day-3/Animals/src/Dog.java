public class Dog extends Animal implements Hello {

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void hello() {
        System.out.println("i am a " + getName());
    }
}
