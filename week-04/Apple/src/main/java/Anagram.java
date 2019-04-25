import java.util.Arrays;

public class Anagram {

    public boolean anagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();
        char arrayFirst[] = first.toCharArray();
        char arraySecond[] = second.toCharArray();

        Arrays.sort(arrayFirst);
        Arrays.sort(arraySecond);

        return Arrays.equals(arrayFirst, arraySecond);
    }
}
