package com.myFunction.myCollection;

import com.myFunction.myCollection.MyNode.MySingleNode;
import com.myFunction.myCollection.myInterface.MyList;

public class MyLinkedList<E> implements MyList<E> {
    private MySingleNode<E> head;
    private MySingleNode<E> tail;
    private int size;

    public MyLinkedList(){
        this.size = 0;
    }

    @Override
    public void add(E value) {
        if(head == null && tail == null){
            MySingleNode<E> node = new MySingleNode<>(value);
            this.head = node;
            this.tail = node;
            this.size = 1;
        }else{
            MySingleNode<E> node = new MySingleNode<>(value);
            this.tail.next = node;
            this.tail = this.tail.next;
            this.size ++;
        }
    }

    @Override
    public E get(int index) {
        if(index >= this.size){
            return null;
        }
        MySingleNode<E> tmp = this.head;
        while(index > 0){
            index --;
            tmp = tmp.next;
        }
        return tmp.value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean remove(int index) {
        if(index >= this.size)
            return false;
        if(size == 1 && index == 0){
            size = 0;
            this.head = null;
            this.tail = null;
            return true;
        }
        if(index == 0){
            MySingleNode<E> tmp = this.head;
            this.head = this.head.next;
            tmp.next = null;
        }else{
            int n = index;
            MySingleNode<E> tmp = this.head;
            while(index > 1){
                tmp = tmp.next;
                index --;
            }
            MySingleNode<E> t2 = tmp.next;
            tmp.next = tmp.next.next;
            t2.next = null;
            if(n == size - 1){
                this.tail = tmp;
            }
        }
        this.size --;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void printNode() {
        MySingleNode<E> tmp = this.head;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
