package com.jjf.learn;

class Tag{
    Tag(int marker){
        System.out.println("Tag("+ marker +")");
    }
}

class Card{
    Tag t1 = new Tag(1);
    Card(){
        System.out.println("Tag()");
        t3 = new Tag(33);
    }

    Tag t2 = new Tag(2);

    void f(){
        System.out.println("f()");
    }

    Tag t3 = new Tag(3);
}

public class OrderOfInitialization {
    public static void main(String[] args){
        new Card().f();
    }
}
