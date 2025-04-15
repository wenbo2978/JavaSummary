package com.mockInterview.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Staff {

    public String name;
    public String department;
    public int age;

    public Staff(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args){
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("GG", "D", 45));
        staffList.add(new Staff("YY", "D", 34));
        staffList.add(new Staff("HH", "D", 25));
        staffList.add(new Staff("JJ", "D", 44));
        staffList.add(new Staff("KK", "L", 34));
        staffList.add(new Staff("LL", "L", 25));

        Map<String, Optional<Staff>> map = staffList.stream()
                .collect(Collectors.groupingBy(
                        s -> s.department,
                        Collectors.maxBy(Comparator.comparingInt(
                                s -> s.age
                        ))
                ));
        for(Map.Entry<String, Optional<Staff>> entry : map.entrySet()){
            Optional<Staff> staff = entry.getValue();
            staff.
                    ifPresent(value ->
                            System.out.println(
                                    entry.getKey() + ", " + value.getAge()));
        }
    }
}
