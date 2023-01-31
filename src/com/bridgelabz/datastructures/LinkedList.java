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
        Node<E> temp = head, prev = null;
        if (temp == null) {
            return null;
        }
        if (temp.next == null) {
            return null;
        }
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return tail;
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

    public void addElement(E insertElement, E searchElement) {
        Node<E> temp = head;
        Node<E> newNode = new Node<>(insertElement);
        while (temp.next != null) {
            if (temp.key == searchElement) {
                Node<E> temp2 = temp.next;
                temp.next = newNode;
                newNode.next = temp2;
            }
            else{
                System.out.println("Element not found");
            }
            temp = temp.next;
        }
    }

    public int size() {
        Node<E> temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    void deleteNode(E key) {
        Node<E> temp = head, prev = null;
        if (temp != null && temp.key == key) {
            head = temp.next; // Changed head
            return;
        }
        while (temp != null && temp.key != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }
}