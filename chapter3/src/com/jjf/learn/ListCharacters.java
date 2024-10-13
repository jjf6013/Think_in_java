package com.jjf.learn;

public class ListCharacters {
    public static void main(String[] args){
        for (char c = 0;c < 128;c++){
            if (c != 26){
                System.out.println("序号：" + (int)c + " 字符：" + c);
            }
        }
    }
}
