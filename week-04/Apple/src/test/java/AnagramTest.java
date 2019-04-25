import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagram_compareTwoWords_returnTrue() {
        Anagram anagram = new Anagram();
        String one = "world";
        String two = "dlorw";
        assertEquals(true, anagram.anagram(one, two));
    }
}
