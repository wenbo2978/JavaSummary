package com.myFunction.myCollection.MyNode;

public class MySingleNode<E> {
    public MySingleNode next;
    public E value;

    public MySingleNode(E value){
        this.value = value;
        this.next = null;
    }
}
