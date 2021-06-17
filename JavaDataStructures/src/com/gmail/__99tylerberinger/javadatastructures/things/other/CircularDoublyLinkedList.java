package com.gmail.__99tylerberinger.javadatastructures.things.other;

public class CircularDoublyLinkedList {

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
            if (indexNode == firstNode) {
                break;
            }
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
            if (dataNode == firstNode) {
                break;
            }
        }

        return -1;

    }

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

    public final void insert(int data, int index) {

        final Node newNode = new Node(data);

        if (index == 0) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
            newNode.previousNode = lastNode;

            newNode.nextNode = firstNode;
            firstNode.previousNode = newNode;
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
                if (indexNode == firstNode) {
                    break;
                }
            }

        }

        printCircularDoublyLinkedList();

    }

    public final void remove(int data) {

        if (firstNode.data == data) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            firstNode = firstNode.nextNode;
            lastNode.nextNode = firstNode;
            firstNode.previousNode = lastNode;

        } else {

            Node dataNode = firstNode;
            while (dataNode != null) {
                if (dataNode.data == data) {

                    final Node preDataNode = dataNode.previousNode;
                    final Node postDataNode = dataNode.nextNode;

                    preDataNode.nextNode = postDataNode;
                    postDataNode.previousNode = preDataNode;

                    break;

                }
                dataNode = dataNode.nextNode;
                if (dataNode == firstNode) {
                    break;
                }
            }

        }

        printCircularDoublyLinkedList();

    }

    public final void delete(int index) {

        if (index == 0) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            firstNode = firstNode.nextNode;
            lastNode.nextNode = firstNode;
            firstNode.previousNode = lastNode;

        } else {

            Node indexNode = firstNode;
            int i = 0;
            while (indexNode != null) {
                if (i == index) {

                    final Node preIndexNode = indexNode.previousNode;
                    final Node postIndexNode = indexNode.nextNode;

                    preIndexNode.nextNode = postIndexNode;
                    postIndexNode.previousNode = preIndexNode;

                    break;

                }
                indexNode = indexNode.nextNode;
                i += 1;
                if (indexNode == firstNode) {
                    break;
                }
            }

        }

        printCircularDoublyLinkedList();

    }

    public final void clear() {

        firstNode = null;

        printCircularDoublyLinkedList();

    }

    public final boolean contains(int data) {

        Node dataNode = firstNode;
        while (dataNode != null) {
            if (dataNode.data == data) {

                return true;

            }
            dataNode = dataNode.nextNode;
            if (dataNode == firstNode) {
                break;
            }
        }

        return false;

    }

    public final int size() {

        int size = 0;

        Node node = firstNode;
        while (node != null) {
            size += 1;
            node = node.nextNode;
            if (node == firstNode) {
                break;
            }
        }

        return size;

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

        System.out.println(string == "" ? "null" : string);

    }

}
