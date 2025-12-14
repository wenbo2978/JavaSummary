package com.collectionFramework.listExample;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListExample {

    public static void DequeTest(){
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < 10; i ++){
            deque.push(i);
        }
        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }
    }

    public static void main(String[] args) {
        DequeTest();
    }
}
