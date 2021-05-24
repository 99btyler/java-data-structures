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

}
