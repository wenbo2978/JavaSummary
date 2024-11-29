package com.myFunction;

import com.myFunction.myCollection.MyLinkedList;
import com.myFunction.myCollection.MyNode.MySingleNode;
import com.myFunction.myCollection.myInterface.MyList;

import java.util.*;

public class TestFunction {

    public void testMySingleNode(){
        MySingleNode<Integer> sNode = new MySingleNode<>(5);
        MySingleNode<Integer> tmpNode = sNode;
        for(int i = 0; i < 20; i ++){
            tmpNode.next = new MySingleNode<>(i * i);
            tmpNode = tmpNode.next;
        }
        while(sNode != null){
            System.out.println(sNode.value);
            sNode = sNode.next;
        }
    }

    public void testMyLinkedList(){
        MyList<Double> myList = new MyLinkedList<>();
        myList.add(0.5);
        myList.add(3.2);
        myList.add(5.5);
        myList.add(7.7);
        System.out.println(myList.size());
        myList.remove(2);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        myList.printNode();
    }

    static public void main(String[] args){
        TestFunction testFunction = new TestFunction();
        //testFunction.testMySingleNode();
        testFunction.testMyLinkedList();
        Map<Integer, Integer> map = new HashMap<>();
        for(Map.Entry <Integer, Integer> e : map.entrySet()){

        }
    }
}
