package com.linklist;

public class MyNode<K> implements INode<K> {

    //Declaring key and next
    private K key;
    private INode next;


    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    //getting the get and set functions
    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

}