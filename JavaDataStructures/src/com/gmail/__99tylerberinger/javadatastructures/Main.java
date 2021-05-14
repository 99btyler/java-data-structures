package com.gmail.__99tylerberinger.javadatastructures;

import com.gmail.__99tylerberinger.javadatastructures.linkedlists.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("java-data-structures");

        System.out.println("\nSinglyLinkedList");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.insert(2, 1);
        singlyLinkedList.insert(0, 0);
        singlyLinkedList.remove(0);
        singlyLinkedList.remove(1);
        singlyLinkedList.remove(3);

    }

}
