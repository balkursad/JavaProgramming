package day05_Concatenaton;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Kursad Bal";
        int buildingnumber = 159;
        String streetName = "Binger Str";
        String city = "Ingelheim";
        String state = "Rheinland-Phalz";
        int zipcode = 55218;

        // System.out.println(name + " is living "+ streetName + " "+ buildingnumber +  " "+city+" "+state+" "+zipcode);
        String address = name + "\n" + streetName + " " + buildingnumber +" " +city+ "\n" +state+ " "+ zipcode;
        System.out.println(address);


    }





}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address

 */