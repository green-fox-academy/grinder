public class TakesLonger {
    public static void main(String... args){


        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String quote = "Hofstadter's Law: If you expect, even when you take into account Hofstadter's Law.";

        String quote1 = "always takes longer than";
        String quote2 = quote.substring(21);
        String quote3 = quote.substring(0, 20);

        System.out.println(quote3 + quote1 + quote2);

        }


    }


