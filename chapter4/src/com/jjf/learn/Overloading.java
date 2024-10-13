package com.jjf.learn;

public class Overloading {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("过载");
        }
        new Tree();
    }
}


class Tree{
    static void prt(String s){
        System.out.println(s);
    }

    int height;
    Tree(){
        prt("Planting a seedling");
        height = 0;
    }

    Tree(int i){
        prt("Creating new Tree that is " + i + " feet tall");
        height = i;
    }

    void info(){
        prt("Tree is" + height + " feet tall");
    }

    void info(String s){
        prt(s + ": Tree is" + height + " feet tall");
    }
}
