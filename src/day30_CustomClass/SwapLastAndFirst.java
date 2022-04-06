package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapLastAndFirst {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);

        Collections.swap(list, 0, list.size()-1);
        System.out.println(list);


    }
}
