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

    private void printStack() {

        String string = (firstNode == null ? "null" : firstNode.data + " ... ");

        Node node = firstNode.nextNode;
        while (node != null) {
            string += (node.data + " ");
            node = node.nextNode;
        }

        System.out.println(string);

    }

}
