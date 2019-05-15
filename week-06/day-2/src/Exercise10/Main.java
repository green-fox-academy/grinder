package Exercise10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
        //
        //Write a Stream Expression to find the foxes with green color!
        //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        //Write a Stream Expression to find the frequency of foxes by color!

        List<Fox> foxes = Arrays.asList(new Fox("tomas", "green", 22),
                                        new Fox("albert", "blue", 11),
                                        new Fox("martin", "yellow", 55),
                                        new Fox("adam", "greeb", 3),
                                        new Fox("gustav", "red", 1));

        List<String> greenFoxes = foxes
                .stream()
                .filter(fox -> fox.getColor())
                .collect(Collectors.toList());

    }
}
