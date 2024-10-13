package com.jjf.learn;

class Insect{
    int i = 9, j;
    Insect(){
        prt("i=" + i + ",j=" + j);
        j = 39;
    }

    static int x1 = prt("static Insect.x1 initialized");

    static int prt(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    static int prt(String a){
        System.out.println(a);
        return 63;
    }

    int k = prt("Beetle.k initialized");

    Beetle(){
        prt("k=" + k);
        prt("j=" + j);
    }

    static int x2 = prt("static Beetle.x2 initialized");

    public static void main(String[] args){
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }
}
