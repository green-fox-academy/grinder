public class GreaterCommonDivisor {
    public static void main(String[] args) {
        //Find the greatest common divisor of two numbers using recursion.

        System.out.println(divisor(54, 90));
    }

    public static int divisor(int a, int b) {
        if (b == 0) return a;
        return divisor(b, a % b);
    }
}
