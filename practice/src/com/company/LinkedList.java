package com.company;

public class LinkedList {
    public Node head;
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
    public String toString(){
        String result = "{";
        Node curr = head;

        while (curr!=null){
            result += curr.toString() + ",";
            curr = curr.next;

        }
        result += "}";
        return result;
    }
}
