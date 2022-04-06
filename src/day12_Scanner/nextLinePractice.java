package day12_Scanner;
import java.util.Scanner;
public class nextLinePractice {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age");
        int age = input.nextInt();

        System.out.println("tel number");
        long number = input.nextLong();

        input.nextLine();
        System.out.println("enter your name");
        String name = input.nextLine();
        input.close();
        System.out.println("number = " + number);
        System.out.println("age = " + age);
        System.out.println("name = "+ name);



    }
}
