package com.gmail.__99tylerberinger.javadatastructures.things.other;

public class CircularSinglyLinkedList {

    private class Node {

        public final int data;
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

        } else {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
            newNode.nextNode = firstNode;

        }

        printCircularSinglyLinkedList();

    }

    public final void insert(int data, int index) {

        final Node newNode = new Node(data);

        if (index == 0) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = newNode;
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

                }
                preIndexNode = preIndexNode.nextNode;
                i += 1;
                if (preIndexNode == firstNode) {
                    break;
                }
            }

        }

        printCircularSinglyLinkedList();

    }

    public final void removeData(int data) {

        if (firstNode.data == data) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            firstNode = firstNode.nextNode;
            lastNode.nextNode = firstNode;

        } else {

            Node preDataNode = firstNode;
            while (preDataNode != null) {
                if (preDataNode.nextNode.data == data) {

                    final Node dataNode = preDataNode.nextNode;

                    preDataNode.nextNode = dataNode.nextNode;

                    break;

                }
                preDataNode = preDataNode.nextNode;
                if (preDataNode == firstNode) {
                    break;
                }
            }

        }

        printCircularSinglyLinkedList();

    }

    public final void removeIndex(int index) {

        if (index == 0) {

            Node lastNode = firstNode;
            while (lastNode.nextNode != firstNode) {
                lastNode = lastNode.nextNode;
            }

            firstNode = firstNode.nextNode;
            lastNode.nextNode = firstNode;

        } else {

            Node preIndexNode = firstNode;
            int i = 0;
            while (preIndexNode != null) {
                if (i == index-1) {

                    final Node indexNode = preIndexNode.nextNode;

                    preIndexNode.nextNode = indexNode.nextNode;

                }
                preIndexNode = preIndexNode.nextNode;
                i += 1;
                if (preIndexNode == firstNode) {
                    break;
                }
            }

        }

        printCircularSinglyLinkedList();

    }

    public final void clear() {

        firstNode = null;

        printCircularSinglyLinkedList();

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

    private void printCircularSinglyLinkedList() {

        Node node  = firstNode;

        if (node == null) {

            System.out.print("null");

        } else {

            while (node != null) {
                System.out.print(node.data + (node.nextNode == firstNode ? " => {" + node.nextNode.data + "}" : " => "));
                node = node.nextNode;
                if (node == firstNode) {
                    break;
                }
            }

        }

        System.out.println();

    }

}
