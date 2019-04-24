package zoo;

public class Reptile extends Animal implements Eatable {

    public Reptile(String name, int hungryLevel) {
        super(name, hungryLevel);
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm a reptile and also a " + name + ".");
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
