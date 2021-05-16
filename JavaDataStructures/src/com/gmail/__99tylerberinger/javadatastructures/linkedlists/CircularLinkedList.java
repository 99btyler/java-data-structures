package com.gmail.__99tylerberinger.javadatastructures.linkedlists;

public class CircularLinkedList {

    private class Node {

        public int data;
        public Node nextNode;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

    public final void add(int data) {

        final Node newNode = new Node(data);

        if (firstNode == null) {

            firstNode = newNode;
            firstNode.nextNode = firstNode;

        } else {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
            newNode.nextNode = firstNode;

        }

        printCircularLinkedList();

    }

    public final void insert(int data, int index) {

        final Node newNode = new Node(data);

        if (index == 0) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
            newNode.nextNode = firstNode;
            firstNode = newNode;

        } else {

            Node preIndexNode = firstNode;
            int i = 0;
            while (preIndexNode != null) {
                if (i == index-1) {

                    final Node indexNode = preIndexNode.nextNode;

                    preIndexNode.nextNode = newNode;
                    newNode.nextNode = indexNode;

                }
                if (preIndexNode.nextNode == firstNode) {
                    break;
                }
                preIndexNode = preIndexNode.nextNode;
                i += 1;
            }

        }

        printCircularLinkedList();

    }

    public final boolean contains(int data) {

        Node dataNode = firstNode;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return true;

            }
            if (dataNode.nextNode == firstNode) {
                break;
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
            if (node.nextNode == firstNode) {
                break;
            }
            node = node.nextNode;
        }

        return size;

    }

    private void printCircularLinkedList() {

        String string = "";

        Node node  = firstNode;
        while (node != null) {
            string += (node.data + (node.nextNode == firstNode ? " => [" + node.nextNode.data + "]" : " => "));
            if (node.nextNode == firstNode) {
                break;
            }
            node = node.nextNode;
        }

        System.out.println(string);

    }

}
