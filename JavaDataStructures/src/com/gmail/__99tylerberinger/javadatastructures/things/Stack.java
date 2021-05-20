package com.gmail.__99tylerberinger.javadatastructures.things;

public class Stack {

    private class Node {

        public int data;
        public Node nextNode;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

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

    private void printStack() {

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
