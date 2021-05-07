package com.company;

public class Node {
    public int value;
    public Node next;

    public Node (int data){
        this.value = data;
        this.next = null;
    }

    public String toString(){
        return "" + this.value;
    }

}
