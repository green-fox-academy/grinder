package file;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static void main(String[] args) {
        String filename = "Text.txt";
        String content = "Hello World!";
        List<String> list = new ArrayList<>();
        list.add(content);
        list.add("Guten Morgen");

        try {
            Path path = Paths.get(filename);
            Files.write(path, list);
        } catch (Exception e) {
            System.out.println("fuck you");
        }
        readAllLines(list);

    }
    public static void readAllLines(List<String> listOfLines) {
        for (String i : listOfLines) {
            if (listOfLines.get(0) == "hello") {
                System.out.println(i);
            }else {
                System.out.println("fuck you");
            }
        }
    }
}
