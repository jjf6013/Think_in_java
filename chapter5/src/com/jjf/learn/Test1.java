package com.jjf.learn;

class MyClass{
    protected Integer a = new Integer(7);

    public void f1(){
        System.out.println("我是方法1");
    }

    private void f2(){
        System.out.println("我是方法2");
    }

    protected void f3(){
        System.out.println("我是方法3");
    }

    void f4(){
        System.out.println("我是方法4");
    }
}

public class Test1 {
    public static void main(String[] args){
        MyClass mc = new MyClass();

        mc.f1();
        mc.f3();
        mc.f4();
    }
}
