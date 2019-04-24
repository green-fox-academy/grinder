package zoo;

public class Bird extends Animal implements Eatable {
    public Bird(String name, int hungryLevel) {
        super(name, hungryLevel);
    }

    @Override
    public void eat(String food) {
        hungryLevel -= 1;
        System.out.println(name + " eats " + food + " and has a level of " + hungryLevel + ".");
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
