package com.company.BinaryTree;

public class bstDemo {
    public static void main(String[] args) {
        myBinTree myBinTree = new myBinTree();
        myBinTree.insert(5);
        myBinTree.insert(6);
        myBinTree.insert(4);
        myBinTree.insert(7);
        System.out.println(myBinTree.search(4));
        myBinTree.delete(4);
        myBinTree.inOrder();
        System.out.println(com.company.BinaryTree.myBinTree.validateBst(myBinTree.root));
    }
}
