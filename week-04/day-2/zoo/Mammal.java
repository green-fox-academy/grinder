package zoo;

public class Mammal extends Animal implements Eatable {
    public Mammal(String name, int hungryLevel) {
        super(name, hungryLevel);
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm a mammal.");
    }

    public void eatEarthWorm(String worm) {
        hungryLevel -= 6;
        if (hungryLevel < 0) {
            System.out.println("The " + name + " dies.");
        } else {
            System.out.println("OK");
        }

    }
}
