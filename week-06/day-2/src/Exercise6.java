import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        //Write a Stream Expression to find the uppercase characters in a string!

        String greenfox = "GrEEnFoX"
                .chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .collect(Collectors.joining());
        System.out.println(greenfox);
    }
}
