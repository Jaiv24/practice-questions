package com.company.BinaryTree;

public class myBinTree {
    public Bnode root;

    public myBinTree(){
        root = null;
    }

    public void insert(int data){
        Bnode newNode = new Bnode(data);
        if (root == null){
            root = newNode;
            return;
        }
        Bnode previous, current;
        previous = current = root;
        while(current != null){
            previous = current;
            if (data < current.data){
                current = current.left;
            }
            else{
                if (data > current.data){
                    current = current.right;
                }else
                    return;
            }
        }
        if (data < previous.data){
            previous.left = newNode;
        }
        else {
            previous.right = newNode;
        }
    }

    public boolean search(int key){
        if (root == null){
            return false;
        }
        Bnode current = root;
        while(current != null && key != current.data){
            if(key < current.data){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        if (current != null){
            return true;
        }
        return false;
    }
}
