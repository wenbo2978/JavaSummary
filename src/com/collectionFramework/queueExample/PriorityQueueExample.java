package com.collectionFramework.queueExample;

import com.util.utilClass.Student;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void getData(PriorityQueue<Student> priorityQueue){
        Student stu1 = new Student("WW", 28, 65);
        Student stu2 = new Student("EE", 48, 35);
        Student stu3 = new Student("RR", 27, 25);
        Student stu4 = new Student("CC", 23, 15);
        Student stu5 = new Student("FF", 24, 45);
        Student stu6 = new Student("GG", 18, 66);
        priorityQueue.add(stu1);
        priorityQueue.add(stu2);
        priorityQueue.add(stu3);
        priorityQueue.add(stu4);
        priorityQueue.add(stu5);
        priorityQueue.add(stu6);
    }

    public static void comparableExample(){

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        getData(priorityQueue);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().toString());
        }

    }

    public static void comparatorExample(){
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() == o2.getScore() ?
                        (Integer.compare(o1.getAge(), o2.getAge()))
                        :
                        (Integer.compare(o1.getScore(), o2.getScore()));
            }
        };
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(studentComparator);
        getData(priorityQueue);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().toString());
        }

    }

    public static void main(String[] args) {
        //comparableExample();
        comparatorExample();
    }
}
