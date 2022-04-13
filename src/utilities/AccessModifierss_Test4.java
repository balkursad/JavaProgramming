package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierss_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      //  System.out.println(ProtectedAccessModifier.name1);  //default not visible outside the package
        System.out.println(ProtectedAccessModifier.name2);

      //  System.out.println(AccessModifierss_Test4.name1);
        System.out.println(AccessModifierss_Test4.name2); //protected is visible inhabitant class

        //method1();         //default oldugu icin gozukmuyor
        method2();


    }
}
