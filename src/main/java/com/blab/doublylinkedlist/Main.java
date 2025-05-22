package com.blab.doublylinkedlist;
public class Main {
    public static void main(String[] args) {

        // list object created
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        // adding datas to linked list
        doublyLinkedList.add(700);
        doublyLinkedList.add(20);
        doublyLinkedList.add(300);
        doublyLinkedList.add(50);
        doublyLinkedList.add(600);
        doublyLinkedList.add(5);
        // adding the datas based on index
        doublyLinkedList.add(6,25);
        doublyLinkedList.add(0,35);
        // display nodes
        System.out.println(doublyLinkedList);
        // displaying the size of list
        System.out.println(doublyLinkedList.size());

    }
}