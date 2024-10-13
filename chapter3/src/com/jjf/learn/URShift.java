package com.jjf.learn;

public class URShift {
    public static void main(String[] args){
        int i = -1;
        i >>>= 10;
        prt(""+i);
        long l = -1;
        l >>>= 10;
        prt(""+l);
        short s = -1;
        l >>>= 10;
        prt(""+s);
        byte b = -1;
        l >>>= 10;
        prt(""+b);
    }

    static void prt(String S){
        System.out.println(S);
    }
}
