package com.gmail.__99tylerberinger.javadatastructures;

import com.gmail.__99tylerberinger.javadatastructures.linkedlists.CircularLinkedList;
import com.gmail.__99tylerberinger.javadatastructures.linkedlists.DoublyLinkedList;
import com.gmail.__99tylerberinger.javadatastructures.linkedlists.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("java-data-structures");

        System.out.println("\nSinglyLinkedList");
        final SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        System.out.println("Index of data 3: " +  singlyLinkedList.indexOf(3));
        System.out.println("Contains 7: " + singlyLinkedList.contains(7));
        singlyLinkedList.insert(2, 1);
        System.out.println("Size: " + singlyLinkedList.size());
        singlyLinkedList.remove(3);
        System.out.println("Data at index 1: " + singlyLinkedList.get(1));
        singlyLinkedList.delete(1);
        singlyLinkedList.clear();

        System.out.println("\nDoublyLinkedList");
        final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(17);
        System.out.println("Contains 17: " + doublyLinkedList.contains(17));
        System.out.println("Size: " + doublyLinkedList.size());
        doublyLinkedList.add(19);
        System.out.println("Data at index 1: " + doublyLinkedList.get(1));
        doublyLinkedList.insert(18, 1);
        System.out.println("Index of data 18: " + doublyLinkedList.indexOf(18));
        doublyLinkedList.delete(doublyLinkedList.indexOf(18));
        doublyLinkedList.remove(17);
        doublyLinkedList.clear();

        System.out.println("\nCircularLinkedList");
        final CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(2020);
        circularLinkedList.add(2021);
        circularLinkedList.add(2022);

    }

}
