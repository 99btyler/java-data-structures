package com.gmail.__99tylerberinger.javadatastructures.linkedlists;

public class CircularDoublyLinkedList {

    private class Node {

        public int data;
        public Node nextNode = null;
        public Node previousNode = null;

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
            firstNode.previousNode = firstNode;

        } else {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
            newNode.previousNode = lastNode;

            newNode.nextNode = firstNode;
            firstNode.previousNode = newNode;

        }

        printCircularDoublyLinkedList();

    }

    private void printCircularDoublyLinkedList() {

        String string = "";

        Node node = firstNode;
        while (node != null) {
            string += ((node.previousNode == null ? "" : "[" + node.previousNode.data + "]") + node.data + (node.nextNode == firstNode ? " <=> {" + node.nextNode.data + "}" : " <=> "));
            node = node.nextNode;
            if (node == firstNode) {
                break;
            }
        }

        System.out.println(string);

    }

}
