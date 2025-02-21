package com.collectionFramework;

import java.util.*;

public class Array_List_Solution {

    public static void convertBetweenArray_and_List(){

        /*
         * convert array into list
         */
        int[] arrInt = new int[]{1, 2, 5, 9, 6};
        List<Integer> list = Arrays.stream(arrInt)
                .boxed()
                .toList(); // unmodified
        //list.add(7);
        Integer[] arrInteger = new Integer[]{1, 2, 5, 9, 6};
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, arrInteger);
        list2.add(7);
        List<Integer> list3 = Arrays.asList(arrInteger);

        list3.add(7); // unmodified

        /*
         *
         * convert list into array
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("J");
        String[] stringArray = stringList.toArray(new String[0]);

        List<Integer> intList = Arrays.asList(1, 6, 9, 6, 7);

        int[] myArr = intList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

    public static void unModifiedList(){
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> readonly_list = Collections.unmodifiableList(list);
    }

    public static void main(String[] args){
        try {
            Array_List_Solution.convertBetweenArray_and_List();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
