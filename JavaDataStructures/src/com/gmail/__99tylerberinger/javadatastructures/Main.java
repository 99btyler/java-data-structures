package com.gmail.__99tylerberinger.javadatastructures;

import com.gmail.__99tylerberinger.javadatastructures.things.Stack;
import com.gmail.__99tylerberinger.javadatastructures.things.linkedlists.CircularDoublyLinkedList;
import com.gmail.__99tylerberinger.javadatastructures.things.linkedlists.CircularSinglyLinkedList;
import com.gmail.__99tylerberinger.javadatastructures.things.linkedlists.DoublyLinkedList;
import com.gmail.__99tylerberinger.javadatastructures.things.linkedlists.SinglyLinkedList;

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

        System.out.println("\nCircularSinglyLinkedList");
        final CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.add(2020);
        System.out.println("Data at index 0: " + circularSinglyLinkedList.get(0));
        circularSinglyLinkedList.add(2022);
        System.out.println("Size: " + circularSinglyLinkedList.size());
        circularSinglyLinkedList.insert(2021, 1);
        System.out.println("Contains 2020: " + circularSinglyLinkedList.contains(2020));
        System.out.println("Index of data 2020: " + circularSinglyLinkedList.indexOf(2020));
        circularSinglyLinkedList.remove(2022);
        circularSinglyLinkedList.delete(1);
        circularSinglyLinkedList.clear();

        System.out.println("\nCircularDoublyLinkedList");
        final CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.add(1);
        System.out.println("Index of data 1: " + circularDoublyLinkedList.indexOf(1));
        circularDoublyLinkedList.add(3);
        System.out.println("Contains 2: " + circularDoublyLinkedList.contains(2));
        circularDoublyLinkedList.insert(2, 1);
        System.out.println("Data at index 1: " + circularDoublyLinkedList.get(1));
        System.out.println("Size: " + circularDoublyLinkedList.size());
        circularDoublyLinkedList.remove(2);
        circularDoublyLinkedList.delete(0);
        circularDoublyLinkedList.clear();

        System.out.println("\nStack");
        final Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped data: " + stack.pop());
        System.out.println("Popped data: " + stack.pop());
        System.out.println("Popped data: " + stack.pop());

    }

}
