package day38_Inheritance.CarTask;

public class ParkingLot {


    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla("Model 3", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "White", 120000);

        tesla.start();
        toyota.start();
        bmw.start();



    }
}
