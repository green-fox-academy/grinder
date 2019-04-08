public class Summing {

// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to
// the given parameter


    public static int sum(int x) {

        int b = 0;
        for (int i = 0; i <= x; i++) {
            b = b + i;
        }
        return b;
    }
        public static void main(String[] args) {
            int d = 5;
            System.out.println(sum(d));
        }
    }
