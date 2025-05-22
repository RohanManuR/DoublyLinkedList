package com.blab.doublylinkedlist;

public class DoublyLinkedList <E extends Comparable> {

    // head variable
    Node<E> head;
    // tail variable
    Node<E> tail;

    // method to add data to doubly linked list
    public boolean add(E data)
    {
        // node object created
        Node node = new Node(data);

        // checking head is empty or not
        if(head==null) {
            head = tail = node;
            return true;
        }
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to till last node
        while(temp.next!=null)
            temp = temp.next;
        temp.next = node;
        node.previous = temp;
        tail = node;
        return true;
    }

    // overriden toString() to display doubly linked list
    public String toString()
    {
        // checking head is empty or not
        if(head==null) {
            System.out.println("list is empty,....");
            return "";
        }
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to display nodes
        while(temp.next!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
        return "";
    }
}

