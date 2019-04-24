package zoo;

public class Animal {
    String name;
    int hungryLevel;

    public Animal(String name, int hungryLevel) {
        this.name = name;
        this.hungryLevel = hungryLevel;
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + " and has a level of " + hungryLevel + ".");
    }

    public void eatEarthWorm(String worm) {
        hungryLevel -= 6;
        if (hungryLevel < 0) {
            System.out.println("The " + name + " dies.");
        }else {
            System.out.println("OK");
        }
    }
}

