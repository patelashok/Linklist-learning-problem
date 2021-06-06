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

    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }
}