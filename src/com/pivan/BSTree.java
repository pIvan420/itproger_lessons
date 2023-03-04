package com.pivan;

public class BSTree {
    private Node root;

    public BSTree(){
        this.root = null;
    }

    public void add(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        if(this.root == null){
            this.root = newNode;
        }
        else{
            Node curNode = this.root;
            Node parNode;
            while(true){
                parNode = curNode;
                if(value == curNode.getValue()){
                    return;
                }
                else if(value < curNode.getValue()){
                    curNode = curNode.getLeft();
                    if(curNode == null){
                        parNode.setLeft(newNode);
                        return;
                    }
                }
                else{
                    curNode = curNode.getRight();
                    if(curNode == null){
                        parNode.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public Node get(int values){
        Node curNode = root;
        while(curNode.getValue() != values){
            if(curNode.getValue() < values){
                curNode = curNode.getRight();
            }
            else if(curNode.getValue() > values){
                curNode = curNode.getLeft();
            }
            if(curNode == null){
                return null;
            }
        }
        return curNode;
    }
}
