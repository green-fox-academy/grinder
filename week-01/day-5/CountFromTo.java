import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Put the first number");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Put the second number");
        int number2 = scanner2.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger");
        }
        else
            for (int i = number1; i < number2; i++) {
                System.out.println(i);
            }










    }
}

