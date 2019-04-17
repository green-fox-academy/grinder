package fleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing getMilk = new Thing("Get milk");
        Thing removeTheObstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        fleet.add(getMilk);
        fleet.add(removeTheObstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);

        standUp.complete();
        eatLunch.complete();


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet.toString());
    }

}
