package com.jjf.learn;

public class Flower {
    private int petalCount = 0;
    private String a = new String("null");
    Flower(int petals){
        petalCount = petals;
        System.out.println("只用int类型参数的构建器，petalCount=" + petalCount);
    }

    Flower(String ss){
        System.out.println("只用String类型参数的构建器，s=" + ss);
        a = ss;
    }

    Flower(String s, int petals){
        this(petals);
//        this(s);//不能调两个
        this.a = s;
        System.out.println("使用int、String类型的构建器");
    }

    Flower(){
        this("hi",47);
        System.out.println("无参数的默认构建器");
    }

    void print(){
//        this(11);
        System.out.println("petalCount=" + petalCount + " s=" + a);
    }

    public static void main(String[] args){
        Flower f = new Flower();
        f.print();
    }
}
