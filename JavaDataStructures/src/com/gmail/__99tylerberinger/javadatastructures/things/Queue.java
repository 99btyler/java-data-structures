package com.gmail.__99tylerberinger.javadatastructures.things;

public class Queue {

    private class Node {

        public int data;
        public Node nextNode;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;
    private Node lastNode = null;

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
