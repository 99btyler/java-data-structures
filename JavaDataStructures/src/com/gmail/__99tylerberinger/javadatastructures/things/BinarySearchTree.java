package com.gmail.__99tylerberinger.javadatastructures.things;

public class BinarySearchTree {

    private class Node {

        public int data;
        public Node leftChildNode = null;
        public Node rightChildNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

    public final void insert(int data) {

        firstNode = insert(firstNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node insert(Node startingNode, int data) {

        if (startingNode == null) {

            return new Node(data); // stop recursive calls

        } else {

            if (data < startingNode.data) {
                startingNode.leftChildNode = insert(startingNode.leftChildNode, data);
            } else if (data > startingNode.data) {
                startingNode.rightChildNode = insert(startingNode.rightChildNode, data);
            }

            return startingNode; // stop recursive calls

        }

    }

    public final void delete(int data) {

        firstNode = delete(firstNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node delete(Node startingNode, int data) {

        if (startingNode == null) {

            return startingNode; // stop recursive calls

        } else {

            if (data < startingNode.data) {
                startingNode.leftChildNode = delete(startingNode.leftChildNode, data);
            } else if (data > startingNode.data) {
                startingNode.rightChildNode = delete(startingNode.rightChildNode, data);
            } else {

                // THIS IS THE NODE TO DELETE!

                // has 0 or 1 children
                if (startingNode.leftChildNode == null) {
                    return startingNode.rightChildNode; // stop recursive calls
                } else if (startingNode.rightChildNode == null) {
                    return startingNode.leftChildNode; // stop recursive calls
                }

                // has 2 children
                startingNode.data = getSmallestData(startingNode.leftChildNode);
                startingNode.leftChildNode = delete(startingNode.leftChildNode, startingNode.data);

            }

        }

        return startingNode; // stop recursive calls

    }

    private int getSmallestData(Node startingNode) {
        int smallestData = startingNode.data;
        while (startingNode.leftChildNode != null) {
            startingNode = startingNode.leftChildNode;
            smallestData = startingNode.data;
        }
        return smallestData;
    }

    private void printBinarySearchTree() {

        printBinarySearchTree(firstNode);

        System.out.println();

    }

    // Recursive method
    private void printBinarySearchTree(Node startingNode) {

        if (startingNode == null) {
            return; // stop recursive calls
        }

        printBinarySearchTree(startingNode.leftChildNode);

        System.out.print((startingNode.leftChildNode != null ? "{" + startingNode.leftChildNode.data + "}-" : "") + startingNode.data + (startingNode.rightChildNode != null ? "-{" + startingNode.rightChildNode.data + "} " : " "));

        printBinarySearchTree(startingNode.rightChildNode);

    }

}
