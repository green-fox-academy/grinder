package mostCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCharacters {
    public static void main(String[] args) {
        String seagull = "Seagull";
        System.out.println(occurence(seagull));

    }

    public static HashMap<Character, Integer> occurence(String seagull) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int occurence = 0;

        for (int i = 0; i < seagull.length(); i++) {
            for (int j = 0; j < seagull.length(); j++) {
                if (seagull.charAt(i) == seagull.charAt(j)) {
                    occurence++;
                }
            }
            hashMap.put(seagull.charAt(i), occurence);
            occurence = 0;

        }
        return hashMap;
    }
}

