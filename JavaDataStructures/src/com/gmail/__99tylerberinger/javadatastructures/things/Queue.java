package com.gmail.__99tylerberinger.javadatastructures.things;

public class Queue {

    private class Node {

        public final int data;
        public Node nextNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;
    private Node lastNode = null;

    public final int peek() {
        return (firstNode != null ? firstNode.data : -1);
    }

    public final void add(int data) {

        final Node newNode = new Node(data);

        if (firstNode == null) {

            firstNode = newNode;
            lastNode = newNode;

        } else {

            lastNode.nextNode = newNode;
            lastNode = newNode;

        }

        printQueue();

    }

    public int pop() {

        if (firstNode != null) {

            final int removedData = firstNode.data;
            firstNode = firstNode.nextNode;

            printQueue();

            return removedData;

        }

        return -1;

    }

    public final void clear() {

        firstNode = null;

        printQueue();

    }

    private void printQueue() {

        String string = "";

        Node node = firstNode;
        while (node != null) {
            string += (node.data + " => ");
            node = node.nextNode;
        }
        string += "null";

        System.out.println(string);

    }

}
