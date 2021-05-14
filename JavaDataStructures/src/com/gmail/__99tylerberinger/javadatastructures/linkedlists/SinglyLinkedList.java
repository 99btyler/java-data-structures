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

    public final void add(int data, int index) {

        final Node newNode = new Node(data);

        if (index == 0) {

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

                    break;

                }
                preIndexNode = preIndexNode.nextNode;
                i += 1;
            }

        }

        printSinglyLinkedList();

    }

    public final void delete(int data) {

        if (firstNode.data == data) {

            firstNode = firstNode.nextNode;

        } else {

            Node preNodeToDelete = firstNode;
            while (preNodeToDelete != null) {
                if (preNodeToDelete.nextNode.data == data) {

                    final Node nodeToDelete = preNodeToDelete.nextNode;

                    preNodeToDelete.nextNode = nodeToDelete.nextNode;

                    break;

                }
                preNodeToDelete = preNodeToDelete.nextNode;
            }

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
