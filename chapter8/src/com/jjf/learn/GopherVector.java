package com.jjf.learn;

import java.util.*;

class Gopher{
    private int gopherNumber;
    Gopher(int i){
        gopherNumber = i;
    }
    void print(String msg){
        if (msg != null) System.out.println(msg);
        System.out.println("Gopher #" + gopherNumber);
    }
}

class GopherTrap{
    static void caughtYa(Gopher g){
        g.print("抓住一个！");
    }
}

public class GopherVector {
    private Vector v = new Vector();

    public void addElement(Gopher m){
        v.addElement(m);
    }

    public Gopher elementAt(int index){
        return (Gopher)v.elementAt(index);
    }

    public int size(){
        return v.size();
    }

    public static void main(String[] args){
        GopherVector gophers = new GopherVector();
        for (int i = 0; i < 3; i++){
            gophers.addElement(new Gopher(i));
        }
        for (int i = 0; i < gophers.size(); i++){
            GopherTrap.caughtYa(gophers.elementAt(i));
        }
    }
}
