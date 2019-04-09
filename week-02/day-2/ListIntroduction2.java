import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>(Arrays.asList(
                "Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        ArrayList<String> ListB = new ArrayList<>(ListA);

        System.out.println(ListB);

        System.out.println(ListA.contains("Durian"));

        ListB.remove("Durian");
        System.out.println(ListB);

        ListA.add(4, "Kiwifruit");
        System.out.println(ListA);

        boolean isEqual = ListA.equals(ListB);
        System.out.println(isEqual);

        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Passion Fruit");
        newList.add("Pummelo");

        ListB.addAll(newList);
        System.out.println(ListB);

    }
}

