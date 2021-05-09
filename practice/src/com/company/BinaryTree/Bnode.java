package com.company.BinaryTree;

public class Bnode {
    Bnode left;
    Bnode right;
    int data;

    public Bnode(int data){
        this.data = data;
        left = right = null;
    }
}
