import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {

        //Write a Stream Expression to find the frequency of characters in a given string!

        String string = "greenfoxAcademy";
        Map<Character, Long> frequency = string
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                //.collect(Collectors.groupingBy(Character::valueOf, Collectors.counting()));

        System.out.println(frequency);
    }
}
