package com.mockInterview.iterator;

import javafx.util.Pair;

import java.util.*;

public class Solution {

    public void testList(){
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        Iterator<String> iterator = list.iterator();
        //System.out.print(iterator.next());
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("banana")){
                iterator.remove();
            }
        }
    }

    public void testMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 15);
        map.put("apple", 20);
        map.put("cherry", 30);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        solution.testList();
        solution.testMap();
    }
}
