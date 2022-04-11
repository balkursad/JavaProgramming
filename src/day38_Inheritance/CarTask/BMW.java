package day38_Inheritance.CarTask;

import org.w3c.dom.ls.LSOutput;

public class BMW extends Car{


    public BMW( String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+ model+" "+ " is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model+ " is racing car");
    }

    public void start(){
        System.out.println("Call mechanic to jump start "+ brand+ " "+ model);
    }

}
