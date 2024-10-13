package com.jjf.learn;

class A{
    A(int i){
        System.out.println("A构建器"+i);
    }
}

class B{
    B(int i){
        System.out.println("B构建器"+i);
    }
}

class C extends A{
    C(int i){
        super(i);
    }
    B b = new B(4);
}

public class Test {
    public static void main(String[] args){
        new C(2);
    }
}
