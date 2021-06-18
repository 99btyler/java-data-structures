package com.gmail.__99tylerberinger.javadatastructures.things;

public class Stack {

    private class Node {

        public final int data;
        public Node nextNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

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

    private void printStack() {

        Node node = firstNode;
        while (node != null) {
            System.out.print(node.data + " => ");
            node = node.nextNode;
        }

        System.out.println("null");

    }

}
