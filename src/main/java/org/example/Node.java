package org.example;

public class Node {
    public int data;
    public Node RightNode;
    public Node LeftNode;
    private Node head;

    public Node(int data) {
        this.data = data;
        RightNode = null;
        LeftNode = null;
        head = null;
    }
}

