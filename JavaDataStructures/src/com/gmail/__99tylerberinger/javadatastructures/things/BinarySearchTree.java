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

    public final Node search(int data) {

        final Node node = search(firstNode, data);

        System.out.println("Found: " + (node != null ? node.data : "nothing"));

        return node;

    }

    // Recursive method
    private Node search(Node node, int data) {

        if (node == null || node.data == data) {

            return node; // stop recursive calls

        } else {

            if (data < node.data) {
                return search(node.leftChildNode, data);
            } else if (data > node.data) {
                return search(node.rightChildNode, data);
            }

            return node; // stop recursive calls

        }

    }

    public final void insert(int data) {

        firstNode = insert(firstNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node insert(Node node, int data) {

        if (node == null) {

            return new Node(data); // stop recursive calls

        } else {

            if (data < node.data) {
                node.leftChildNode = insert(node.leftChildNode, data);
            } else if (data > node.data) {
                node.rightChildNode = insert(node.rightChildNode, data);
            }

            return node; // stop recursive calls

        }

    }

    public final void delete(int data) {

        firstNode = delete(firstNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node delete(Node node, int data) {

        if (node == null) {

            return node; // stop recursive calls

        } else {

            if (data < node.data) {
                node.leftChildNode = delete(node.leftChildNode, data);
            } else if (data > node.data) {
                node.rightChildNode = delete(node.rightChildNode, data);
            } else {

                // THIS IS THE NODE TO DELETE!

                // has 0 or 1 children
                if (node.leftChildNode == null) {
                    return node.rightChildNode; // stop recursive calls
                } else if (node.rightChildNode == null) {
                    return node.leftChildNode; // stop recursive calls
                }

                // has 2 children
                Node tempNode = node;
                int smallestData = tempNode.data;
                while (tempNode.leftChildNode != null) {
                    tempNode = tempNode.leftChildNode;
                    smallestData = tempNode.data;
                }
                node.data = smallestData;
                node.leftChildNode = delete(node.leftChildNode, node.data);

            }

        }

        return node; // stop recursive calls

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
