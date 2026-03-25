package DoubleLinkedList;

public class Node {
    int val;
    Node next;
    Node prev;

    Node() {
        val = 0;
        next = null;
        prev = null;
    }

    Node(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    Node(int data1, Node next1, Node prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
