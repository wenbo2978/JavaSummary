package com.myFunction.myCollection.myInterface;

public interface MyList<E> {
    abstract void add(E value);
    abstract E get(int index);
    abstract int size();
    abstract boolean remove(int index);
    abstract boolean isEmpty();
    abstract void printNode();
}
