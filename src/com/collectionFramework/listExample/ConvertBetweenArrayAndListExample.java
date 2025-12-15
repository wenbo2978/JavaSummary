package com.collectionFramework.listExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertBetweenArrayAndListExample {

    public static void convertToArray(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i ++){
            list.add(i * i);
        }

        Integer[] myArray = list.toArray(new Integer[0]);

        int[] myArray2 = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void convertToList(){
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        List<Integer> list2 = Arrays.stream(array).toList();
    }


    public static void main(String[] args) {

    }
}
