import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {

        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        writeLine(name);

    }

    public static void writeLine(String name) {
        ArrayList<String > content = new ArrayList<>();
        content.add(name);

        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);
        }
        catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
