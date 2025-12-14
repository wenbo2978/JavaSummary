package com.collectionFramework.mapExample;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class MapMethodExample {

    public static void GroupStudents(){
        Map<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("Class1", k -> new LinkedList<>()).add("WW");
        map.computeIfAbsent("Class1", k -> new LinkedList<>()).add("CC");
        map.computeIfAbsent("Class1", k -> new LinkedList<>()).add("SS");
        map.computeIfAbsent("Class2", k -> new LinkedList<>()).add("JJ");
        map.computeIfAbsent("Class2", k -> new LinkedList<>()).add("HH");
        map.computeIfAbsent("Class2", k -> new LinkedList<>()).add("KK");
        map.computeIfAbsent("Class3", k -> new LinkedList<>()).add("LL");
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey());
            for(String str: entry.getValue()){
                System.out.println(str);
            }
        }
    }

    public static void InsertStudent(){
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("Wenbo", 28);
        map.putIfAbsent("Chouchou", 34);
        map.putIfAbsent("Wenbo", 44);
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.toString());
        }
    }

    public static void UpdateScore(){
        Map<String, Integer> map = new HashMap<>();
        map.put("WW", 20);
        map.put("CC", 30);
        map.computeIfPresent("WW", (k, v) -> v + 10);
        map.computeIfPresent("CC", (k, v) -> v - 3);
        map.merge("WW", 10, (oldV, newV) -> oldV + newV);
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));
    }

    public static void main(String[] args) {
        //InsertStudent();
        //GroupStudents();
        UpdateScore();
    }
}
