package com.gmail.__99tylerberinger.javadatastructures.things.other;

public class DoublyLinkedList {

    private class Node {

        public final int data;
        public Node nextNode = null;
        public Node previousNode = null;

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
            newNode.previousNode = lastNode;

        }

        printDoublyLinkedList();

    }

    public final void insert(int data, int index) {

        final Node newNode = new Node(data);

        if (index == 0) {

            newNode.nextNode = firstNode;
            firstNode = newNode;

        } else {

            Node indexNode = firstNode;
            int i = 0;
            while (indexNode != null) {
                if (i == index) {

                    final Node preIndexNode = indexNode.previousNode;

                    preIndexNode.nextNode = newNode;
                    newNode.previousNode = preIndexNode;

                    newNode.nextNode = indexNode;
                    indexNode.previousNode = newNode;

                    break;

                }
                indexNode = indexNode.nextNode;
                i += 1;
            }

        }

        printDoublyLinkedList();

    }

    public final void remove(int data) {

        if (firstNode.data == data) {

            firstNode = firstNode.nextNode;
            firstNode.previousNode = null;

        } else {

            Node dataNode = firstNode;
            while (dataNode != null) {
                if (dataNode.data == data) {

                    final Node preDataNode = dataNode.previousNode;
                    final Node postDataNode = dataNode.nextNode;

                    preDataNode.nextNode = postDataNode;
                    if (postDataNode != null) {
                        postDataNode.previousNode = preDataNode;
                    }

                    break;

                }
                dataNode = dataNode.nextNode;
            }

        }

        printDoublyLinkedList();

    }

    public final void delete(int index) {

        if (index == 0) {

            firstNode = firstNode.nextNode;
            firstNode.previousNode = null;

        } else {

            Node indexNode = firstNode;
            int i = 0;
            while (indexNode != null) {
                if (i == index) {

                    final Node preIndexNode = indexNode.previousNode;
                    final Node postIndexNode = indexNode.nextNode;

                    preIndexNode.nextNode = postIndexNode;
                    if (postIndexNode != null) {
                        postIndexNode.previousNode = preIndexNode;
                    }

                }
                indexNode = indexNode.nextNode;
                i += 1;
            }

        }

        printDoublyLinkedList();

    }

    public final void clear() {

        firstNode = null;

        printDoublyLinkedList();

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

    private void printDoublyLinkedList() {

        String string = "null <=> ";

        Node node = firstNode;
        while (node != null) {
            string += ((node.previousNode == null ? "" : "[" + node.previousNode.data + "]") + node.data + " <=> ");
            node = node.nextNode;
        }
        string += "null";

        System.out.println(string);

    }

}