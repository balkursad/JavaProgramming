package day29_ArrayList;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int number = 5;
        int max=0;
        for (int i = 0; i < number-1; i++) {
            max=Collections.max(list);
            Collections.replaceAll(list, max, 0);
        }
        max=Collections.max(list);
        System.out.println(max);

    }
}
