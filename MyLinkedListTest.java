package com.linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    //Creating 3 numbers
    @Test
    public void given3NumbersWhenLinkedShouldPassMyLinkedListsTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //create a linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //adding nodes to linked list
        myLinkedLists.add(myFirstNode);
        myLinkedLists.add(mySecondNode);
        myLinkedLists.add(myThirdNode);
        /*for printing
        myLinkedLists.printMyNodes();*/

        boolean result = myLinkedLists.head.equals(myThirdNode) && myLinkedLists.head.getNext().equals(mySecondNode) && myLinkedLists.tail.equals(myFirstNode);
        Assert.assertTrue(result);

    }
    //Append the node to the last
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
    //Insert the node in between the nodes

    public void given3NumbersWhenInsertingInBetweenShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        //create linked list
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        //inserting nodes
        myLinkedLists.add(myFirstNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.insert(myFirstNode,myThirdNode);

        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.equals(mySecondNode) && myLinkedLists.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
    //UC5 Deleting First Element
    @Test
    public void given3Numbers_deleteFirstElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.deleteElement();
        boolean result = myLinkedLists.head.equals(mySecondNode);
        Assert.assertEquals(true, result);
    }
    //Deleting last element
    @Test
    public void given3Numbers_deleteLastElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.deleteLastElement();
        INode result = myLinkedLists.deleteLastElement();
        Assert.assertEquals(mySecondNode, result);
    }
    // Searching for a specific Node in the List
    @Test
    public void given3Numbers_searchSpecificNode() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        INode result = myLinkedLists.searchNode(mySecondNode);
        Assert.assertEquals(mySecondNode, result);
    }
    //Searching for a specific Node and Inserting new node after that
    @Test
    public void givenNumbers_searchforSpecificNode_InsertNewElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(40);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(30);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myFourthNode);
        myLinkedLists.searchNode(mySecondNode);
        myLinkedLists.searchNodeAndInsert(mySecondNode, myThirdNode);
        boolean result = myLinkedLists.head.equals(myFirstNode) && myLinkedLists.head.getNext().equals(mySecondNode)
                && myLinkedLists.head.getNext().getNext().equals(myThirdNode) &&
                myLinkedLists.tail.equals(myFourthNode);
        Assert.assertEquals(true, result);
    }

    //Searching for a specific Node, deleting it and print list size
    @Test
    public void givenNumbers_searchAndDeleteSpecificNode_PrintListSize() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(56);
        MyLinkedLists myLinkedLists = new MyLinkedLists();
        myLinkedLists.append(myFirstNode);
        myLinkedLists.append(mySecondNode);
        myLinkedLists.append(myThirdNode);
        myLinkedLists.append(myFourthNode);
        INode node = myLinkedLists.deleteNodeInBetween(myThirdNode);
        int size = myLinkedLists.myListSize();
        Assert.assertEquals(3, size);
    }

}