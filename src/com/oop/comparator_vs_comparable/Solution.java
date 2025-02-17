package com.oop.comparator_vs_comparable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    class customCompare implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2){
            return o2.getAge() - o1.getAge();
        }
    }

    public void ArraySort1(Student[] stus){
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });
    }

    public void ArraySort2(Student[] stus){
        Arrays.sort(stus, new customCompare());
    }

    public void printStudents(Student[] stus){
        for(int i = 0; i < 10; i ++){
            System.out.println(stus[i].toString());
        }
    }

    public void ArraySort3(Student[] stus){
        Arrays.sort(stus);
    }



    public static void main(String[] args){
        Student[] stus = new Student[10];
        for(int i = 0; i < 10; i ++){
            Student stu = new Student(
                    20 + (int) Math.floor(Math.random() * 10),
                    "JJ" + i,
                    350 + (int) Math.floor(Math.random() * 100)
            );
            stus[i] = stu;
        }

        Solution solution = new Solution();
        solution.ArraySort1(stus);

        solution.printStudents(stus);
        System.out.println("-------------------------------------");
        solution.ArraySort2(stus);

        solution.printStudents(stus);

        System.out.println("-------------------------------------");

        solution.ArraySort3(stus);

        solution.printStudents(stus);
    }
}
