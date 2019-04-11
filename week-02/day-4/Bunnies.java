public class Bunnies {
    public static void main(String[] args) {
        //We have a number of bunnies and each bunny has two big floppy ears.
        //We want to compute the total
        //number of ears across all the bunnies recursively (without loops or multiplication).

        System.out.println(function(44, 2));

    }

    public static int function(int bunnies, int ears) {
        if (bunnies == 1) {
            return ears;
        } else
            {
            return ears + function(bunnies - 1 , ears);
        }
    }
}

