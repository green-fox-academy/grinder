import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countLetters_inputString_returnHashmap() {

        CountLetters countLetters = new CountLetters();
        String text = "greenfoxacademy";
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('e', 3);
        assertEquals(hashMap, countLetters.countLetters(text));
    }
}
