package com.linklist;

public class MyLinkedLists {

    public INode tail;
    public INode head;

    //created constructor
    public MyLinkedLists() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }


    //Append Method
    public void append(INode newNode) {
        if(this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insert(INode myNode , INode newNode) {
        /* store the node in tempNode
         * Initialize previous node to point new node
         * make new node point to tempNode
         */
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);

    }

    //Deleting first element
    public INode deleteElement() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    //Deleting last element
    public INode deleteLastElement() {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    //Search for a particular node
    public  INode searchNode(INode keyNode) {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(keyNode)) {
            tempNode = tempNode.getNext();
        }
        return keyNode;
    }

    //Search for a Particular Node and Insert new Element after that
    public void searchNodeAndInsert(INode keyNode, INode newNode)
    {
        INode tempNode = this.head;
        while(!tempNode.getNext().equals(keyNode)) {
            tempNode = tempNode.getNext();
        }
        INode newtempNode = keyNode.getNext();
        keyNode.setNext(newNode);
        newNode.setNext(newtempNode);
    }

    //Delete a specific Node and show size of the list
    public INode deleteNodeInBetween(INode keyNode) {
        INode node1 = this.head;
        INode tempNode = this.head;
        while(tempNode != keyNode) {
            tempNode = tempNode.getNext();
        }
        this.head = tempNode;
        deleteElement();
        INode node2 = this.head;
        this.head = node1;
        INode newtempNode = this.head;
        while(newtempNode.getNext() != keyNode) {
            newtempNode = newtempNode.getNext();
        }
        newtempNode.setNext(node2);
        return this.head;
    }

    public int myListSize() {
        int size = 0;
        if(this.head == null)
            return size;
        else
            size = 1;
        INode tempNode = this.head;
        while(tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
            size++;
        }
        return size;
    }

    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }

}