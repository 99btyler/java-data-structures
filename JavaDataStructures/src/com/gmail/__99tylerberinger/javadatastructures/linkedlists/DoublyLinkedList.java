package com.gmail.__99tylerberinger.javadatastructures.linkedlists;

public class DoublyLinkedList {

    private class Node {

        public int data;
        public Node nextNode = null;
        public Node previousNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

    public final int get(int index) {

        Node indexNode = firstNode;
        int i = 0;
        while (indexNode != null) {
            if (i == index) {

                return indexNode.data;

            }
            indexNode = indexNode.nextNode;
            i += 1;
        }

        return -1;

    }

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
            newNode.previousNode = lastNode;

        }

        printDoublyLinkedList();

    }

    private void printDoublyLinkedList() {

        String string = "null <=> ";

        Node node = firstNode;
        while (node != null) {
            string += (node.data + " <=> ");
            node = node.nextNode;
        }
        string += "null";

        System.out.println(string);

    }

}
