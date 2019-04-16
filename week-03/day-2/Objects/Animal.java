package Objects;

public class Animal {

    String name;
    int hunger = 50;
    int thirst = 50;

public Animal(String name) {
    this.name = name;
}

public String introduce(){
    String whichAnimal = "Hi, I am a " + name + " and my hungry is " + hunger + " and my thirst is " + thirst;
    return whichAnimal;
}

public void eat(){
    hunger -= 1;
}

public void drink(){
    thirst -= 1;
}

public void play(){
    hunger += 1;
    thirst += 1;
}

}


