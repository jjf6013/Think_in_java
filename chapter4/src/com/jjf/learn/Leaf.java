package com.jjf.learn;

public class Leaf {
    private int i = 0;
    Leaf increment(){
        i++;
        System.out.println("999");
        return this;
    }

    void print(){
        System.out.println("i=" + i);
    }

    public static void main(String[] args){
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
