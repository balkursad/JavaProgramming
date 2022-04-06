package day12_Scanner;
import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {

String fullName, StreetName, cityName, state;
int buildingNumber, zipcode;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name : ");
        fullName = scan.nextLine();
        System.out.println("Enter your building number :");
        buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street name :");
        StreetName = scan.nextLine();
        System.out.println("Enter your city name : ");
        cityName = scan.nextLine();
        System.out.println("Enter your state :");
        state= scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        scan.close();


        System.out.println(fullName+"\n"+StreetName+" "+buildingNumber+", "+cityName+"\n"+state+", "+zipcode);
    }

}
