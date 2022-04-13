package day37_Inheritance.PhoneTask;

public final class Samsung extends Phone{

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(brand + " "+ model + " is calling with "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " "+ model + " is texting with "+ phoneNumber);
    }

    public void freeze(){
        System.out.println(brand +" " + model+ " is freezing");
    }


}
