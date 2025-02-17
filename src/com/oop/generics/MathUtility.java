package com.oop.generics;

import java.util.List;

public class MathUtility {
    public static <T extends Number> double square(T number){
        return number.doubleValue() * number.doubleValue();
    }

    public static double sumOfNumber(List<? extends Number> list){
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
