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

        System.out.print(startingNode.data + " ");

        printBinarySearchTree(startingNode.rightChildNode);

    }

}
