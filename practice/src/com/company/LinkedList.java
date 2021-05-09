package com.company;

public class LinkedList {
    public static Node head;
    int length = 0;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void deleteHead(){
        head = head.next;
    }
    public boolean findData(int data){
        Node curr = head;
        while (curr!=null){
            if (curr.value == data){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public LinkedList RemoveDuplicatesFromLinkedList(LinkedList linkedList){
        Node curr = head;
        while (curr!=null){
            Node nextDistinctNode = curr.next;
            while (nextDistinctNode!=null && nextDistinctNode.value == curr.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            curr.next = nextDistinctNode;
            curr = nextDistinctNode;
        }
        return linkedList;
    }
    public static void removeKthNodeFromEnd(LinkedList linkedList, int k){
        int i=0;
        Node firstPointer = head;
        Node secondPointer = head;
        while (i <= k){
            secondPointer = secondPointer.next;
            i++;
        }
        if (secondPointer == null){
            head.value = head.next.value;
            head.next=head.next.next;
        }
        while (secondPointer.next != null){
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;
        }
        firstPointer.next = firstPointer.next.next;
    }
    public String toString(){
        StringBuilder result = new StringBuilder("{");
        Node curr = head;

        while (curr!=null){
            result.append(curr.toString()).append(",");
            curr = curr.next;

        }
        result.append("}");
        return result.toString();
    }
}
