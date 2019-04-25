import java.util.ArrayList;
import java.util.List;

public class Apple {

    String name;
    List<Integer> list;

    public Apple(String name) {
        this.name = name;
    }

    public Apple(List<Integer> list) {
        this.list = new ArrayList<>();
    }

    public String getApple() {
        String apple = name;
        return apple;
    }

    public int sum(List<Integer> list) {
        int total = 0;
        for (int x : list) {
            total += x;
        }
        return total;
    }
}