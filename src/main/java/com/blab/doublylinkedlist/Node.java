package com.blab.doublylinkedlist;

// Generic type Node class created
public class Node <E extends Comparable> {
    // generic type node data
    E data;
    // to store next object address
    Node next;
    // to store previous object address
    Node previous;

    // constructor to initialize data
    Node(E data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
