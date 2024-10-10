package com.myFunction;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public void myPriorityQueue1(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[]{1, 5, 12, 52, 36, 4, 4, 86, 78, 32, 15, 19};
        for(int i = 0; i < arr.length; i ++){
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public void myPriorityQueue2(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 < o2 ? 1 : -1;
                return o2 - o1;
            }
        });
        int[] arr = new int[]{1, 5, 12, 52, 36, 4, 4, 86, 78, 32, 15, 19};
        for(int i = 0; i < arr.length; i ++){
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public void myPriorityQueue3(){
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        PriorityQueue<int[]> pq2 = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int[][] arr = new int[][]{{1, 5}, {12, 52}, {36, 4}, {4, 86}, {78, 32}, {15, 19}};
        for(int i = 0; i < arr.length; i ++){
            pq.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i ++){
            pq2.add(arr[i]);
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll()[0] + " ");
        }
        System.out.println();

        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll()[0] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        MyPriorityQueue myPq = new MyPriorityQueue();
        System.out.println("myPriorityQueue1");
        myPq.myPriorityQueue1();
        System.out.println("myPriorityQueue2");
        myPq.myPriorityQueue2();
        System.out.println("myPriorityQueue3");
        myPq.myPriorityQueue3();
    }
}
