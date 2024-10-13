package com.jjf.learn;

public class VowelsAndConsoants {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            char c = (char)(Math.random() * 26 + 'a');
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(c + "是元音");
                    break;
                case 'y':
                case 'w':
                    System.out.println(c + "有时是元音");
                    break;
                    default:
                        System.out.println(c + "是辅音");
            }
        }
    }
}
