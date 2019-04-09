import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {

        HashMap<Integer, Character> map = new HashMap<>();
        System.out.println(map);

        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (Character value : map.values()) {
            System.out.println(value);
        }

        map.put(68, 'D');

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(97);

        System.out.println(map.get(100));

        map.clear();

        System.out.println(map.size());

    }


}
