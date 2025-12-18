package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void ListStreamTest(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(System.out::println);
        List<Integer> doubledNumbers = numbers.stream()
                .map(v -> v * 2)
                .toList();
        doubledNumbers.forEach(System.out::println);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        List<Integer> processedNumbers = numbers.stream()
                .filter(v -> v % 2 == 0)
                .map(v -> v * v )
                .toList();
        processedNumbers.forEach(System.out::println);
        System.out.println("---------------parallelStream() Test------------------");
        numbers.parallelStream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        ListStreamTest();
    }
}
