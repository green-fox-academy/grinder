import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {


// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        Scanner girls = new Scanner(System.in);
        System.out.println("There will be a party and I need to put the number of girls and boys. Put the number of girls.");
        int numberGirls = girls.nextInt();

        Scanner boys = new Scanner(System.in);
        System.out.println("Now put the number of boys and we will see how great the party will be.");
        int numberBoys = boys.nextInt();


        if (numberGirls == numberBoys && numberGirls + numberBoys >= 20) {
            System.out.print("The party is excellent!");
        }

        else if (numberGirls > 0 && numberGirls != numberBoys && numberGirls + numberBoys >= 20) {
            System.out.print("Quite cool party!");
        }

        else if (numberGirls + numberBoys < 20) {
            System.out.print("Average party...");
        }

        else if (numberGirls == 0) {
            System.out.print("Sausage party");
        }







    }
}
