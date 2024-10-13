package com.jjf.learn;

class Poppet{}

public class BlankFinal {
    final int i = 0;
    final int j;//空白final必须初始化，现在没初始化
    final Poppet p;//空白final必须初始化，现在没初始化

    //在构建器中对上述空白final进行初始化
    BlankFinal(){
        j = 1;
        p = new Poppet();
    }

    BlankFinal(int i){
        j = i;
        p = new Poppet();
    }

    public static void main(String[] args){
        BlankFinal bf = new BlankFinal();
    }
}
