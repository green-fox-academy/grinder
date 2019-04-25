import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getApple_returnName_equalsGivenName() {
        Apple appleGreen = new Apple("Green apple");

        assertEquals("Green apple", appleGreen.getApple());
    }

    @Test
    public void sum_returnSum_equalsSum() {
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);

        Apple apple = new Apple(list);

        int result = apple.sum(list);

        assertEquals(12, result);*/

        List<Integer> listEmpty = new ArrayList<>();
        listEmpty.add(1);

        Apple apple2 = new Apple(listEmpty);

        int result2 = apple2.sum(listEmpty);

        assertEquals(1, result2);
    }
}
