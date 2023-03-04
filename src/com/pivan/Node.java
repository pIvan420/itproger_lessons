package com.pivan;

public class Node {
    private int value;
    private Node left, right;

    public int getValue(){
        return this.value;
    }

    public void setValue(final int value){
        this.value = value;
    }

    public Node getLeft(){
        return this.left;
    }
    public void setLeft(final Node left){
        this.left = left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setRight(final Node right){
        this.right = right;
    }

    @Override
    public String toString(){
        return "Node{" +
                "value=" + value +
                ", left=" + (left == null ? null : left.getValue()) +
                ", right=" + (right == null ? null : right.getValue()) +
                '}';
    }
}
