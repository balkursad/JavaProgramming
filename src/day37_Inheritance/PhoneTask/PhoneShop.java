package day37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 500, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456);
        iphone.faceTime(124587);
        iphone.faceTime("h@h.com");

        System.out.println("------------------------");

        samsung.call(1231345);
        samsung.text(45879);
        samsung.freeze();

        System.out.println("-------------------------");

        nokia.call(12548);
        nokia.text(4585236);
        nokia.selfDefense();

    }
}
