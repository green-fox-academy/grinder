public class BunniesAgain {
    public static void main(String[] args) {

        //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
        //have the normal 2 ears. The even bunnies (2, 4, ..) we'll
        //say have 3 ears, because they each have a raised foot. Recursively return the
        //number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        System.out.println(function(6));

    }

    public static int function(int bunnies) {
        if (bunnies == 1) {
            return 2;
        }
        if (bunnies % 2 == 0) {
            return 3 + function(bunnies - 1);
        }

        else {
            return 2 + function(bunnies - 1);
        }

    }
}
