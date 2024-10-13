package com.jjf.learn;

class Value{
    int i = 1;
}

public class FinalData {
    //可作为编译期常数
    final int i1 = 9;
    static final int I2 = 99;
    //典型公共常数
    public static final int I3 = 39;
    //不可作为编译期常数
    final int i4 = (int)(Math.random()*20);
    static final int i5 = (int)(Math.random()*20);

    Value v1 = new Value();
    final Value v2 = new Value();
    static final Value v3 = new Value();
//    final Value v4;//必须初始化才行

//    Arrays
    final int[] a = {1,2,3,4,5,6};
    public void print(String id){
        System.out.println(id + ":i4=" + i4 + ",i5=" + i5);
    }

    public static void main(String[] args){
        FinalData fd1 = new FinalData();
//        fd1.i1++;//报错，提示i1是final变量，不能给final变量赋值
        fd1.v2.i++;//成员不是常数
        fd1.v1 = new Value();//ok--not final

        for (int i = 0; i < fd1.a.length; i++){
            fd1.a[i]++;//成员不是常数
        }

//        fd1.v2 = new Value();//不能给final变量赋值
//        fd1.v3 = new Value();//不能给final变量赋值
//        fd1.a = new int[3];//不能给final变量赋值
        fd1.print("fd1");
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData();
        fd1.print("fd1");
        fd2.print("fd2");
    }
}
