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

    private Node rootNode;

    public BinarySearchTree() {
        rootNode = null;
    }

    private void printBinarySearchTree() {

        p(rootNode);

        System.out.format("...\n");

    }

    // Recursive method
    private void p(Node currentNode) {

        if (currentNode == null) {
            return; // stop recursive calls
        }

        p(currentNode.leftChildNode);

        System.out.format("[%d]%d[%d] ", (currentNode.leftChildNode != null ? currentNode.leftChildNode.data : -1), currentNode.data, (currentNode.rightChildNode != null ? currentNode.rightChildNode.data : -1));

        p(currentNode.rightChildNode);

    }

    public final Node search(int data) {

        return s(rootNode, data);

    }

    // Recursive method
    private Node s(Node currentNode, int data) {

        if (currentNode == null || currentNode.data == data) {

            return currentNode; // stop recursive calls

        } else {

            if (data < currentNode.data) {
                return s(currentNode.leftChildNode, data);
            } else if (data > currentNode.data) {
                return s(currentNode.rightChildNode, data);
            }

            return currentNode; // stop recursive calls

        }

    }

    public final void insert(int data) {

        rootNode = i(rootNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node i(Node currentNode, int data) {

        if (currentNode == null) {

            return new Node(data); // stop recursive calls

        } else {

            if (data < currentNode.data) {
                currentNode.leftChildNode = i(currentNode.leftChildNode, data);
            } else if (data > currentNode.data) {
                currentNode.rightChildNode = i(currentNode.rightChildNode, data);
            }

            return currentNode; // stop recursive calls

        }

    }

    public final void remove(int data) {

        rootNode = r(rootNode, data);

        printBinarySearchTree();

    }

    // Recursive method
    private Node r(Node currentNode, int data) {

        if (currentNode == null) {

            return currentNode; // stop recursive calls

        } else {

            if (data < currentNode.data) {
                currentNode.leftChildNode = r(currentNode.leftChildNode, data);
            } else if (data > currentNode.data) {
                currentNode.rightChildNode = r(currentNode.rightChildNode, data);
            } else {

                // THIS IS THE NODE TO DELETE!

                // has 0 or 1 children
                if (currentNode.leftChildNode == null) {
                    return currentNode.rightChildNode; // stop recursive calls
                } else if (currentNode.rightChildNode == null) {
                    return currentNode.leftChildNode; // stop recursive calls
                } else {

                    // has 2 children
                    Node node = currentNode;
                    int smallestData = node.data;
                    while (node.leftChildNode != null) {
                        node = node.leftChildNode;
                        smallestData = node.data;
                    }
                    currentNode.data = smallestData;
                    currentNode.leftChildNode = r(currentNode.leftChildNode, currentNode.data);

                }

            }

            return currentNode; // stop recursive calls

        }

    }

}
