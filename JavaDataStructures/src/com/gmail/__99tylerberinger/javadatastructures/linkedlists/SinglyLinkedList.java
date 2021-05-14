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

    public final int get(int index) {

        Node indexNode = firstNode;
        int i = 0;
        while (indexNode != null) {
            if (i == index) {

                return indexNode.data;

            }
            indexNode = indexNode.nextNode;
            i += 1;
        }

        return -1;

    }

    public final int indexOf(int data) {

        Node dataNode = firstNode;
        int i = 0;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return i;

            }
            dataNode = dataNode.nextNode;
            i += 1;
        }

        return -1;

    }

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

    public final void insert(int data, int index) {

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

    public final void remove(int data) {

        if (firstNode.data == data) {

            firstNode = firstNode.nextNode;

        } else {

            Node preNodeToRemove = firstNode;
            while (preNodeToRemove != null) {
                if (preNodeToRemove.nextNode.data == data) {

                    final Node nodeToRemove = preNodeToRemove.nextNode;

                    preNodeToRemove.nextNode = nodeToRemove.nextNode;

                    break;

                }
                preNodeToRemove = preNodeToRemove.nextNode;
            }

        }

        printSinglyLinkedList();

    }

    public final void delete(int index) {

        if (index == 0) {

            firstNode = firstNode.nextNode;

        } else {

            Node preNodeToDelete = firstNode;
            int i = 0;
            while (preNodeToDelete != null) {
                if (i == index-1) {

                    final Node nodeToDelete = preNodeToDelete.nextNode;

                    preNodeToDelete.nextNode = nodeToDelete.nextNode;

                    break;

                }
                preNodeToDelete = preNodeToDelete.nextNode;
                i += 1;
            }

        }

        printSinglyLinkedList();

    }

    public final void clear() {

        firstNode = null;

        printSinglyLinkedList();

    }

    public final boolean contains(int data) {

        Node tempNode = firstNode;
        while (tempNode != null) {
            if (tempNode.data == data) {

                return true;

            }
            tempNode = tempNode.nextNode;
        }

        return false;

    }

    public final int size() {

        int size = 0;

        Node tempNode = firstNode;
        while (tempNode != null) {
            size += 1;
            tempNode = tempNode.nextNode;
        }

        return size;

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
