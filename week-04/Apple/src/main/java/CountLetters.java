import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public HashMap<Character, Integer> countLetters(String name) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        char arrayName[] = name.toCharArray();
        for (char c : arrayName) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else {
                hashMap.put(c, 1);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        int biggest = 0;
        char c = 'x';
        for (Map.Entry<Character, Integer> most : hashMap.entrySet()) {
            if (most.getValue() > biggest) {
                biggest = most.getValue();
                c = most.getKey();
            }
        }
        HashMap<Character, Integer> newHashmap = new HashMap();
        newHashmap.put(c, biggest);
        return newHashmap;
    }
}
