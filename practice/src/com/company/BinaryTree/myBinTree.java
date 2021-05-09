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
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Bnode current) {
        if (current != null){
            inOrderRec(current.left);
            System.out.print(" "+current.data);
            inOrderRec(current.right);
        }
    }
    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(Bnode current) {
        if (current!=null){
            System.out.print(" "+current.data);
            preOrderRec(current.left);
            preOrderRec(current.right);
        }
    }
    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(Bnode current) {
        if (current!=null){
            postOrderRec(current.left);
            postOrderRec(current.right);
            System.out.print(" "+ current.data);
        }
    }
    public void delete(int data){
        root = deleteHelper(root, data);
    }

    private Bnode deleteHelper(Bnode root, int data) {
        if (root == null){
            return root;
        }
        if (data < root.data){
            root.left = deleteHelper(root.left, data);
        }
        if (data > root.data){
            root.right = deleteHelper(root.right, data);
        }
        if(data == root.data){
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;

            Bnode successor = root.right;
            while (successor != null){
                successor = successor.left;
            }
            root.data = successor.data;
            root.right = deleteHelper(root.right, successor.data);
        }
        return root;
    }
}
