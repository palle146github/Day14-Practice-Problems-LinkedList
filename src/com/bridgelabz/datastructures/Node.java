package com.bridgelabz.datastructures;

public class Node<E extends Comparable<E>> {
    E key;
    Node<E> next;
    public Node(E key) {
        this.key = key;
    }
}
