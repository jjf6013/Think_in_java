package com.jjf.learn;

class Mug{
    Mug(int marker){
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mugs(){
        System.out.println("Mugs()");
    }

    Mug m1,m2;

    {
        m1 = new Mug(1);
        m2 = new Mug(2);
        System.out.println("m1 & m2 initialized");
    }

    public static void main(String[] args){
        System.out.println("Inside main()");
        Mugs x = new Mugs();
    }
}
