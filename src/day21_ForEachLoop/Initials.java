package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimt", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna"};

        for (String each : names) {
            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }




    }
}