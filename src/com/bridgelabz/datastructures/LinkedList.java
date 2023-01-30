package com.bridgelabz.datastructures;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;

    public void push(E key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void append(E key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insert(E key, E data) {
        Node<E> newNode = new Node<>(data);
        Node<E> temp = head;
        while (temp != null) {
            if (temp.key == key) {
                Node<E> tempNext = temp.next;
                temp.next = newNode;
                newNode.next = tempNext;
                System.out.println("Element inserted Successfully");
                break;
            } else {
                System.out.println("Element not inserted ");
            }
        }
    }

    public void popFirst() {
        Node<E> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("First element removed successfully");
    }

    public Node popLast() {
        Node<E> temp = head;
        if (temp == null) {
            return null;
        }
        if (temp.next == null) {
            return null;
        }
        while (temp.next != null) {
            temp = temp.next;
            temp.next = null;
            System.out.println("Last element removed successfully");
        }
        return head;
    }

    public boolean searchKey(E searchKey) {
        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.key == searchKey) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

