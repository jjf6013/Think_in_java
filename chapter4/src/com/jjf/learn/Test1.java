package com.jjf.learn;

class MyClass{
    MyClass(){
        System.out.println("我的类！");
    }

    MyClass(String s){
        System.out.println(s);
    }
}

public class Test1 {
    public static void main(String[] args){
//        new MyClass();
//        new MyClass("过载的构建器");
//        MyClass[] myClasses = {new MyClass("元素1"),new MyClass("元素2")};
        MyClass[] myClasses = new MyClass[2];
        myClasses[0] = new MyClass("元素1");
        myClasses[1] = new MyClass("元素2");
    }
}
