package com.bridgelabz.Stack;

public class Stack<T> {
    Node<T> head;
    Node<T> tail;


    public void add(T data) {
        Node<T> obj2 = new Node<>(data);
        if (head == null) {
            head = obj2;
            tail = obj2;
        } else {

            tail.next = obj2;
            tail = obj2;
        }

    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;


        }
    }
}

