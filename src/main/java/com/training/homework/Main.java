package com.training.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Eugene Kushpii
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ElementCounter elementCounter = new ElementCounter(createTestList());
        System.out.println(elementCounter.calculateRepetition());
        CustomList<Integer> customList = new CustomList<>();
        customList.add(1);
        customList.add(1);
        customList.add(1);
        customList.add(1);
        System.out.println(Arrays.toString(customList.toArray()));
        System.out.println(customList.size());

        //This line will lead exception
        customList.remove(1);

    }

    private static List createTestList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        return list;
    }
}
