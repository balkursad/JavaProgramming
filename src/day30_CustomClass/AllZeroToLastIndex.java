package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllZeroToLastIndex {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        Integer [] nums = new Integer[list.size()];
        int size= list.size();
        list.removeAll(Arrays.asList(0));
        int newsize = list.size();
        int zeroNumber = size-newsize;
        for (int i = 0; i < zeroNumber; i++) {
            list.add(0);
        }


        System.out.println(list);


    }
}
