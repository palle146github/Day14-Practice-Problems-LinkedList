package com.bridgelabz.datastructures;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.append(56);
        integerLinkedList.append(30);
        integerLinkedList.append(70);
        boolean b = integerLinkedList.searchKey(30);
        if( b ){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        integerLinkedList.display();



    }
}
