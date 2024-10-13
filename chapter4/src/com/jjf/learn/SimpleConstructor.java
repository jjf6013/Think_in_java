package com.jjf.learn;

public class SimpleConstructor {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            new Rock(i);
        }
    }
}

class Rock{
    Rock(int a){//这是一个构建器
        System.out.println("Creating Rock" + a);
    }
}
