package diceSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DiceSet {
    List<Integer> dice = new ArrayList<>(); //empty list?

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        diceSet.roll();

        while (diceSet.getCurrent(0) != 6) {
            diceSet.reroll(0);
        }
        while (diceSet.getCurrent(1) != 6) {
            diceSet.reroll(1);
        }
        while (diceSet.getCurrent(2) != 6) {
            diceSet.reroll(2);
        }
        while (diceSet.getCurrent(3) != 6) {
            diceSet.reroll(3);
        }
        while (diceSet.getCurrent(4) != 6) {
            diceSet.reroll(4);
        }
        while (diceSet.getCurrent(5) != 6) {
            diceSet.reroll(5);
        }

        System.out.println(diceSet.getCurrent());
    }
}