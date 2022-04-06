package day27_WrapperClasses;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "Kud!2";
        char[] pass = password.toCharArray();
        if (pass.length<8){
            System.out.println("Invalid");
            System.exit(0);
        }
        int count = 0;
        int count1 =0 ;
        int count2 =0;
        int count3 =0;
        for (char each: pass) {
            if (each == ' '){
                System.out.println("Invalid");
                System.exit(0);
            }
            if (Character.isDigit(each)){
                count++;
            }
            if (Character.isLowerCase(each)){
                count1++;
            }
            if (Character.isUpperCase(each)){
                count2++;
            }
            if (Character.isLetterOrDigit(each)){
                count3++;
            }



        }
        if (count==0||count1==0||count2==0||count3==0){
            System.out.println("Invalid.");
        }else
            System.out.println("valid");




    }
}
