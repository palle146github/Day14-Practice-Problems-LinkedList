package com.bridgelabz.datastructures;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        SortedLinkedList<Integer> integerSortedLinkedList = new SortedLinkedList<>();


        integerSortedLinkedList.add(56);
        integerSortedLinkedList.add(30);
        integerSortedLinkedList.add(40);
        integerSortedLinkedList.add(70);
        integerSortedLinkedList.list.display();
        System.out.println("size of list is " + integerSortedLinkedList.list.size());

    }
}
