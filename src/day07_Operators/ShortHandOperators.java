package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word ="Cydeo";
        System.out.println("word = " + word);

        int num = 100;
        System.out.println("num = " + num);

        num = 200;
        System.out.println("num = " + num);

        num = 300;
        System.out.println("num = " + num);

        System.out.println("---------------------------");

        String name = "Kursad";

        name += "Bal";
        System.out.println("name = " + name);

        double salary = 1050;
        //withdrawing 200
        salary -= 200;

        System.out.println("salary = " + salary);
        //deposit 300
        salary += 300;
        System.out.println("salary = " + salary);

        double einkommen = 2500;
        //a year?
        einkommen *= 12;
        System.out.println("einkommen = " + einkommen);

        //umkehr
        double jahrlichEinkommen = 52000;
        //a month
        jahrlichEinkommen /= 12;
        System.out.println("jahrlichEinkommen = " + jahrlichEinkommen);




    }





}
