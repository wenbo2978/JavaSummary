package com.collectionFramework.listExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void getData(List<Integer> list){
        for(int i = 0; i < 10; i ++){
            list.add(i);
        }
    }

    public static void IteratorTest(){
        List<Integer> list = new ArrayList<>();
        getData(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int num = it.next();
            if (num == 5){
                it.remove();
            }else {
                System.out.println(num);
            }
        }
    }

    public static void ListIterator(){
        List<Integer> list = new ArrayList<>();
        getData(list);
        ListIterator<Integer> it = list.listIterator(5);
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        IteratorTest();
        System.out.println("-----------------------------------------");
        ListIterator();
    }
}
