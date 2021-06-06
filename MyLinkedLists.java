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

    /*For printing my nodes
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes:");
        INode tempNode = head;
        while(tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes); //print nodes
    }*/

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
}
