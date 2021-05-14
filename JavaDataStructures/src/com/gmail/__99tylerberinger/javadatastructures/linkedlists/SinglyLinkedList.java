package com.gmail.__99tylerberinger.javadatastructures.linkedlists;

public class SinglyLinkedList {

    private class Node {

        public int data;
        public Node nextNode;

        public Node(int data) {
            this.data = data;
            nextNode = null;
        }

    }

    private Node firstNode = null;

    public final void add(int data) {

        final Node newNode = new Node(data);

        if (firstNode == null) {

            firstNode = newNode;

        } else {

            Node lastNode = firstNode;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;

        }

        printSinglyLinkedList();

    }

    private void printSinglyLinkedList() {

        String string = "";

        Node tempNode = firstNode;
        while (tempNode != null) {
            string += (tempNode.data + " => ");
            tempNode = tempNode.nextNode;
        }
        string += "null";

        System.out.println(string);

    }

}
