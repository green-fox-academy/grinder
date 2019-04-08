public class Factorial {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

    public static int factorio(int x) {

        int b = 1;
        for (int i = 1; i <= x; i++) {
            b = b * i;
        }
        return b;
    }
    public static void main(String[] args) {
        int d = 4;
        System.out.println(factorio(d));
    }
}

