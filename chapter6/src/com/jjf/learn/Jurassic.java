package com.jjf.learn;

class SmallBrain{}

final class Dinosaur{
    int i = 7, j = 1;
    SmallBrain x = new SmallBrain();

    void f(){}
}

//class bird extends Dinosaur{}//不能继承一个final类

public class Jurassic {
    public static void main(String[] args){
        Dinosaur a = new Dinosaur();
        a.i++;
        a.j = 40;
        a.f();
    }
}
