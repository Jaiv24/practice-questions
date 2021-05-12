package com.company.BinaryTree;

import java.util.ArrayList;

public class FindSuccessor {
    public Bnode findSuccessor(Bnode tree, Bnode node){
        ArrayList<Bnode> inOrder = new ArrayList<Bnode>();
        getInOrder(tree, inOrder);
        for (int i=0; i<inOrder.size(); i++){
            Bnode currentNode = inOrder.get(i);
            if (currentNode != node){
                continue;
            }

            if (i == inOrder.size()-1){
                return null;
            }
            return inOrder.get(i+1);
        }
        return null;
    }


    private void getInOrder(Bnode node, ArrayList<Bnode> order) {
        if (node  == null){
            return;
        }
        getInOrder(node.left, order);
        order.add(node);
        getInOrder(node.right, order);
    }
}
