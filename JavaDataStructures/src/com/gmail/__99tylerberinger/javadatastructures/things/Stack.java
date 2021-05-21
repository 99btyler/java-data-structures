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

    public final int peek() {

        return (firstNode != null ? firstNode.data : -1);

    }

    public final int indexOf(int data) {

        Node dataNode = firstNode;
        int i = 0;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return i;

            }
            dataNode = dataNode.nextNode;
            i += 1;
        }

        return -1;

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

    public final boolean contains(int data) {

        Node dataNode = firstNode;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return true;

            }
            dataNode = dataNode.nextNode;
        }

        return false;

    }

    public final int size() {

        int size = 0;

        Node node = firstNode;
        while (node != null) {
            size += 1;
            node = node.nextNode;
        }

        return size;

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
