package com.gmail.__99tylerberinger.javadatastructures.things.linkedlists;

public class SinglyLinkedList {

    private class Node {

        public int data;
        public Node nextNode = null;

        public Node(int data) {
            this.data = data;
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

            Node preDataNode = firstNode;
            while (preDataNode != null) {
                if (preDataNode.nextNode.data == data) {

                    final Node dataNode = preDataNode.nextNode;

                    preDataNode.nextNode = dataNode.nextNode;

                    break;

                }
                preDataNode = preDataNode.nextNode;
            }

        }

        printSinglyLinkedList();

    }

    public final void delete(int index) {

        if (index == 0) {

            firstNode = firstNode.nextNode;

        } else {

            Node preIndexNode = firstNode;
            int i = 0;
            while (preIndexNode != null) {
                if (i == index-1) {

                    final Node indexNode = preIndexNode.nextNode;

                    preIndexNode.nextNode = indexNode.nextNode;

                    break;

                }
                preIndexNode = preIndexNode.nextNode;
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

        Node dataNode = firstNode;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return true;

            }
            dataNode = dataNode.nextNode;
        }

        return false;

    }

    public final int size() {

        int size = 0;

        Node node = firstNode;
        while (node != null) {
            size += 1;
            node = node.nextNode;
        }

        return size;

    }

    private void printSinglyLinkedList() {

        String string = "";

        Node node = firstNode;
        while (node != null) {
            string += (node.data + " => ");
            node = node.nextNode;
        }
        string += "null";

        System.out.println(string);

    }

}
