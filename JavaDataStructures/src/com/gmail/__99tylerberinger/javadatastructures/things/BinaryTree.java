package com.gmail.__99tylerberinger.javadatastructures.things;

public class BinaryTree {

    private class Node {

        public final int data;
        public Node leftChildNode = null;
        public Node rightChildNode = null;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node firstNode = null;

}
