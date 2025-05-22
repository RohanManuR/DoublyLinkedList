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
        // deleting the node based on data
        System.out.println(doublyLinkedList.delete(700));
        // display nodes
        System.out.println(doublyLinkedList);
        // searching the data in list
        System.out.println(doublyLinkedList.search(35));
        // displaying the size of list
        System.out.println(doublyLinkedList.size());
        // updating the oldData by newData
        doublyLinkedList.set(600,55);
        // displaying the updated list
        System.out.println(doublyLinkedList);
        // displaying the data's in reverse order
        doublyLinkedList.reverse();
    }
}