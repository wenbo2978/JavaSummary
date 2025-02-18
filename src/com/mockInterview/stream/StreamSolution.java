package com.mockInterview.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSolution {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);

        List<Integer> processedNumbers = numbers.stream()
                .filter(num -> num > 5)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(processedNumbers);

        int sum = numbers.stream()
                .reduce(0, (subTotal, ele) -> subTotal + ele);
        System.out.println(sum);

        List<Integer> sortedList = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();

        for(int i = 0; i < sortedList.size(); i ++){
            System.out.println(sortedList.get(i));

        }
    }
}
