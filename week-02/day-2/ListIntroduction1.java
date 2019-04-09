import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


        names.add("William");
        names.add("John");
        names.add("Amanda");




        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(2));
        System.out.println("////////");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }

        System.out.println("1. " + names.get(0));
        System.out.println("2. " + names.get(1));
        System.out.println("3. " + names.get(2));



        System.out.println("///////");

        for(int i = names.size()-1; i>=0; i--) {
            System.out.println(names.get(i));

        }
        names.clear();
        System.out.println(names);


    }
}
