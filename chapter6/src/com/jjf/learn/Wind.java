package com.jjf.learn;

class Instrument{
    public void play(){
        System.out.println("hello");
    }
    static void tune(Instrument i){
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args){
        Wind w = new Wind();
        Instrument.tune(w);//上溯造型
        w.tune(w);
    }
}
