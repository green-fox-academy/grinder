import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("store.txt");
        List<String> content = new ArrayList<>();
        content = Files.readAllLines(file);


        if (args.length == 0) {
            System.out.println("Command Line ToDo application\n");
            System.out.println("=============================");
            System.out.println();
            System.out.println();
            System.out.println("Command line arguments:");
            System.out.println(" -l\tLists all the tasks");
            System.out.println(" -a\tAdds a new task");
            System.out.println(" -r\tRemove a task");
            System.out.println(" -c\tCompletes a task");
        } else if (args[0].equals("l")) {

            for (int row = 0; row < content.size(); row++) {
                if (content.size() != 0) {
                    System.out.println((row + 1) + " -  " + content.get(row));
                } else {
                    System.out.println("No todos for today! :)");
                }
            }

        } else if (args[0].equals("a")) {
            Path filePath = Paths.get("store.txt");
            content.add(args[1]);
            Files.write(filePath, content);
            for (int row = 0; row < content.size(); row++) {
                System.out.println((row + 1) + " -  " + content.get(row));

            }
        } else if (args[0].equals("r")) {
            Path filePath = Paths.get("store.txt");
            for (String row : content) {
                content.remove(0);
            }
        }
    }
}
