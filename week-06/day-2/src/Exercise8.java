import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        //Write a Stream Expression to concatenate a Character list to a string!

        String dog = "dog";
        List<Character> list = Arrays.asList('h', 'o', 't');

        String concatToString = list
                .stream()
                .map(c -> Character.toString((char)c))
                .collect(Collectors.joining());

        System.out.println(dog.concat(concatToString));
        System.out.println(concatToString.concat(dog));
    }
}
