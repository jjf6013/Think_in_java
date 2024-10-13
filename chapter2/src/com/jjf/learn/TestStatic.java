package com.jjf.learn;

class StaticTest {
    static int a = 7;
}

class StaticFun {
    static int fun(){
        int b = StaticTest.a+1;
        return b;
    }
}

public class TestStatic {
    public static void main(String[] args){
//        System.out.println(StaticTest.a);//直接用类调用静态变量
//        System.out.println(StaticFun.fun());//直接用类调用静态方法
        //下面用对象示例调用静态变量及静态方法
        StaticTest x = new StaticTest();
        System.out.println(x.a);
        StaticFun y = new StaticFun();
        System.out.println(y.fun());
    }
}
