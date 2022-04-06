package day34_Garbage;

import static day34_Garbage.AccessModifiers.defaultData;
import static day34_Garbage.AccessModifiers.publicData;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        //privateData cıkmıyor
        //baska package'ta yapsan sadece public gözükecek.

    }

}
