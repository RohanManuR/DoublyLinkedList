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

    // method to add nodes based on index
    public boolean add(int index,E data)
    {
        // node object created
        Node node = new Node(data);
        // adding node to first position
        if(index==0) {
            node.next = head;
            head.previous = node;
            head = node;
            return true;
        }
        // adding node to the last position
        if(index==size())
        {
            node.previous = tail;
            tail.next = node;
            tail = node;
            return true;
        }
        // display message if index is out of limit
        if(index>=size()){
            System.out.println("index out of limit,...");
            return false;
        }

        // variable to check position
        int x = 1;
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to till last node
        while(temp.next!=null)
        {
            // checking the position of based on index
            if(x==index){
                node.next = temp.next;
                temp.next.previous = node;
                temp.next = node;
                node.previous = temp;
                return true;
            }
            x++;
            temp = temp.next;
        }
        return false;
    }

    // method to display size of list
    public int size()
    {
        // variable created to store size;
        int size=0;
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to till last node
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // method to delete the node based on data
    public boolean delete(E data)
    {
        // checking list is empty or not
        if(head==null){
            System.out.println("List is empty,....");
            return false;
        }
        // checking that need to remove first element
        if(data.equals(head.data)){
            head = head.next;
            head.previous = null;
            return true;
        }
        //checking that need to remove last element
        if(data.equals(tail.data)){
            tail = tail.previous;
            tail.next = null;
            return true;
        }
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to till last node
        while(temp!=null) {
            if(temp.data.equals(data)) {
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // method to search data in list
    public boolean search(E data)
    {
        // creating temp variable to point to head
        Node temp = head;
        // traversing the temp to till last node
        while (temp.next!=null)
        {
            if(temp.data.equals(data))
                return true;
            temp = temp.next;
        }
        return false;
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

