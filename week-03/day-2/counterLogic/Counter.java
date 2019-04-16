package counterLogic;

public class Counter {
    int number = 0;
    int originalNumber;

    public Counter() {

    }

    public Counter(int number) {
        this.number = number;
        this.originalNumber = number;
    }

    public int add(int a) {
        number += a;
        return number;
    }

    public void add() {
        number += 1;
    }

    public int get() {
        return number;
    }

    public void reset() {
        number = originalNumber;
    }
}

