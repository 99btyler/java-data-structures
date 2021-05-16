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
