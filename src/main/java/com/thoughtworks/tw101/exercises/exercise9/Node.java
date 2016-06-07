package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(nameOfNewNode.compareTo(name) < 0){
            if(left == null){
                left = new Node(nameOfNewNode);
            }else{
                left.add(nameOfNewNode);
            }
        }
        else if(nameOfNewNode.compareTo(name) > 0){
            if(right == null){
                right = new Node(nameOfNewNode);
            }else{
                right.add(nameOfNewNode);
            }
        }

    }

    public List<String> names() {
        List<String> list = new ArrayList<String>();
        if(left != null){ list.addAll( left.names() ); }
        list.add(name);
        if(right != null){ list.addAll( right.names() ); }
        return list;
    }
}
