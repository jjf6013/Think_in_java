package com.jjf.learn;

public class WhileTest {
    public static void main(String[] args){
        double r = 0;
        while(r < 0.99d){
            r = Math.random();
            System.out.println(r);
        }
    }
}
