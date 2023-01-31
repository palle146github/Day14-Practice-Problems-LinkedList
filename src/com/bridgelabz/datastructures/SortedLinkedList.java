package com.bridgelabz.datastructures;


public class SortedLinkedList<E extends Comparable<E>> {

    LinkedList<E> list;

    public SortedLinkedList(){

        list = new LinkedList<>();
    }

    public void add(E Key) {
        int position = 0;
        Node<E> temp = list.head;
        for(int i = 0; i < list.size(); i++) {
            if(temp.key.compareTo(Key) > 0) {
                position = i;
                break;
            }else {
                position = i+1;
            }
            temp = temp.next;
        }
        list.addAtPosition(position, Key);
    }


    public void display() {
        Node<E> temp = list.head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
