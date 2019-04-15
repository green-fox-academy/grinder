public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        try {
            System.out.println(function(0));
        }
        catch (Exception e) {
            System.out.println("Can't divide by zero!");
        }

    }

    public static int function(int x) {
        return 10 / x;
    }

}
