package com.jjf.learn;

import java.util.*;

class Cat2{
    private int catNumber;
    Cat2(int i){
        catNumber = i;
    }
    void print(){
        System.out.println("Cat #" + catNumber);
    }
}

class Dog2{
    private int dogNumber;
    Dog2(int i){
        dogNumber = i;
    }
    void print(){
        System.out.println("Dog #" + dogNumber);
    }
}

public class CatsAndDogs2 {
    public static void main(String[] args){
        Vector cats = new Vector();
        for (int i = 0; i < 7; i++) cats.addElement(new Cat2(i));
        cats.addElement(new Dog2(7));
        Enumeration e = cats.elements();
        while(e.hasMoreElements()){
            ((Cat2)e.nextElement()).print();
        }
    }
}
