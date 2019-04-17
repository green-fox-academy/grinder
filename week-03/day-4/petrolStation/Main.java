package petrolStation;

public class Main {
    public static void main(String[] args) {
        Car lightMcQueen = new Car();
        Station benzina = new Station(1000);

        System.out.println(lightMcQueen.gasAmount);
        System.out.println(lightMcQueen.capacity);
        System.out.println(benzina.gasAmount);

        benzina.refillCar(lightMcQueen);

        System.out.println(lightMcQueen.gasAmount);
        System.out.println(lightMcQueen.capacity);
        System.out.println(benzina.gasAmount);










    }
}
