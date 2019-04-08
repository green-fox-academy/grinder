import java.util.Scanner;

public class AppendA {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`

    public static void word(String typo) {
        System.out.println("a");
    }

    public static void main (String[] args) {

    String typo = "Chinchill";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write me a word");
        String userInput  = scanner.nextLine();

        System.out.println(userInput);


    }
}

