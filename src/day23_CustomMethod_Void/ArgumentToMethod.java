package day23_CustomMethod_Void;

public class ArgumentToMethod {

    public static void main(String[] args) {
        
        EvenOrodd(1989);
        age(1989);
        printNumbers(10,20);

    }
    public static void EvenOrodd(int number){
        if (number%2==0){
            System.out.println(number+" is even");
        }else
            System.out.println(number+" is odd");

    }
    public static void age(int birthDay){
        int age = 2022-birthDay;
        System.out.println(age);
    }
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.print(i+" ");
        }
    }
}
