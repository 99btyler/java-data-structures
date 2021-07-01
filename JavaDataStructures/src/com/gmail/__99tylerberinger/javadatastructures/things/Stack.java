package com.gmail.__99tylerberinger.javadatastructures.things;

public class Stack {

    private class Node {

        public final int data;
        public Node nextNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode;

    public Stack() {
        firstNode = null;
    }

    private void printStack() {

        Node node = firstNode;
        while (node != null) {
            System.out.format("%d[%d] ", node.data, (node.nextNode != null ? node.nextNode.data : -1));
            node = node.nextNode;
        }

        System.out.format("...\n");

    }

    public final int peek() {

        return (firstNode != null ? firstNode.data : -1);

    }

    public final void push(int data) {

        final Node newNode = new Node(data);

        if (firstNode == null) {

            firstNode = newNode;

        } else {

            newNode.nextNode = firstNode;

            firstNode = newNode;

        }

        printStack();

    }

    public final int pop() {

        if (firstNode != null) {

            final int poppedData = firstNode.data;
            firstNode = firstNode.nextNode;

            printStack();

            return poppedData;

        }

        return -1;

    }

    public final void clear() {

        firstNode = null;

        printStack();

    }

}
