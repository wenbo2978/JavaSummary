package com.oop.generics;

import java.util.ArrayList;
import java.util.List;

public class Extends_And_Super_Practise {

    public static void extendsPractise(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++)
            list.add(i);
        List<? extends Number> nums = list;
        for (Number num : nums)
            System.out.println(num);
    }

    public static void superPractise(){
        List<? super Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++)
            list.add(i);
        list.add(15);
        Object obj = list.get(5);
        System.out.println(obj instanceof Integer);
    }

    public static void main(String[] args) {
        superPractise();
    }
}
