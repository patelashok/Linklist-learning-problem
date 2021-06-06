package com.linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(30);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedLists myLinkedList = new MyLinkedLists();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAppendedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        //create linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //adding nodes using append method
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);

        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.getNext().equals(mySecondNode) && myLinkedLists.tail.equals(myThirdNode);
        Assert.assertTrue(result);


    }
}
