package com.linklist;

public class MyNode<K> implements INode<K> {

    //Declaring key and next
    private K key;
    private INode<K> next;


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
    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("My Nodes{" + "keys=")
                .append(key).append('}');
        if (next != null)
            myNodeString.append("->").append(next);
        return myNodeString.toString();
    }

}