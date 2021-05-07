package com.company;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtHead(5);
        linkedList.insertAtHead(6);
        linkedList.insertAtHead(6);
        linkedList.insertAtHead(8);
        linkedList.RemoveDuplicatesFromLinkedList(linkedList);
        System.out.println(linkedList.findData(5));
        System.out.println(linkedList);

    }
}
